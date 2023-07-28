package com.walker.data;
import java.awt.image.BufferedImage;

public record TelescopeImage(String imageFile, TelescopeImage telescopeImage, Weather weather, BufferedImage image) {
    @Override
    public String toString() {
        return "TelescopeImage{" +
                "imageFile='" + imageFile + '\'' +
                ", telescopeImage=" + telescopeImage +
                ", weather=" + weather +
                ", image=" + image +
                '}';
    }
}
