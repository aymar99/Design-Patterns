package com.aymar.observer;

import com.aymar.observer.dto.Content;

public interface Subscriber {
    void updateFeed(Content content);
}
