package com.javaInterview.designPatters;

import java.lang.reflect.Constructor;

public class BreakServiceLocator {

    public static void main(String[] args) throws Exception {
        Class class1 = Class.forName("com.javaInterview.designPatters.ServiceLocator");
        //Accessing private constructor
        Constructor constructor1 = class1.getDeclaredConstructor();
        constructor1.setAccessible(true);
        Object serviceLocatorObj1 = constructor1.newInstance();
        ServiceLocator serviceLocator1 = (ServiceLocator) serviceLocatorObj1;

        Class class2 = Class.forName("com.javaInterview.designPatters.ServiceLocator");
        Constructor constructor2 = class2.getDeclaredConstructor();
        constructor2.setAccessible(true);
        Object serviceLocatorObj2 = constructor2.newInstance();
        ServiceLocator serviceLocator2 = (ServiceLocator) serviceLocatorObj1;
        System.out.println();
    }

}
