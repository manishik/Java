package com.javaInterview.designPatters.facade;

/*
Facade Design Pattern in Java:
The pattern provides a unified interface to a set of interfaces in a subsystem, simplifying its usage for clients.
1. Simplifies Usage: The facade hides the complexity of the subsystem and provides easy-to-use methods for the client.
2. Loose Coupling: The client code is loosely coupled with the subsystem.
3. Flexibility: You can extend or modify the facade without impacting the client or subsystem classes.
*/

public class HomeTheaterFacade {
    private Television tv;
    private SoundSystem soundSystem;
    private StreamingService streamingService;

    public HomeTheaterFacade() {
        this.tv = new Television();
        this.soundSystem = new SoundSystem();
        this.streamingService = new StreamingService();
    }

    public void watchMovie(String movie) {
        System.out.println("Setting up to watch a movie...");
        tv.turnOn();
        soundSystem.turnOn();
        soundSystem.setVolume(20);
        streamingService.connect();
        streamingService.playMovie(movie);
        System.out.println("Enjoy your movie!\n");
    }

    public void stopMovie() {
        System.out.println("Stopping the movie...");
        streamingService.disconnect();
        soundSystem.turnOff();
        tv.turnOff();
        System.out.println("Movie stopped. Goodbye!\n");
    }
}
