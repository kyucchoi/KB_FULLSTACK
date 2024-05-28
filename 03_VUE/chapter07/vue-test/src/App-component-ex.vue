<script setup>
import PropsList from './components/PropsList.vue';
import PropsList2 from './components/PropsList2.vue';
PropsList2;
PropsList;
</script>

<style></style>

<template>
  <div>
    <PropsList
      siteName="네이버"
      siteUrl="https://www.naver.com/"
      visited="방문"
    />
    <PropsList
      siteName="다음"
      siteUrl="https://www.daum.net/"
      visited="미방문"
    />
    <!-- <PropsList2 /> -->

    <PropsList2 :siteInfo="siteData" />
  </div>
</template>

<script>
export default {
  name: 'App',
  data() {
    return {
      siteData: {
        siteName: '페이스북',
        siteUrl: 'http://facebook.com',
        visited: '방문',
      },
    };
  },
};
</script>

<style scoped></style>
