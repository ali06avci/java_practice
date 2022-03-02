package if_switch_ternary_stringmethods;
	/*
	     Ask user Name, Surname and credit card numbers than convert it to special form. (Initials for name and surname should be uppercase)
	(Check credit card number, if there aren’t 16 digit print “Invalid credit card number”
	Input :
	John White 1234234534561478

	Output :
	Name : J* W**

	CCN : ** ** **** 1478
	 */
import java.util.Scanner;
public class If_Switch_Ternary_StringMethods_1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your name..");
        String name=scan.next();

        System.out.println("Please enter your surname..");
        String surname=scan.next();

        System.out.println("Please enter your credit card numbers..");
        String cn=scan.next();

        if(cn.length()!=16) {
            System.out.println("Invalid credit card number");
        }

        name=name.substring(0, 1).toUpperCase()+name.substring(1).toLowerCase();
        surname=surname.substring(0, 1).toUpperCase()+surname.substring(1).toLowerCase();

        System.out.println("Name : "+name.charAt(0)+"*** "+surname.charAt(0)+"****"+"\nCCN : **** **** **** "+cn.substring(12));
        scan.close();
    }
}
