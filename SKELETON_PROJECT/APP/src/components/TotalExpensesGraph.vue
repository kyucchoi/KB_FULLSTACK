<template>
  <div class="expenses-summary" v-if="totalExpenses !== null">
    <h3>{{ totalExpenses }}</h3>
  </div>
</template>

<script setup>
import { ref, onMounted } from 'vue';
import axios from 'axios';

const totalExpenses = ref(null);

const fetchExpenses = async () => {
  try {
    const response = await axios.get('http://localhost:3000/expenses');
    totalExpenses.value = response.data.reduce(
      (acc, expense) => acc + expense.amount,
      0
    );
  } catch (error) {
    console.error('지출 데이터를 가져오는 중 오류가 발생했습니다:', error);
  }
};

onMounted(() => {
  fetchExpenses();
});
</script>

<style scoped>
.expenses-summary {
  display: flex;
  justify-content: center;
  font-size: 18px;
  font-weight: bold;
  color: #333;
  margin-top: 20px;
}
</style>
