package scanner;
import java.util.Scanner;
//converts the DOUBLE number entered by the user to an integer
public class Scanner_6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a double number");

        double num1=scan.nextDouble();
        int num2=(int) num1;

        System.out.println(num2);
    scan.close();
    }

}
