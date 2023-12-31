import { createRouter, createWebHashHistory, createWebHistory } from 'vue-router';
import AnimeList from '@/views/AnimeList.vue';

const router = createRouter({
    history: createWebHistory(),
    routes: [
        {
            path: '/',
            name: 'home',
            component: () => import('../views/Home.vue')
        },
        {
            path: '/login',
            name: 'login',
            component: () => import('../views/LoginView.vue')
        },
        {
            path: '/anime-list',
            name: 'anime-list',
            component: AnimeList,
        }
    ]
})

export default router;