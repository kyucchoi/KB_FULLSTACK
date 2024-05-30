<template>
  <div>
    <h1>{{ resultMsg }}</h1>
    <ChildComponent :parentNum="parentNum" @send-result="resultHandler" />
  </div>
</template>

<script setup>
import { ref } from 'vue';
import ChildComponent from './components/ChildComponent.vue';

const resultMsg = ref('랜덤 숫자를 맞춰보세요!');
const randNum = ref(parseInt(Math.random() * 20));

function emitHandler(value) {
  num.value = value;
}
</script>

<style></style>
