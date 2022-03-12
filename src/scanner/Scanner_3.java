package scanner;
import java.util.Scanner;
public class Scanner_3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the length");
        int length=scan.nextInt();

        System.out.println("Please enter the breadth");
        int breadth=scan.nextInt();

        int area=length*breadth;
        int perimeter=2*(length+breadth);

        System.out.println("Area: "+area+"\nPerimeter: "+perimeter);

        scan.close();
    }
}
