package Advance_Programming;
import java.util.*;
import java.io.File;
import java.io.IOException;

class FileHandling{
    public static void main(String[] args) throws IOException{
        File file = new File("C:/Users/falgu/Documents/OOPS/Advance_Programming/file_handling.txt");
        System.out.println(file.exists());
        file.createNewFile();
        System.out.println(file.exists());
        System.out.println("File Name: " + file.getName());
        System.out.println("Writable: " + file.canWrite());
        System.out.println("Readable: " + file.canRead());
        System.out.println("File Size in bytes: " + file.length());
        System.out.println("Absolute Path: " + file.getAbsolutePath());

        try {
            File file2 = new File("example.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }



    }


}