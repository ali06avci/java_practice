package scanner;
import java.util.Scanner;
	 	//Ask the user to enter a three-digit number and find the sum of its digits.
public class Scanner_7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a three digit number");

        int num=scan.nextInt();
        int sum=0;
        while(num>0) {
            sum=num%10+sum;
            num=num/10;
        }
        System.out.println("sum of digits are "+sum);
        scan.close();
    }
}
