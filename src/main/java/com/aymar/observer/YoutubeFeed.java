package com.aymar.observer;

import com.aymar.observer.dto.Content;

import java.util.ArrayList;
import java.util.List;

//publisher
public class YoutubeFeed {

   private List<Content> contentList=new ArrayList<>();
   private List<Subscriber> subscriberList=new ArrayList<>();

    public void registerSubscriber(Subscriber subscriber){
        subscriberList.add(subscriber);
    }

    public void notifySubscribers(Content content){
        subscriberList.forEach(
                subscriber -> {
                    subscriber.updateFeed(content);
                }
        );
    }

    public void publishContent(Content content){
        contentList.add(content);
        notifySubscribers(content);
    }
}
