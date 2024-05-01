package com.assignment.question;

public class LowAdjustmentStrategy implements QualityAdjustmentStrategy{

    @Override
    public VideoQuality supportsType() {
        return VideoQuality.LOW;
    }

    @Override
    public Video streamVideo(Video video) {
        video.setCodec(VideoCodec.H264);
        video.setBitrate(500);
        return video;
    }
}
