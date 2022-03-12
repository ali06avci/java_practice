package for_while_loops;
import java.util.Scanner;
/*
 Write a return method that accepts an integer as input and calculates factorial and prints like output.
Input : 6
Output: 6!=65432*1=720
 */
public class For_While_4 {
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter an integer...");

		int num=scan.nextInt();
		long factor=1;

		if(num>0) {
			for(int i=1; i<=num; i++) {
				factor *=i;
			}
			System.out.println("Output: "+num+"!="+factor);
		}else {
			System.out.println("'integer num' must be positive!");
		}
	}
}