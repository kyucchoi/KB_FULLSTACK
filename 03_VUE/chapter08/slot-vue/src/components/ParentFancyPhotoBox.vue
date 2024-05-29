<template>
  <div>
    <FancyPhotoBox>
      <template v-slot:title> <h1>파묘</h1></template>
      <template v-slot:photo>
        <img
          src="https://health.chosun.com/site/data/img_dir/2024/03/12/2024031202120_0.jpg"
          alt="파묘"
        />
      </template>
    </FancyPhotoBox>
  </div>
</template>

<script>
import FancyPhotoBox from './FancyPhotoBox.vue';

export default {
  name: 'ParentFancyPhotoBox',
  components: { FancyPhotoBox },
};
</script>

<style lang="scss" scoped></style>
