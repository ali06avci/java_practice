package scanner;
import java.util.Scanner;
//Ask the user to enter a Float value, convert it to short and print it in the console.
public class Scanner_5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a Float number");

        float num1=scan.nextFloat();
        short num2=(short) num1;
        System.out.println(num2);
        scan.close();
    }
}
