package for_while_loops;
/*
	 Print even numbers from 20 to 0 but do not use decrement (i--).

	OUTPUT : Even Numbers from 20 to 0 are: 20 18 16 14 12 10 8 6 4 2 0
	 */
public class For_While_5 {
	public static void main(String[] args) {
		String evenNumber="";
		int num=20;
		for(int i=0; i<=10; i++ ) {
			evenNumber+=num+" ";
			num=num-2;
		}
		System.out.print("Even Numbers from 20 to 0 are: "+evenNumber);
	}
}
