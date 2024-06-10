<template>
  <!-- 캘린더 페이지 컴포넌트 -->
  <div class="calendar-page">
    <!-- 페이지 제목 -->
    <h1>Calendar Page</h1>
    <!-- 캘린더 컴포넌트 -->
    <Calendar @date-selected="handleDateSelected" />
    <!-- 선택된 날짜가 있을 경우에만 아이템 목록 표시 -->
    <div v-if="selectedDate">
      <!-- 선택된 날짜 표시 -->
      <h2>{{ selectedDate.toLocaleDateString('ko-KR') }}</h2>
      <!-- 아이템 목록 표시 -->
      <ul class="item-list">
        <!-- 아이템 반복 표시 -->
        <li v-for="item in filteredItems" :key="item.id">
          <!-- 아이템 텍스트 표시 -->
          <span>{{ item.text }}</span>
          <!-- 아이템 가격 표시 -->
          <span class="item-price">{{ item.price }}원</span>
        </li>
      </ul>
    </div>
  </div>
</template>

<script>
import Calendar from '../components/Calendar.vue';

export default {
  name: 'CalendarPage',
  components: {
    Calendar,
  },
  data() {
    return {
      // 선택된 날짜 초기화
      selectedDate: null,
      // 아이템 목록 초기화
      items: [
        { id: 1, date: new Date('2024-06-10'), text: '쇼핑', price: -29900 },
        { id: 2, date: new Date('2024-06-10'), text: '영화관', price: -15000 },
        {
          id: 3,
          date: new Date('2024-06-11'),
          text: '네이버 결제',
          price: -19000,
        },
      ],
    };
  },
  computed: {
    // 선택된 날짜에 해당하는 아이템만 필터링하여 반환
    filteredItems() {
      if (!this.selectedDate) return [];
      return this.items.filter(
        (item) => item.date.toDateString() === this.selectedDate.toDateString()
      );
    },
  },
  methods: {
    // 캘린더에서 날짜 선택 시 호출되는 메서드
    handleDateSelected(date) {
      // 선택된 날짜 업데이트
      this.selectedDate = date;
    },
  },
};
</script>

<style scoped>
.calendar-page {
  text-align: center; /* 페이지 내 요소들 가운데 정렬 */
}

.item-list {
  list-style: none; /* 목록 기호 제거 */
  padding: 0; /* 목록 여백 제거 */
}

.item-price {
  margin-left: 10px; /* 아이템 가격과의 간격 조정 */
}
</style>
