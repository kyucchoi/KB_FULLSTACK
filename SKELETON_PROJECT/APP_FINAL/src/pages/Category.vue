<template>
  <div>
    <div class="title">가장 많은 지출을 한 카테고리는</div>
    <div class="title"><span class="emphasis">식비</span>입니다!</div>

    <!-- <Doughnut :chart-data="chartData" :options="chartOptions" /> -->

    <ul class="categoryList">
      <li v-for="expenses in expensesArray" :key="expenses.id">
        <span class="circle" :style="{ backgroundColor: expenses.color }"
          >%</span
        >
        <span class="categoryName categoryText">{{ expenses.category }}</span>
        <span class="categoryText">{{ expenses.amount }}</span>
      </li>
    </ul>
  </div>
</template>

<script setup>
// import { Doughnut } from 'vue-chartjs';
// import { Chart as ChartJS, Title, Tooltip, Legend, ArcElement } from 'chart.js';
import { ref, reactive, computed } from 'vue';
import { useAccountBookStore } from '@/stores/accountBook.js';
import totalExpenses from '@/components/TotalExpenses.vue';

const accountBookStore = useAccountBookStore();
const { fetchExpenseData } = accountBookStore;

fetchExpenseData();

const foodExpenses = computed(() =>
  accountBookStore.accountBookExpenses
    .filter((item) => item.category === '식비')
    .reduce((acc, cur) => (acc += cur.amount), 0)
);

const transportationExpenses = computed(() =>
  accountBookStore.accountBookExpenses
    .filter((item) => item.category === '교통비')
    .reduce((acc, cur) => (acc += cur.amount), 0)
);

const savingsExpenses = computed(() =>
  accountBookStore.accountBookExpenses
    .filter((item) => item.category === '적금')
    .reduce((acc, cur) => (acc += cur.amount), 0)
);

const shoppingExpenses = computed(() =>
  accountBookStore.accountBookExpenses
    .filter((item) => item.category === '쇼핑')
    .reduce((acc, cur) => (acc += cur.amount), 0)
);

const transferExpenses = computed(() =>
  accountBookStore.accountBookExpenses
    .filter((item) => item.category === '이체')
    .reduce((acc, cur) => (acc += cur.amount), 0)
);

const expensesArray = [
  { category: '식비', amount: foodExpenses, color: '#e982ad' },
  { category: '교통비', amount: transportationExpenses, color: ' #ffe70e' },
  { category: '적금', amount: savingsExpenses, color: '#e39012' },
  { category: '쇼핑', amount: shoppingExpenses, color: '#7c4ceb' },
  { category: '이체', amount: transferExpenses, color: '#a0e312' },
];

console.log(totalExpenses.totalExpenses);
// ChartJS.register(Title, Tooltip, Legend, ArcElement);

// const chartData = ref({
//   labels: ['Red', 'Blue', 'Yellow'],
//   datasets: [
//     {
//       backgroundColor: ['#FF6384', '#36A2EB', '#FFCE56'],
//       data: [30, 50, 20],
//     },
//   ],
// });

// const chartOptions = ref({
//   responsive: true,
//   maintainAspectRatio: false,
// });
</script>

<style>
.title {
  font-family: Inter;
  font-style: normal;
  font-weight: 600;
  font-size: 20px;
  color: #504e64;
  margin: 8px 0px;
}

.emphasis {
  font-weight: 700;
  font-size: 25px;
  color: #0dc9b9;
}

.categoryList {
  list-style: none;
  padding: 0;
  margin: 20px 0 0 0;
  width: 100%;
  text-align: left;
}

.categoryList li {
  display: flex;
  justify-content: space-between;
  align-items: center;
  margin: 14px 0;
}

.circle {
  display: inline-block;
  width: 45px;
  height: 45px;
  border-radius: 50%;
  margin-right: 10px;
  color: white;
  display: flex;
  justify-content: center;
  align-items: center;
}

.categoryName {
  flex-grow: 1;
  padding-left: 10px;
}

.categoryText {
  font-size: 18px;
  color: #504e64;
}
</style>
