package org.design_pattern.proxy_pattern;

public class VideoInfo {
    private final String id;
    private final String title;
    private final int    durationSeconds;

    public VideoInfo(String id, String title, int durationSeconds) {
        this.id              = id;
        this.title           = title;
        this.durationSeconds = durationSeconds;
    }
    public String getId()               { return id; }
    public String getTitle()            { return title; }
    public int    getDurationSeconds()  { return durationSeconds; }
}
