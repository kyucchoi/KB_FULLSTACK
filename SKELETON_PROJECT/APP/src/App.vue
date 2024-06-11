<script setup>
import { RouterLink, RouterView } from 'vue-router';
import Footer from '@/components/Footer.vue';
</script>

<template>
  <div>
    <RouterView />
    <Footer class="footer" />
  </div>
</template>

<style scoped>
.footer {
  position: absolute;
  bottom: 0;
  left: 0;
  right: 0;
  border-bottom-left-radius: 39px;
  border-bottom-right-radius: 39px;
}
</style>
