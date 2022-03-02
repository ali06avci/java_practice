package if_switch_ternary_stringmethods;
	/*
	 Write a Java program to compute and print sum of two given numbers (more than or equal to zero).
	If given integers or the sum have more than 10 digits, print "overflow".
	EXAMPLE:
	INPUT :
	Input two integers:
	25
	46
	OUTPUT :
	Sum of the numbers: 71
	 */
import java.util.Scanner;
public class If_Switch_Ternary_StringMethods_2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter two integers...");

        int num1=scan.nextInt();
        int num2=scan.nextInt();
        int sum = num1+num2;
        if(num1>1000000000 || num2>1000000000 || sum>1000000000) {
            System.out.println("overflow");
        }else {
            Object result = (sum>=0) ?  sum : "sum is less than zero ";
            System.out.println("Sum of the numbers:"+result);
        }
    }
}



