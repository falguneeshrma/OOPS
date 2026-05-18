package Advance_Programming;
import java.util.*;

class ExceptionHandling{
    private static void readFile() throws Exception{
        throw new Exception();  // throw: it throws an error and does not use try and catch block here
    }
    public static void main(String[] args) throws Exception{    // throws:it indicates there might be an expection
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(15);
        try{
            System.out.println(arr.get(5)); //error statement
            System.out.println("Statement1: after error statement");
        }
        catch(Exception e){
            System.out.println("Catch statement " + e.getMessage());
        }
        finally{
            System.out.println("Statement2: final statement");  // closing resources
        }

        readFile();
        System.out.println("Statement3: after exception statement");
    }
}