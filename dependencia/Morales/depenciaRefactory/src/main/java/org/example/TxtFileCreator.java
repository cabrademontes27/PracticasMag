package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TxtFileCreator implements FileCreator {
    private static String type = "txt";

    @Override
    public void createFile(String content, String fileName) {
        try (
                BufferedWriter writer = new BufferedWriter
                        (new FileWriter(fileName + ".txt"))
        ) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getType() {
        return type;
    }
}