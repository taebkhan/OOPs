package org.example;

import java.io.*;
import java.nio.file.Files;

public class ExceptionDemo {
    public void Demo(){
        String filePath = "example.txt";

        try{
            writeFile(filePath, "Hello, this is a test content!");

            checkFileSize(filePath);

            readFile(filePath);
        }
        catch (FileNotFoundException e){
            System.err.println("Error: The file was not found. " + e.getMessage());
        } catch (EmptyFileException e) {
            System.err.println("Custom Exception: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("I/O Error: " + e.getMessage());
        }
    }

    public static void writeFile(String filePath, String content) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            fos.write(content.getBytes());
        }
    }

    // Method to read content from a file
    public static void readFile(String filePath) throws IOException {
        File file = new File(filePath);
        try (FileInputStream fis = new FileInputStream(file)) {
            byte[] data = new byte[(int) file.length()];
            fis.read(data);
            String content = new String(data);
            System.out.println("File content: " + content);
        }
    }

    // Method to check the file size and throw custom exception if size is 0 KB
    public static void checkFileSize(String filePath) throws EmptyFileException, IOException {
        File file = new File(filePath);
        long fileSize = Files.size(file.toPath());

        if (fileSize == 0) {
            throw new EmptyFileException("The file is empty (0 KB).");
        }
    }
}
