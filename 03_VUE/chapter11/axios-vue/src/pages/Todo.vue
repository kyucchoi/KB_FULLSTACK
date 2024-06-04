<template>
  <div>
    <h1>Todo List</h1>
    <!-- 입력 파트 -->
    <div>
      <input type="text" v-model.trim="todo" />
      <button @click="addTodo">추가</button>
    </div>
    <br />
    <!-- 리스트 파트 -->
    <ol>
      <!-- 투두 항목 -->
      <li v-for="todoItem in states.todoList" :key="todoItem.id">
        <span
          v-bind:style="
            todoItem.done
              ? { textDecoration: 'Line-through' }
              : { textDecoration: 'none' }
          "
          @click="toggleTodo(todoItem.id)"
        >
          {{ todoItem.todo }} {{ todoItem.done ? '(완료)' : '' }}
        </span>
        <!-- 수정 모드 -->
        <div v-if="todoItem.editing">
          <input type="text" v-model.trim="todoEdit" />
          <button @click.stop="confirmEditTodo(todoItem.id)">확인</button>
          /
          <button @click.stop="cancelEditTodo(todoItem.id)">취소</button>
        </div>
        &nbsp;
        <span v-if="!todoItem.editing">
          <button @click.stop="editTodo(todoItem.id)">수정</button>
          /
          <button @click.stop="deleteTodo(todoItem.id)">삭제</button>
        </span>
      </li>
    </ol>
  </div>
</template>

<script setup>
import axios from 'axios';
import { ref, reactive } from 'vue';

const states = reactive({
  todoList: [],
});
const todo = ref('');
const todoEdit = ref('');

// localhost:3000
const BASEURL = '/api/todos';

async function fetchTodoList() {
  try {
    const fetchTodoRes = await axios.get(BASEURL);

    states.todoList = fetchTodoRes.data;
    console.log(states.todoList);
  } catch (e) {
    alert('TodoList 데이터 통신 에러 발생');
    console.log(e);
  }
}

async function addTodo() {
  if (todo.value === '') return alert('할 일을 입력해주세요!');

  try {
    const newTodo = { todo: todo.value, done: false };
    const addTodoRes = await axios.post(BASEURL, newTodo);

    if (addTodoRes.status !== 201) return alert('Todo 추가 실패!');

    todo.value = '';
    fetchTodoList();
  } catch (e) {
    alert('TodoList 추가 작업 중, ERROR 발생!');
    console.log(e);
  }
}

async function deleteTodo(id) {
  try {
    const deleteTodoRes = await axios.delete(BASEURL + `/${id}`);

    if (deleteTodoRes.status !== 200) return alert('Todo 삭제 실패!');

    fetchTodoList();
  } catch (e) {
    alert('TodoList 삭제 작업 중, ERROR 발생!');
  }
}

async function toggleTodo(id) {
  try {
    const targetTodo = states.todoList.find((todo) => todo.id === id);
    const payload = { ...targetTodo, done: !targetTodo.done };

    const toggleTodoRes = await axios.put(BASEURL + `/${id}`, payload);

    if (toggleTodoRes.status !== 200) return alert('Todo toggle 실패');

    fetchTodoList();
  } catch (e) {
    alert('TodoList 토글 작업 중, ERROR 발생!');
    console.log(e);
  }
}

function editTodo(id) {
  const targetTodo = states.todoList.find((todo) => todo.id === id);
  targetTodo.editing = true;
}

function cancelEditTodo(id) {
  const targetTodo = states.todoList.find((todo) => todo.id === id);
  targetTodo.editing = false;
}

async function confirmEditTodo(id) {
  if (todoEdit.value === '') return alert('수정 내용을 입력하세요!');

  try {
    const targetTodo = states.todoList.find((todo) => todo.id === id);
    const payload = { ...targetTodo, todo: todoEdit.value, editing: false };

    const editTodoRes = await axios.put(BASEURL + `/${id}`, payload);

    if (editTodoRes.status !== 200) return alert('수정 실패!');

    todoEdit.value = '';

    fetchTodoList();
  } catch (e) {
    alert('수정 작업 중 ERROR 발생!');
    console.log(e);
  }
}

fetchTodoList();
</script>
