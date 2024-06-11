<template>
  <nav class="navbar navbar-expand-lg navbar-dark bg-white border-top">
    <div class="container-fluid">
      <div class="navbar-nav d-flex justify-content-around w-100">
        <router-link
          :to="{ name: 'category' }"
          class="nav-link d-flex flex-column align-items-center"
        >
          <img :src="CategoryIcon" alt="categoryicon" />
        </router-link>
        <router-link
          :to="{ name: 'home' }"
          class="nav-link d-flex flex-column align-items-center"
        >
          <div class="home-circle">
            <img :src="HomeIcon" alt="homeicon" />
          </div>
        </router-link>
        <router-link
          :to="{ name: 'profile' }"
          class="nav-link d-flex flex-column align-items-center"
        >
          <img :src="ProfileIcon" alt="profileicon" />
        </router-link>
      </div>
    </div>
  </nav>
</template>

<script setup>
import HomeIcon from '@/assets/house-door-fill.svg';
import CategoryIcon from '@/assets/pie-chart-fill.svg';
import ProfileIcon from '@/assets/person-fill.svg';
</script>

<style>
.navbar {
  height: 82px;
}
.home-circle {
  width: 50px;
  height: 50px;
  border-radius: 50%;
  background: linear-gradient(
    45deg,
    rgba(19, 63, 219, 0.5),
    rgba(183, 0, 77, 0.4)
  );
  display: flex;
  align-items: center;
  justify-content: center;
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
}
</style>
