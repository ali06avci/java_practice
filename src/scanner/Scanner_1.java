package scanner;
import java.util.Scanner;
public class Scanner_1 {
    //find the cube of a given number
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number...");

        int num=scan.nextInt();
        System.out.println(Math.pow(num, 3)/2);
        scan.close();
    }
}
