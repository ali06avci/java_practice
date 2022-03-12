package list;
import java.util.Arrays;
import java.util.Scanner;
public class List_03 {
    static void reversedSentence () {
        Scanner scan=new Scanner (System.in);
        System.out.println("Please enter a sentence...");
        String str=scan.nextLine();

        String chr;
        String reversed="";
        String arr[]=str.split("");

        for(int i=0; i<arr.length; i++) {
            chr=arr[i];
            reversed=chr+reversed;
        }
        System.out.println(reversed);
        scan.close();
    }
    public static void main(String[] args) {
        reversedSentence ();
    }
}


