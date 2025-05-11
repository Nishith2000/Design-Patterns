package org.design_pattern.proxy_pattern;

public class Client {

    public static void main(String[] args) {
        ThirdPartyYouTubeLib  service = new ThirdPartyYouTubeClass();
        CachedYoutubeClass proxy   = new CachedYoutubeClass(service);
        YoutubeManager manager = new YoutubeManager(proxy);

        manager.reactOnUserInput("b2");

        System.out.println("\n-- Second interaction (should hit caches) --");
        manager.reactOnUserInput("b2");
    }
}
