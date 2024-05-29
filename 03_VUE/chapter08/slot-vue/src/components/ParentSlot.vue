<template>
  <div>
    <ChildSlot>
      <h1>테스트, 너는 잘 가니??</h1>
      <img
        src="https://dimg.donga.com/wps/NEWS/IMAGE/2023/05/12/119255016.1.jpg"
        alt="고양이"
      />
    </ChildSlot>
  </div>
</template>

<script>
import ChildSlot from './ChildSlot.vue';

export default {
  name: 'ParentSlot',
  components: { ChildSlot },
};
</script>

<style lang="scss" scoped></style>
