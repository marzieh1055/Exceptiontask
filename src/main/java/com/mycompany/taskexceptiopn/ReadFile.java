package com.mycompany.taskexceptiopn;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile implements com.mycompany.taskexceptiopn.FileReader {

    public String readFile(String fileName) throws ReadFileException {
        String out = new String();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            // Create a BufferedReader to read the file
            String line;

            // Read the file line by line
            while ((line = reader.readLine()) != null) {
                out += line; // Print each line to the console
            }

        } catch (FileNotFoundException fne){
            throw new ReadFileException("file not exist: " + fne.getMessage());
        }
        catch (IOException e) { //See the exception
            throw new ReadFileException("An error occurred while reading the file: " + e.getMessage());
        }
        return out;
    }
}