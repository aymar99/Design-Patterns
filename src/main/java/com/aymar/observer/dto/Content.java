package com.aymar.observer.dto;

public class Content {
    String name;
    String description;
    String publishingDate;

    public Content(String name, String description, String publishingDate) {
        this.name = name;
        this.description = description;
        this.publishingDate = publishingDate;
    }

    @Override
    public String toString() {
        return "Content{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", publishingDate='" + publishingDate + '\'' +
                '}';
    }
}
