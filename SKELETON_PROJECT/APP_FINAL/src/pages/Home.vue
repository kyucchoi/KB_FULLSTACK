<template>
    <div class="container">
        <UserProfile />
        <div class="main">
            <button @click="showModal">모달 열기</button>
            <ModalComponents
                :visible="isModalVisible"
                @close-modal="hideModal"
            />
            <TotalExpenses />
            <br />
            <TotalIncomes />
            <ShowList />
        </div>
        <AddButton class="addbutton-container" />
    </div>
</template>

<script setup>
import AddButton from "@/components/AddButton.vue";
import UserProfile from "@/components/UserProfile.vue";
import { ref } from "vue";
import ModalComponents from "@/components/Modal.vue";
import ShowList from "@/components/ShowList.vue";
import TotalExpenses from "@/components/TotalExpenses.vue";
import TotalIncomes from "@/components/TotalIncomes.vue";

const isModalVisible = ref(false);

function showModal() {
    isModalVisible.value = true;
}

function hideModal() {
    isModalVisible.value = false;
}
</script>

<style scoped>
.container {
    display: flex;
    flex-direction: column;
    align-items: center;
    height: 100vh;
    padding: 20px;
}

.main {
    display: flex;
    flex-direction: column;
    align-items: center;
    margin-top: 20px;
}

.addbutton-container {
    margin-top: 20px;
}
</style>
