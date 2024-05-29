<script setup>
import ParentScopedSlot from './components/ParentScopedSlot.vue';
</script>

<template>
  <ParentScopedSlot />
</template>

<script>
export default {
  name: 'App',
  components: ParentScopedSlot,
};
</script>

<style scoped></style>
