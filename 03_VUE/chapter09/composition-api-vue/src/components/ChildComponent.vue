<template>
  <div>
    <input type="text" v-model.number="inputNum" />
    <button @click="sendResult">정답! 맞았을까?</button>
  </div>
</template>

<script setup>
import { ref, defineEmits, defineProps } from 'vue';

const inputNum = ref(0);
const props = defineProps({
  parentNum: {
    type: Number,
    required: true,
  },
});

const checkResult = () => {
  if (props.parentNum == inputNum.value) return '정답입니다!';
  if (props.parentNum > inputNum.value) {
    return 'Down';
  } else {
    return 'UP';
  }
};

const emit = defineEmits(['send-result']);

const sendResult = () => {
  emit('send-result', checkResult());
};
</script>
