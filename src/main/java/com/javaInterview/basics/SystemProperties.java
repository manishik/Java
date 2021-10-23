package com.javaInterview.basics;

public class SystemProperties {

    public static void main(String[] args) {
        System.out.println("file.separator = " + System.getProperty("file.separator"));

        System.out.println("Line 2" + System.getProperty("file.separator") + "Same Line ");

        System.out.println("Line 3" + System.getProperty("line.separator") + "Line 4 ");

        long startTime = System.currentTimeMillis();
        final long startTm = System.nanoTime();

        System.out.println("java.version = " + System.getProperty("java.version"));
        System.out.println("java.specification.version = " + System.getProperty("java.specification.version"));
        System.out.println("java.library.path = " + System.getProperty("java.library.path"));
        System.out.println("java.compiler = " + System.getProperty("java.compiler"));
        System.out.println("java.vendor = " + System.getProperty("java.vendor"));
        System.out.println("java.vm.name = " + System.getProperty("java.vm.name"));

        System.out.println("user.dir = " + System.getProperty("user.dir"));

        System.out.println("os.name = " + System.getProperty("os.name"));
        System.out.println("os.version = " + System.getProperty("os.version"));
        System.out.println("os.arch = " + System.getProperty("os.arch"));

        System.out.println("path.separator = " + System.getProperty("path.separator"));

        System.out.println("user.name = " + System.getProperty("user.name"));
        System.out.println("user.home = " + System.getProperty("user.home"));
        System.out.println("user.dir = " + System.getProperty("user.dir"));

		/*java.util.Properties properties = System.getProperties();
	    properties.list(System.out);*/

        long endTime = System.currentTimeMillis();

        final long duration = System.nanoTime() - startTm;

        long totalTime = endTime - startTime;
        System.out.println("TotalTime = " + totalTime);
        System.out.println("Duration = " + duration);

    }

}
