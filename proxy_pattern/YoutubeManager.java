package org.design_pattern.proxy_pattern;

import java.util.List;

public class YoutubeManager {

    private final ThirdPartyYouTubeLib service;

    public YoutubeManager(ThirdPartyYouTubeLib service) {
        this.service = service;
    }

    public void renderVideoPage(String id) {
        VideoInfo info = service.getVideoInfo(id);
        System.out.printf("Rendering video page: [%s] %s (%d sec)%n",
                info.getId(), info.getTitle(), info.getDurationSeconds());
    }

    public void renderListPanel() {
        List<Video> list = service.listVideos();
        System.out.println("Rendering list of videos:");
        for (Video v : list) {
            System.out.printf("  • %s: %s%n", v.getId(), v.getTitle());
        }
    }

    public void reactOnUserInput(String selectedId) {
        renderVideoPage(selectedId);
        renderListPanel();
    }
}
