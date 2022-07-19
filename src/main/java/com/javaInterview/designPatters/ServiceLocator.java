package com.javaInterview.designPatters;

public class ServiceLocator {

	private String name;

	private ServiceLocator() {
		System.out.println("Private Constructor of ServiceLocator class");
		int sal = 10000;
		System.out.println("Sal = " + sal);
		name = "Manish";
		System.out.println(name);
	}
	
	private static ServiceLocator instance;

	public static synchronized ServiceLocator getInstance() {
		if (instance == null) {
			instance = new ServiceLocator();
		}
		return instance;
	}
}