<template>
  <div>
    <!-- <h1>{{ siteData.siteName }}</h1> -->
    <!-- <a href="{{ siteData.siteUrl }}">{{ siteData.siteName }} 링크</a> -->
    <!-- <a v-bind:href="siteData.siteUrl">{{ siteData.siteName }} 링크</a> -->
    <!-- <h2>방문 여부 : {{ siteData.visited }}</h2> -->
    <h1>{{ siteInfo.siteName }}</h1>
    <a v-bind:href="siteInfo.siteUrl">{{ siteInfo.siteName }} 링크</a>
    <h2>방문 여부 : {{ siteInfo.visited }}</h2>
    <hr />
  </div>
</template>

<script>
// export default {
//   name: 'PropsList2',
//   data() {
//     return {
//       siteData: {
//         siteName: '페이스북',
//         siteUrl: 'http://facebook.com',
//         visited: '방문',
//       },
//     };
//   },
// };

export default {
  name: 'PropsList2',
  props: ['siteInfo'],
};
</script>

<style lang="scss" scoped></style>
