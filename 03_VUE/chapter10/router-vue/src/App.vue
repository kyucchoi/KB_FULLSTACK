<script setup></script>

<template>
  <div>
    <nav>
      <router-link to="/">홈페이지</router-link>
      <!-- 한칸 띄우기 -->
      &nbsp;
      <router-link to="/about">라우터란??!!</router-link>
    </nav>
    <RouterView />
  </div>
</template>
