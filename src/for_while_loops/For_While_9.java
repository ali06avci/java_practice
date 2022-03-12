package for_while_loops;
import java.util.Scanner;
/*
	 Write a java program to reverse the number which user entered.
	Input :1238
	Output :Reverse Of The Number: 8321
	 */
public class For_While_9 {
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter the number...");
		int num=scan.nextInt();
		while(num!=0) {
			System.out.print(num%10);
			num/=10;
		}
	}
}
