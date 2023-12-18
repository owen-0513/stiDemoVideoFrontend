package com.example.demovideo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/video")
public class VideoController {

    @GetMapping("/stream")
    public String streamVideo() {
        return "Video stream URL";
    }
}