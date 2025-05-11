package org.design_pattern.proxy_pattern;

import java.util.List;

public interface ThirdPartyYouTubeLib {
    List<Video> listVideos();
    VideoInfo getVideoInfo(String id);
    void downloadVideo(String id);
}
