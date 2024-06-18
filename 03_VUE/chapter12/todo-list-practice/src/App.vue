<script setup>
import axios from 'axios';
import { reactive, ref } from 'vue';

const states = reactive({
  todoList: [],
});

const todo = ref('');

const BASEURL = '/api/todos';

async function addTodo() {
  if (todo.value === '') return alert('할 일을 입력해주세요');

  try {
    const addTodoRes = await axios.post(BASEURL, {
      todo: todo.value,
      done: false,
    });
    console.log(addTodoRes);
    if (addTodoRes.status !== 201) return alert('Todo 추가 실패!');

    todo.value = '';
    fetchTodoList();
  } catch (error) {
    alert('TodoList 추가 작업 중, ERROR 발생!');
    console.log(error);
  }
}

async function fetchTodoList() {
  try {
    const getTodoRes = await axios.get(BASEURL);

    console.log(getTodoRes.data);
    states.todoList = getTodoRes.data;
  } catch (error) {
    alert('TodoList 데이터 통신 ERROR 발생');
    console.log(error);
  }
}

fetchTodoList();
</script>

<template>
  <main>
    <div>
      <h1>TodoList</h1>
    </div>
    <div>
      <input type="text" v-model.trim="todo" placeholder="입력해주세요" />
      <!-- <input type="date" v-model="userDate" /> -->
      <button @click="addTodo">추가</button>
    </div>
    <ol>
      <li v-for="todoItem in states.todoList" :key="todoItem.id">
        <span
          :style="
            todoItem.done
              ? { textDecoration: 'line-trough' }
              : { textDecoration: 'none' }
          "
        >
          {{ todoItem.todo }} {{ todoItem.done ? '(완료)' : '' }}</span
        >
      </li>
    </ol>
  </main>
</template>

<style scoped></style>
