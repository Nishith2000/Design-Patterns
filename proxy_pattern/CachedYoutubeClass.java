package org.design_pattern.proxy_pattern;

import java.util.*;

public class CachedYoutubeClass implements ThirdPartyYouTubeLib {

    private final ThirdPartyYouTubeLib service;

    private List<Video> listCache;
    private final Map<String, VideoInfo> videoCache = new HashMap<>();
    private boolean needReset = false;

    public CachedYoutubeClass(ThirdPartyYouTubeLib service) {
        this.service = service;
    }

    // Invalidate caches manually if needed
    public void resetCache() {
        needReset = true;
    }

    @Override
    public List<Video> listVideos() {
        if (listCache == null || needReset) {
            listCache = service.listVideos();
            needReset = false;
        } else {
            System.out.println("CachedYouTubeClass: Returning cached video list");
        }
        return listCache;
    }

    @Override
    public VideoInfo getVideoInfo(String id) {
        if (!videoCache.containsKey(id) || needReset) {
            VideoInfo info = service.getVideoInfo(id);
            videoCache.put(id, info);
            needReset = false;
        } else {
            System.out.printf("CachedYouTubeClass: Returning cached metadata for %s%n", id);
        }
        return videoCache.get(id);
    }

    @Override
    public void downloadVideo(String id) {
        if (!downloadExists(id) || needReset) {
            service.downloadVideo(id);
            markDownloaded(id);
            needReset = false;
        } else {
            System.out.printf("CachedYouTubeClass: Video %s already downloaded, skipping%n", id);
        }
    }

    // Stub methods to track downloads
    private final Set<String> downloaded = new HashSet<>();
    private boolean downloadExists(String id) {
        return downloaded.contains(id);
    }
    private void markDownloaded(String id) {
        downloaded.add(id);
    }
}
