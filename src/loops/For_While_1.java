package loops;
import java.util.Scanner;

public class For_While_1 {
	/*
         Ask user to enter a name and a character,
         then check how many times the character is repeated in the name using loops in the name
            e.g:
            char ch1= 'a' ;
            String name =“John came late"
            Expected Output: Number of a = 2
	 */
    public static void main(String[] args) {
        Scanner scan1=new Scanner(System.in);
        System.out.println("Please enter a name... ");
        String name=scan1.nextLine();

        Scanner scan2=new Scanner(System.in);
        System.out.println("Please enter a character...");
        char chr = scan2.nextLine().charAt(0);

        int count = 0;
        for(int i=0; i<name.length(); i++) {
            if(name.charAt(i) == chr) {
                count++;
            }
        }
        System.out.println("Number of " + chr +" = "+count);
        scan1.close();
        scan2.close();
    }
}
