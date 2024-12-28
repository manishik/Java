package com.javaInterview.designPatters.observers;

/*

Goal: A weather station (subject) notifies multiple display devices (observers) when the weather data changes.
Key Points
	1.	Decoupling: The subject and observers are loosely coupled.
	2.	Flexibility: New observers can be added without modifying the subject.
	3.	Reusability: The same subject can work with different observers.
 */

// Client Code
public class Main {

    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        Observer currentDisplay = new CurrentConditionsDisplay();
        Observer statsDisplay = new StatisticsDisplay();

        weatherStation.addObserver(currentDisplay);
        weatherStation.addObserver(statsDisplay);

        System.out.println("Setting weather data...");
        weatherStation.setWeatherData(25.0f, 65.0f, 1013.0f);

        System.out.println("Updating weather data...");
        weatherStation.setWeatherData(28.0f, 70.0f, 1010.0f);
    }

}
