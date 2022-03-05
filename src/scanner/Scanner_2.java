package scanner;
import java.util.Scanner;
public class Scanner_2 {
    //Calculate how many years the given minute value is
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the minute value...");
        int min=scan.nextInt();

        int year=min/525600;
        int day=(min-(year*525600))/1440;
        if(min>=0){
            System.out.print(min+ " minute approximately "+year+" years "+day+" days");
        }else{
            System.out.print("You didn't enter a positive value!");
        }
        scan.close();
    }
}