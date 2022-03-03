package if_switch_ternary_stringmethods;
import java.util.Scanner;
/*
	 Write a Java program to find the number of days in a month.(Use Switch Case) (Interview Question / Leak Year)
	  Sample:
	      INPUT:
	    Input a month number: 2
	    Input a year: 2016
	      OUTPUT  :
	    February 2016 has 29 days
	 */
public class If_Switch_Ternary_StringMethods_4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the month number...");
        int month=scan.nextInt();
        System.out.println("Please enter the year...");
        int year=scan.nextInt();
        boolean leapyear;
        int day=0;

        if(year %4 ==0) {
            if(year %100 ==0) {
                if(year %400 ==0) {
                    leapyear=true;
                }else
                    leapyear=false;
            }else
                leapyear=true;
        }else
            leapyear=false;
        if(leapyear==true) {
            day=29;
        }else
            day=28;

        switch(month) {
            case 1:
                System.out.println("January "+year+" has 31 days");
                break;
            case 2:
                System.out.println("February "+year+" has "+day+" days");
                break;
            case 3:
                System.out.println("March "+year+" has 31 days");
                break;
            case 4:
                System.out.println("April "+year+" has 30 days");
                break;
            case 5:
                System.out.println("May "+year+" has 31 days");
                break;
            case 6:
                System.out.println("June "+year+" has 30 days");
                break;
            case 7:
                System.out.println("July "+year+" has 31 days");
                break;
            case 8:
                System.out.println("August "+year+" has 31 days");
                break;
            case 9:
                System.out.println("September "+year+" has 30 days");
                break;
            case 10:
                System.out.println("October "+year+" has 31 days");
                break;
            case 11:
                System.out.println("November "+year+" has 30 days");
                break;
            case 12:
                System.out.println("December "+year+" has 31 days");
                break;
            default:
                System.out.println("You did not enter a number between 1 and 12. \nPlease enter a number between 1 and 12 !");
        }
        scan.close();
    }
}
