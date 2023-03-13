package com.aymar.observer;

import com.aymar.observer.dto.Content;

public class User implements Subscriber {
    @Override
    public void updateFeed(Content content) {
        System.out.println(content);
    }
}
