<template>
  <div>
    <h1>{{ msg }}</h1>
    <ChildComponentAnswer :rand="rand" @send-msg="changeMsg" />
  </div>
</template>

<script setup>
import { ref } from 'vue';
import ChildComponentAnswer from './components/ChildComponentAnswer.vue';

const msg = ref('랜덤 숫자를 맞춰주세요~!');
const rand = ref(parseInt(Math.random() * 20));

function changeMsg(payload) {
  msg.value = payload;
}
</script>

<style></style>
