import { ref } from 'vue';
import { defineStore } from 'pinia';

export const useDateStore = defineStore('date', () => {
  const date = new Date();
  const dateMsg = ref('');

  function getYear() {
    // dateMsg.value = date.getFullYear();
    dateMsg.value = `${date.getFullYear()}년`;
  }
  function getMonth() {
    // dateMsg.value = date.getMonth() + 1;
    dateMsg.value = `${date.getMonth() + 1}월`;
  }
  function getDate() {
    dateMsg.value = date.getDate() + '일';

    // 이게 더 깔끔함
    // dateMsg.value = `${date.getDate()}일`;
  }

  return { dateMsg, getYear, getMonth, getDate };
});
