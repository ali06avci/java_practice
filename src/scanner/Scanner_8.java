package scanner;
import java.util.Scanner;
		// converts the entered time to seconds
public class Scanner_8 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the hour value");
        int hour=scan.nextInt();
        System.out.println("Please enter the minute value.");
        int minute=scan.nextInt();
        System.out.println("Please enter the second value");
        int second=scan.nextInt();

        int result= hour*3600+minute*60+second;

        System.out.println(result+" seconds");
        scan.close();
    }
}
