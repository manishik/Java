package com.learning.assorted1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Gen1000Lines {

    public static void main(String[] args) {

        try {
            File file = new File("file.txt");
            FileWriter fw = new FileWriter(file);
            for (int i = 1; i < 1000000; i++) {
                file.createNewFile();
                fw.write("This is line number " + i + '\n');
            }
            fw.close();
        } catch (IOException ioException) {

        }

    }


}
