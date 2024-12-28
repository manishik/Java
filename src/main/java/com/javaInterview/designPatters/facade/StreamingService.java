package com.javaInterview.designPatters.facade;

public class StreamingService {

    public void connect() {
        System.out.println("Streaming service connected.");
    }
    public void disconnect() {
        System.out.println("Streaming service disconnected.");
    }
    public void playMovie(String movie) {
        System.out.println("Now playing: " + movie);
    }
}
