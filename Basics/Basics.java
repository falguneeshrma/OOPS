package Basics;
import java.util.Scanner ;

public class Basics {
    public static void main(String[] args) {

        // System.out.println("Hello World!");
        
        // short num = 100;
        // byte num = 100;
        // int num = 100;
        // long num = 1000;
        // float num = 1.1f;
        // double num = 11.11;
        // char letter = 'a';
        // System.out.println(letter);

        // int num1 = 6, num2 = 7;
        // boolean result = num1 <= num2; 
        // System.out.println(result);

        // boolean first = true;
        // boolean second = false;
        // boolean result1 = first && second;
        // boolean result2 = first || second;
        // System.out.println(result1);
        // System.out.println(result2);

        // System.out.println(num1 += num2);
        
        //condition ? first : second
        // int num1 = 6, num2 = 7;
        // int num3 = num1 > num2? num1-num2 : num2-num1;
        // System.out.println(num3);

        // String name = "falguni";
        // String name2 = "falguni";
        // System.out.println(name + " is of length " + name.length());
        // System.out.println(name.charAt(3));
        // System.out.println(name.substring(4));
        // System.out.println(name.substring(0, 6));
        // System.out.println(name.equals(name2));

        Scanner sc = new Scanner(System.in);

        // int num1 = sc.nextInt();
        // int num2 = sc.nextInt();
        // int result = num1 + num2;
        // System.out.println(num1 + " + " + num2 + " = " + result);

        String sentence = sc.nextLine();
        String first = sc.next();
        String last = sc.next();
        System.out.println(sentence);
        System.out.println(first);
        System.out.println(last);
        sc.close();
        


        
    }
}

