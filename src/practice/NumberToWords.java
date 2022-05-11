package practice;
import java.util.Scanner;

public class NumberToWords{

    public void pw(int n, String ch){
        String one[] = { " ", " one", " two", " three", " four", " five", " six", " seven", " eight", " nine", " ten",
                " eleven", " twelve", " thirteen", " fourteen", " fifteen", " sixteen", " seventeen", " eighteen",
                " nineteen" };

        String ten[] = { " ", " ", " twenty", " thirty", " forty", " fifty", " sixty", " seventy", " eighty", " ninety" };

        if (n > 19)
        {
            System.out.print(ten[n / 10] + one[n % 10]);
        }
        else
        {
            System.out.print(one[n]);
        }
        if (n > 0) {
            System.out.print(ch);
        }


    }

    public static void main(String[] args)
    {
        int n = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = scan.nextInt();
        scan.close();

        if (n <= 0)
        {
            System.out.println("Enter numbers greater than 0");
        }
        else
        {
            NumberToWords a = new NumberToWords();
            a.pw(((n / 1000) % 100), " thousand");
            a.pw(((n / 100) % 10), " hundred");
            a.pw((n % 100), " ");
        }
    }
}