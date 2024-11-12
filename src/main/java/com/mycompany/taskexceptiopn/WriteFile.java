package com.mycompany.taskexceptiopn;

import java.io.BufferedWriter;
import java.io.IOException;

public class WriteFile implements FileWriter {
    @Override
    public void writeToFile(String contnt, String fileName) throws WriteFileException {
        try (BufferedWriter writer = new BufferedWriter(new java.io.FileWriter(fileName))) {
            writer.write(contnt);
        } catch (NullPointerException e) { //See the exception
			throw new WriteFileException("Content is nothing: " + e.getMessage());
        } catch (IllegalArgumentException e) { //See the exception
            throw new WriteFileException("Arguments are illegal: " + e.getMessage());
        } catch (IOException e) { //See the exception
            throw new WriteFileException("An error occurred while writing the file: " + e.getMessage());
        }
    }
}


