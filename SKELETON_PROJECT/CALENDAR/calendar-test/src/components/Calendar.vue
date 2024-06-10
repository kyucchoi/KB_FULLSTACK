<template>
  <div class="calendar">
    <!-- 달력 헤더 -->
    <div class="calendar-header">
      <!-- 이전 달로 이동하는 버튼 -->
      <button @click="prevMonth">&lt;</button>
      <!-- 현재 월과 년도 표시 -->
      <span>{{ currentMonthYear }}</span>
      <!-- 다음 달로 이동하는 버튼 -->
      <button @click="nextMonth">&gt;</button>
    </div>
    <!-- 달력 본문 -->
    <div class="calendar-body">
      <!-- 요일 표시 -->
      <div class="calendar-day" v-for="day in daysOfWeek" :key="day">
        {{ day }}
      </div>
      <!-- 각 날짜 표시 -->
      <div
        class="calendar-date"
        v-for="date in dates"
        :key="date.date"
        :class="{ 'not-current-month': !date.currentMonth }"
        @click="selectDate(date)"
      >
        {{ date.date.getDate() }}
      </div>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      currentDate: new Date(),
    };
  },
  computed: {
    currentMonthYear() {
      return this.currentDate.toLocaleDateString('ko-KR', {
        month: 'long',
        year: 'numeric',
      });
    },
    daysOfWeek() {
      return ['일', '월', '화', '수', '목', '금', '토'];
    },
    dates() {
      const year = this.currentDate.getFullYear();
      const month = this.currentDate.getMonth();
      const firstDayOfMonth = new Date(year, month, 1).getDay();
      const lastDateOfMonth = new Date(year, month + 1, 0).getDate();
      const lastDayOfLastMonth = new Date(year, month, 0).getDate();

      const dates = [];
      // 이전 달의 마지막 날짜 추가
      for (let i = firstDayOfMonth - 1; i >= 0; i--) {
        dates.push({
          date: new Date(year, month - 1, lastDayOfLastMonth - i),
          currentMonth: false,
        });
      }
      // 현재 달의 날짜 추가
      for (let i = 1; i <= lastDateOfMonth; i++) {
        dates.push({
          date: new Date(year, month, i),
          currentMonth: true,
        });
      }
      // 다음 달의 처음 날짜 추가
      const nextMonthDates = 42 - dates.length;
      for (let i = 1; i <= nextMonthDates; i++) {
        dates.push({
          date: new Date(year, month + 1, i),
          currentMonth: false,
        });
      }
      return dates;
    },
  },
  methods: {
    // 이전 달로 이동
    prevMonth() {
      this.currentDate.setMonth(this.currentDate.getMonth() - 1);
      this.currentDate = new Date(this.currentDate);
    },
    // 다음 달로 이동
    nextMonth() {
      this.currentDate.setMonth(this.currentDate.getMonth() + 1);
      this.currentDate = new Date(this.currentDate);
    },
    // 날짜 선택 시 이벤트 처리
    selectDate(date) {
      this.$emit('date-selected', date.date);
    },
  },
};
</script>

<style scoped>
.calendar {
  width: 300px;
  margin: 0 auto;
  border: 1px solid #ddd;
  border-radius: 8px;
  overflow: hidden;
}
.calendar-header {
  display: flex;
  justify-content: space-between;
  align-items: center;
  background: #f4f4f4;
  padding: 10px;
}
.calendar-body {
  display: flex;
  flex-wrap: wrap;
}
.calendar-day,
.calendar-date {
  width: calc(100% / 7);
  text-align: center;
  padding: 10px 0;
  cursor: pointer;
}
.calendar-date.not-current-month {
  color: #ccc;
}
</style>
