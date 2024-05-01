package com.assignment.question;

import com.assignment.question.models.Image;
import com.assignment.question.services.AnalyticsService;
import com.assignment.question.services.FilterService;
import com.assignment.question.services.ImageLoader;
import com.assignment.question.services.ImageModifier;
import com.assignment.question.services.ImageWriter;

public class ImageEditingFacade {
    private ImageLoader imageLoader;
    private FilterService filterService;
    private ImageModifier imageModifier;
    private ImageWriter imageWriter;
    private AnalyticsService analyticsService;

    ImageEditingFacade(ImageLoader imageLoader, FilterService filterService, ImageModifier imageModifier, ImageWriter imageWriter, AnalyticsService analyticsService){
        this.imageLoader = imageLoader;
        this.imageWriter = imageWriter;
        this.imageModifier = imageModifier;
        this.filterService = filterService;
        this.analyticsService = analyticsService;
    }
    public void editImage(String imagePath, String filterType, int brightness) {

        Image image = imageLoader.loadImage(imagePath);

        filterService.applyFilter(image, filterType);
        imageModifier.adjustBrightness(image, brightness);

        imageWriter.saveImage(image);
        analyticsService.store(image);
    }
}
