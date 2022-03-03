package list;
import java.util.Scanner;
/*
	Write a Java program to get a String from user as input and
	find the maximum occurring character in that string. (Ignore case sensitivity)
	input :
	Learning java is easy
	output:
	maximum occurring character is : a
	*/
public class List_01 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a string...");
        String str=scan.nextLine();
        int [] occur = new int [str.length()];

        char maxChar= str.charAt(0);
        int i, j, max;

        char string[] = str.toCharArray();

        for(i=0; i<string.length; i++) {
            occur[i]=1;
            for(j=i+1; j<string.length;j++) {
                if(string[i] == string[j] && string[i] != ' ' && string[i] != '0') {
                    occur[i]++;
                    string [j] ='0';
                }
            }
        }
        max = occur[0];
        for(i = 0; i <occur.length; i++) {
            if(max < occur[i]) {
                max = occur[i];
                maxChar = string[i];
            }
        }
        scan.close();
        System.out.println("maximum occurring character is : " + maxChar);
    }
}
