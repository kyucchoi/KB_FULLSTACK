<template>
  <div>
    <h1>Count: {{ count }}</h1>
    <h1>두배로! {{ double }}</h1>
    <button @click="increment">+1</button>
    <button @click="decrement">-1</button>
    <h1>지금까지 계산한 횟수: {{ countClicked }}</h1>
  </div>
</template>

<script setup>
import { ref, computed } from 'vue';

const count = ref(2);
const countClicked = ref(0);
const double = computed(() => count.value * 2);

function increment() {
  count.value++;
  countClicked.value++;
}
function decrement() {
  count.value--;
  countClicked.value++;
}
</script>

<style></style>
