package oca_questions;
public class OCA_q8_StringManipulation {

	public static void main(String[] args) {
		String str1 = "Java";
		String str2 = new String("java");

		//which code prints equal on the console

//		 	A)
//		 	str1.toLowerCase();
//			if(str1==str2)

//			B)
			if(str2.equals(str1.toLowerCase()))

//			C)
//			str1.toLowerCase();
//			if(str1.equals(str1.toLowerCase()))

//			D)
//			if(str1.toLowerCase() == str2.toLowerCase())

			{
		System.out.println("Equal");
	}else{
		System.out.println("Not Equal");
	}
	}
}