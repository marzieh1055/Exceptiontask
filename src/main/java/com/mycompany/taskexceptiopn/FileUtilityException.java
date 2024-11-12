package com.mycompany.taskexceptiopn;

public class FileUtilityException {
    private String content;
    private FileReader fileReader;
    private FileWriter fileWriter;

    public FileUtilityException(FileReader fileReader, FileWriter fileWriter) {
        this.fileReader = fileReader;
        this.fileWriter = fileWriter;
    }

    public String getContent() {
        return content;
    }

    public void readFile(String fileName) {
        try {
            content = fileReader.readFile(fileName);
        } catch (ReadFileException e) {
            System.out.println(e.getMessage());
        }
    }

    public void writeToFile(String fileName) {
        writeToFile(content, fileName);
    }

    public void writeToFile(String content, String fileName) {
        try {
            fileWriter.writeToFile(content, fileName);
        } catch (WriteFileException e) {
           System.out.println(e.getMessage());
        }
    }
    public void copy(String fileInp,String fileOut) {
        try {
            content = fileReader.readFile(fileInp);
            fileWriter.writeToFile(content, fileOut);
        } catch (ReadFileException e) {
            System.out.println(e.getMessage());
        } catch (WriteFileException e) {
            System.out.println(e.getMessage());
        }
    }
}
