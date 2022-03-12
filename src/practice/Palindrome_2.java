package practice;
import java.util.Scanner;
public class Palindrome_2 {
    public static void main(String[] args) {
        /*
         Create a program checks if a string is palindrome or not
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a string");
        StringBuilder str= new StringBuilder(scan.next());

        boolean isPalindrome = str.toString().equals(str.reverse().toString());

        if(isPalindrome) {
            System.out.println("This word is a palindrome! "+str);
        }else {
            System.out.println("this word is not a palindrome "+str);
        }
    }
}