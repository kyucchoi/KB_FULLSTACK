<script setup>
import ColorEmit from './components/ColorEmit.vue';
</script>

<style></style>

<template>
  <div :style="{ backgroundColor: color }">
    <h1>저의 색상을 정해주세요!!</h1>
    <ColorEmit v-on:colorChange="colorChangeHandler" />
  </div>
</template>

<script>
export default {
  name: 'App',
  data() {
    return {
      color: '',
    };
  },
  methods: {
    colorChangeHandler(e) {
      this.color = e.color;
    },
  },
};
</script>

<style scoped></style>
