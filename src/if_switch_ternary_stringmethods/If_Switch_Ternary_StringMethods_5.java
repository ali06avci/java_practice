package if_switch_ternary_stringmethods;

	/*
	 Ask user to type a name, the length of name should be 3.
	Then check if the name has same characters.	If the String has same characters
	Print “String has duplicate characters”
	Else
	Print “String has unique characters”
	Please use ternary.
	Input : ala
	OutPut:
	Your String has duplicate characters
	 */
import java.util.Scanner;
public class If_Switch_Ternary_StringMethods_5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a three letter name... ");
        String name=scan.next();
        int count=0;
        for(int i=0; i<name.length(); i++) {
            for(int j=i+1; j<name.length(); j++) {
                if(name.charAt(i) == name.charAt(j)) {
                    count++;
                }
            }
        }
        String result= (count!=0) ? "Your String has duplicate characters" : "Your String has unique characters";
        System.out.println(result);
        scan.close();
    }
}


