package practice;

import java.util.Scanner;

public class Palindrome_1 {
    public static void main(String[] args) {
        /*
         Create a program checks if a string is palindrome or not
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a string");
        String str=scan.nextLine();

        palindrome( str);
    }
    public static void palindrome(String str) {
        String reversed = "";
        for(int i = str.length()-1;i>=0 ; i-- ) {
            reversed += str.charAt(i);
        }
        if(str.equalsIgnoreCase(reversed)) {
            System.out.println("This word is a palindrome! "+str);
        }else {
            System.out.println("this word is not a palindrome "+str);
        }
    }
}