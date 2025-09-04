package org.example.dataprocessor.Output;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TextFile implements OutputInterface {

    private static final String path = "target/result.txt";

    @Override
    public void print(double value) {
        try {
            File file = new File(path);

            file.getParentFile().mkdirs();

            try (FileWriter writer = new FileWriter(file, false)) {
                writer.write("Result = " + value + System.lineSeparator());
            }

        } catch (IOException e) {
            throw new RuntimeException("Failed to write result to file: " + path, e);
        }
    }
}
