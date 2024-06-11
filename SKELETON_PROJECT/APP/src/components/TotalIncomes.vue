<template>
  <div class="incomes-summary" v-if="totalIncomes !== null">
    <h3>총 수입 금액: {{ totalIncomes }}원</h3>
  </div>
</template>

<script setup>
import { ref, onMounted } from 'vue';
import axios from 'axios';

const totalIncomes = ref(null);

const fetchIncomes = async () => {
  try {
    const response = await axios.get('http://localhost:3000/income');
    totalIncomes.value = response.data.reduce(
      (acc, income) => acc + income.amount,
      0
    );
  } catch (error) {
    console.error('수입 데이터를 가져오는 중 오류가 발생했습니다:', error);
  }
};

onMounted(() => {
  fetchIncomes();
});
</script>

<style scoped>
.incomes-summary {
  display: flex;
  justify-content: center;
  font-size: 18px;
  font-weight: bold;
  color: #333;
  margin-top: 20px;
}
</style>
