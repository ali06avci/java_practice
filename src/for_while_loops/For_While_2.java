package for_while_loops;
import java.util.Scanner;
/*
		Ask user to enter 2 integer then find GCD (Greatest Common Divisor) and LCM (Least Common Multiple)
		Input :
		30 and 40

		Expected OutPut:
		GCD for 30 and 40 = 10
		LCM for 30 and 40 = 120
	 */
public class For_While_2 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the first integer...");
        int num1= scan.nextInt();

        System.out.println("Please enter the second integer...");
        int num2=scan.nextInt();

        int gcd=1;
        for(int i=1; i<=num1 && i<=num2; i++) {

            if(num1%i==0 && num2%i==0) {
                gcd=i;
            }
        }
        int lcm=1;
        System.out.println("GCD for " + num1 +" and "+ num2+" = "+gcd);
        System.out.println("LCM for " + num1 +" and "+ num2+" = "+ (lcm=(num1*num2)/gcd));
    }
}
