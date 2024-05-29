<template>
  <div class="wrapper">
    <header class="box title">
      <slot name="title"></slot>
    </header>
    <section class="box photo">
      <slot name="photo"></slot>
    </section>
  </div>
</template>

<script>
export default {
  name: 'FancyPhotoBox',
};
</script>

<style>
.wrapper {
  color: orange;
}
</style>
