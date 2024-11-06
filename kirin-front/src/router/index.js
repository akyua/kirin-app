import {
  createRouter,
  createWebHashHistory,
  createWebHistory,
} from "vue-router";
import AnimeList from "@/views/AnimeList.vue";
import About from "@/views/About.vue";
import Ranking from "@/views/Ranking.vue";

const router = createRouter({
  history: createWebHistory(),
  routes: [
    {
      path: "/",
      name: "home",
      component: () => import("../views/Home.vue"),
    },
    {
      path: "/login",
      name: "login",
      component: () => import("../views/LoginView.vue"),
    },
    {
      path: "/signup",
      name: "singup",
      component: () => import("../views/RegisterView.vue"),
    },
    {
      path: "/anime-list",
      name: "anime-list",
      component: AnimeList,
    },
    {
      path: "/about",
      name: "about",
      component: About,
    },
    {
      path: "/ranking",
      name: "ranking",
      component: Ranking,
    },
  ],
});

export default router;
