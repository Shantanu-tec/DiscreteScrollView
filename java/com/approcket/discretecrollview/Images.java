package com.approcket.discretecrollview;

public class Images {
    private int images;

    private String text;

    public Images(int images, String text) {
        this.images = images;
        this.text = text;
    }

    public Images() {
    }

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
