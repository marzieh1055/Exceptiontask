package com.mycompany.taskexceptiopn;

public interface FileWriter {
    void writeToFile (String content, String fileName) throws WriteFileException;
}
