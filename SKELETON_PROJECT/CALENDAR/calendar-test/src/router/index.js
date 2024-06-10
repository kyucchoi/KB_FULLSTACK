import { createRouter, createWebHistory } from 'vue-router';
import Home from '../pages/Home.vue';

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: Home,
    },
    {
      path: '/calendarPage',
      name: 'calendarPage',
      component: () => import('../pages/Calendar-page.vue'),
    },
  ],
});

export default router;
