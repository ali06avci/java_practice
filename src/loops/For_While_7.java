package loops;
import java.util.Scanner;
/*
	 Write java code for checking the number is Perfect number or not.

	    Any number can be a Java Perfect Number if the sum of its positive divisors excluding the number itself is equal to that number.

	Input :6 Output:6 is Perfect Number
	Input :7 Output:7 is not Perfect Number
	 */
public class For_While_7 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the number...");
		int num=scan.nextInt();
		int sum=0;
		int i=1;

		while(i<=num/2) {
			if(num%i == 0) {
				sum=sum+i;
			}
			i++;
		}
		if(sum==num) {
			System.out.println(num+" is Perfect Number");
		}else {
			System.out.println(num+" is not Perfect Number");
		}
	}
}