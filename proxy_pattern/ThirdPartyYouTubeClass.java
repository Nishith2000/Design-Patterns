package org.design_pattern.proxy_pattern;

import java.util.Arrays;
import java.util.List;

public class ThirdPartyYouTubeClass implements ThirdPartyYouTubeLib {

    @Override
    public List<Video> listVideos() {
        // Simulate an expensive API call
        System.out.println("ThirdPartyYouTubeClass: Fetching list of videos from YouTube...");
        // Return dummy data
        return Arrays.asList(
                new Video("a1", "Funny Cats"),
                new Video("b2", "Design Patterns Tutorial"),
                new Video("c3", "Java Concurrency")
        );
    }

    @Override
    public VideoInfo getVideoInfo(String id) {
        System.out.printf("ThirdPartyYouTubeClass: Fetching metadata for video %s from YouTube...%n", id);
        // Return dummy metadata
        return new VideoInfo(id, "Title of " + id, 12345);
    }

    @Override
    public void downloadVideo(String id) {
        System.out.printf("ThirdPartyYouTubeClass: Downloading video %s from YouTube...%n", id);
        // Simulate download delay
        try { Thread.sleep(500); } catch (InterruptedException ignored) {}
        System.out.printf("ThirdPartyYouTubeClass: Download of %s complete.%n", id);
    }
}
