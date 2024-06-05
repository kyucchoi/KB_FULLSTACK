<template>
  <div>
    <h1>Date</h1>
    <h1>오늘은 {{ dateMsg }} 입니다</h1>
    <button @click="getYear">년도 출력</button>
    <button @click="getMonth">월 출력</button>
    <button @click="getDate">일 출력</button>
  </div>
</template>

<script setup>
import { computed } from 'vue';
import { useDateStore } from '@/stores/date';

const dateStore = useDateStore();
const dateMsg = computed(() => dateStore.dateMsg);

// const { getYear } = dateStore;
// const { getMonth } = dateStore;
// const { getDay } = dateStore;

//갓준수님이 가르쳐준 방법: 위에 방법보다 깔끔함
const { getYear, getMonth, getDate } = dateStore;
</script>
