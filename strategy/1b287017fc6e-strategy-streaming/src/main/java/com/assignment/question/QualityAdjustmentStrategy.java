package com.assignment.question;

public interface QualityAdjustmentStrategy {
    VideoQuality supportsType();
    Video streamVideo(Video video);
}