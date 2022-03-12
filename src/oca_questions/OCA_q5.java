package oca_questions;
public class OCA_q5 {
	//What is the output when num1 is given as 9?
	public static void main(String[] args) {
		int num1=9;
		int num2=num1++;

		if (num2<10){
			System.out.println(num2+" Hello World");
		}else {
			System.out.println(num1+" Hello World");
		}
	}
}