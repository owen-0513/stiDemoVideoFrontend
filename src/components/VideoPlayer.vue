<template>
    <div class="container mt-5">
        <div class="row justify-content-center">
            <div class="col-md-8">
                <div class="card bg-dark text-white">
                    <div class="card-header">
                        <h2 class="text-center">BAE我們的部門(看要改甚麼名子)</h2>
                    </div>
                    <div class="card-body text-left">
                        <div class="custom-video-container">
                            <video class="custom-video" controls>
                                <source :src="videoUrl" type="video/mp4">
                                影片播放失敗，請檢查連結。
                            </video>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
    export default {
        data() {
            return {
                videoUrl: "http://localhost:8081/api/video/stream",
            };
        },
    };
</script>

<style>
    .custom-video-container {
        position: relative;
        padding-bottom: 56.25%;
        height: 0;
        overflow: hidden;
    }

    .custom-video {
        position: absolute;
        top: 0;
        left: 0;
        width: 100%;
        height: 100%;
    }
</style>
