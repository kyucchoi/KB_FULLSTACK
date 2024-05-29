<template>
  <div>
    <FancyPhotoBoxAnswer>
      <template v-slot:title>
        <h1>카리나</h1>
      </template>

      <template v-slot:photo>
        <img
          src="https://encrypted-tbn0.gstatic.com/licensed-image?q=tbn:ANd9GcSlqn7722LYSvumEMA0PiCz0MJOzinKyhZdC6-M3DyKW8qEplQadC5vxW6rShY3RZabBsD4IXCLHHCAj7s"
          alt="카리나"
        />
      </template>
    </FancyPhotoBoxAnswer>
  </div>
</template>

<script>
import FancyPhotoBoxAnswer from './FancyPhotoBoxAnswer.vue';

export default {
  name: 'ParentFancyPhotoBoxAnswer',
  components: { FancyPhotoBoxAnswer },
};
</script>

<style lang="scss" scoped></style>
