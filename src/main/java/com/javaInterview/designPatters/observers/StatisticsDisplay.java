package com.javaInterview.designPatters.observers;

// Concrete Observers

public class StatisticsDisplay implements Observer {
    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Statistics Display:");
        System.out.println("Average Temperature: " + (temperature + 1) + "°C"); // Simulated stats
        System.out.println("Average Humidity: " + (humidity - 2) + "%");
        System.out.println("Average Pressure: " + (pressure + 5) + " hPa\n");
    }
}
