package if_switch_ternary_stringmethods;
import java.util.Arrays;
import java.util.Scanner;
/*
	Create 2 words : name1 and name2
	if the name1 has even numbers of characters,
	then insert the second word in the middle of the first name
	if the first word has odd numbers
	Then print the “Name2 cannot be inserted in the name1”
	e.g:

	name1= mehmet
	name2= ahmet
	Print ==> mehahmetmet
	 */
public class If_Switch_Ternary_StringMethods_6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the first name...");
        String name1=scan.next();
        System.out.println("Please enter the second name...");
        String name2=scan.next();
        if(name1.length() %2==0) {
            System.out.println(name1.substring(0, (name1.length()/2))+name2+name1.substring(name1.length()/2));
        }else {
            System.out.println(name1 +" has not even numbers of characters!");
        }
        scan.close();
    }
}
