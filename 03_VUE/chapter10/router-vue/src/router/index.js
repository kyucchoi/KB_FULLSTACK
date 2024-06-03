import { createRouter, createWebHistory } from 'vue-router';
import Home from '@/pages/Home.vue';
import Dynamic from '@/pages/Dynamic.vue';
import NotFound from '@/pages/NotFound.vue';

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: Home,
    },
    {
      path: '/about',
      name: 'about',
      component: () => import('@/pages/About.vue'),
    },
    {
      path: '/dynamic/:mood',
      name: 'dynamic',
      component: Dynamic,
      props: true,
    },
    //가장 아래에다 해야 순서대로 처리 후 없는 부분만 NOT FOUND로 보냄
    {
      path: '/:pathMatch(.*)*',
      name: 'notfound',
      component: NotFound,
    },
  ],
});

export default router;
