import { createRouter, createWebHistory } from "vue-router";
import VideoPlayer from "../components/VideoPlayer";

const routes = [
    {
        path: "/",
        name: "VideoPlayer",
        component: VideoPlayer
    }
];

const router = createRouter({
    history: createWebHistory(),
    routes
});

export default router;
