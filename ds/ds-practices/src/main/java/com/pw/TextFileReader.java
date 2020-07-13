package com.pw;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class TextFileReader {

    public static void main(String[] args) {
        String fileName = System.getProperty("log_file_name");
        if(fileName != null && !fileName.isEmpty()){
            try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
                OptionalDouble optionalDouble = stream.mapToDouble(Double::new).average();
                if(optionalDouble.isPresent()){
                    System.out.println("Average Response time: "+optionalDouble.getAsDouble());
                }else {
                    System.out.println("Failed to calculate Average Response time. Please check the File once.");
                }
            } catch (IOException e) {
                System.out.println("Failed to read file");
                e.printStackTrace();
            }
        }else{
            System.out.println("Please pass log_file_name as jvm argument.");
        }
    }
}
