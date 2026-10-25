package com.javaInterview.designPatterns.facade;

public class Main {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheater = new HomeTheaterFacade();

        // Watch a movie
        homeTheater.watchMovie("Forrest Gump");

        // Stop watching
        homeTheater.stopMovie();
    }
}
