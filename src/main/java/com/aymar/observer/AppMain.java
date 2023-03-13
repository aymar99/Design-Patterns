package com.aymar.observer;

import com.aymar.observer.dto.Content;

public class AppMain {
    public static void main(String[] args) {
        YoutubeFeed youtubeFeed=new YoutubeFeed();
        User user1=new User();
        User user2=new User();
        youtubeFeed.registerSubscriber(user1); //subscribing to publisher
        youtubeFeed.registerSubscriber(user2);

        Content content=new Content("How to bake cakes?","This is a helpful cooking video","21-Dec-2020");
        youtubeFeed.publishContent(content);
    }
}
