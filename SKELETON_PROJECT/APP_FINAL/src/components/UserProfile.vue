<template>
  <div class="profile-panel" v-if="user">
    <img :src="user.profilePicture" alt="Profile Image" class="profile-image" />
    <div class="profile-info">
      <h3>안녕하세요</h3>
      <h2 class="profile-name">{{ user.name }}님</h2>
    </div>
  </div>
</template>
<script setup>
import { ref, onMounted } from 'vue';
import axios from 'axios';
const user = ref(null);
const fetchUser = async () => {
  try {
    const response = await axios.get('http://localhost:3000/users/1');
    user.value = response.data;
  } catch (error) {
    console.error('There was an error fetching the user data:', error);
  }
};
onMounted(() => {
  fetchUser();
});
</script>
<style scoped>
.profile-panel {
  display: flex;
  align-items: center;
  padding: 10px;
  border-radius: 5px;
  width: 400px;
  justify-content: center;
  background-color: #f9f9f9;
  box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
}
.profile-image {
  border-radius: 50%;
  width: 80px;
  height: 80px;
  object-fit: cover;
  margin-right: 20px;
}
.profile-info {
  display: flex;
  flex-direction: column;
  font-size: 16px;
}
.profile-name {
  margin-top: 5px;
  font-weight: bold;
  font-size: 20px;
  color: #333;
}
</style>
