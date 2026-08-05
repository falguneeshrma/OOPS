package Advance_Programming;
import java.io.*;
import java.io.File;
import java.io.IOException;

class FileHandling{

//File class


    // public static void main(String[] args) throws IOException{
    //     File file = new File("C:/Users/falgu/Documents/OOPS/Advance_Programming/file_handling.txt");
    //     System.out.println(file.exists());
    //     file.createNewFile();
    //     System.out.println(file.exists());
    //     System.out.println("File Name: " + file.getName());
    //     System.out.println("Writable: " + file.canWrite());
    //     System.out.println("Readable: " + file.canRead());
    //     System.out.println("File Size in bytes: " + file.length());
    //     System.out.println("Absolute Path: " + file.getAbsolutePath());

    //     try {
    //         File file2 = new File("example.txt");
    //         if (file.createNewFile()) {
    //             System.out.println("File created: " + file.getName());
    //         } else {
    //             System.out.println("File already exists.");
    //         }
    //     } catch (IOException e) {
    //         System.out.println("An error occurred.");
    //         e.printStackTrace();
    //     }
    // }

// File Writer and Buffered Writer

    // public static void main(String[] args) throws IOException{
    //     try{
    //         BufferedWriter bw = new BufferedWriter(new FileWriter("C:/Users/falgu/Documents/OOPS/Advance_Programming/file_handling.txt"));
    //         bw.write("Heyy, it's me!");
    //         bw.newLine();
    //         bw.write("Heyy, it's me again!");
    //     }
    //     catch(Exception e){
    //         System.out.println(e.getMessage());
    //     } 
        
    //     bw.close();
    // }

// File Reader and Buffered Reader
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader( new FileReader("C:/Users/falgu/Documents/OOPS/Advance_Programming/file_handling.txt"));  
            while(br.readLine() != null){
                System.out.println("Line");
            }  
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            br.close();
        }

}