package com.javaInterview.IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

    public static void main(String[] args) {
        // Java 7 way of reading a file
        System.out.println("File Path on MacOS = " + System.getProperty("user.dir"));
        System.out.println();
        System.out.println("Java 7 way of reading a File");
        StringBuilder allLine = new StringBuilder();
        String sCurrentLine;
        try (BufferedReader br = new BufferedReader(new FileReader("/Users/manishkeshav/_Work 2025/Java/Manish.txt"))) {
            while ((sCurrentLine = br.readLine()) != null) {
                //System.out.println(sCurrentLine);
                allLine.append(sCurrentLine);
            }
            System.out.println("File Contents are: " + allLine);
        } catch (FileNotFoundException e) {
            // e.printStackTrace();
            System.out.println("Inside File Not Found Exception..");
            System.out.println("Message = " + e.getMessage());
        } catch (IOException e) {
            // e.printStackTrace();
            System.out.println("Inside IOException..");
            System.out.println("Message = " + e.getMessage());
        }

        // Java 6 way of reading a File
        System.out.println();
        System.out.println("Java 6 way of reading a File");
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("/Users/manishkeshav/_Work 2025/Java/Manish.txt"));
            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
            }
        } catch (FileNotFoundException e) {
            // e.printStackTrace();
            System.out.println("Inside File Not Found Exception..");
            System.out.println("Message = " + e.getMessage());
        } catch (IOException e) {
            // e.printStackTrace();
            System.out.println("Inside IOException..");
            System.out.println("Message = " + e.getMessage());
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
