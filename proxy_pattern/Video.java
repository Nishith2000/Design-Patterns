package org.design_pattern.proxy_pattern;

public class Video {
    private final String id;
    private final String title;

    public Video(String id, String title) {
        this.id    = id;
        this.title = title;
    }
    public String getId()    { return id; }
    public String getTitle() { return title; }
}