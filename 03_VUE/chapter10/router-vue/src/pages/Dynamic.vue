<template>
  <div>
    <h1>오늘의 기분은? {{ msg }}</h1>
    <img :src="imgSrc" :alt="msg" />
  </div>
</template>

<script setup>
import { ref, computed, watch } from 'vue';
import { useRoute } from 'vue-router';

const currentRoute = useRoute();
const mood = ref(currentRoute.params.mood);

watch(
  () => currentRoute.params.mood,
  (newMood) => (mood.value = newMood)
);

const msg = computed(() =>
  mood.value === 'happy' ? '행복합니다' : '신납니다~!'
);

const imgSrc = computed(() =>
  mood.value === 'happy'
    ? 'https://velog.velcdn.com/images/tnfls99/post/07dce2b7-ddb8-48dc-b646-c773e33032c2/image.jpeg'
    : 'https://item.kakaocdn.net/do/f4981f53ef34a7b597e38214b56d56f79f5287469802eca457586a25a096fd31'
);
</script>
