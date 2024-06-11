<template>
  <div id="app">
    <nav>
      <router-link to="/">HOME</router-link>
      &nbsp;
      <router-link to="/calendarPage">CALENDAR</router-link>
    </nav>
    <router-view />
  </div>
</template>

<script>
export default {
  name: 'App',
};
</script>

<style></style>
