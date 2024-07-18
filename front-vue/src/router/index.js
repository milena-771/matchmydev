import { createRouter, createWebHistory } from "vue-router";

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'search-profiles',
      component: () => import('../components/SearchProfiles.vue')
    },
    {
      path: '/update/:id',
      name: 'update-profile',
      component: () => import('../components/EditProfile.vue')
    },
  ],
});

export default router;
