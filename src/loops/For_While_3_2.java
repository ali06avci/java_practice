package loops;
public class For_While_3_2 {
    public static void main(String[] args) {
		int count=0;
		String str = "Javaisalsoeasy";

		char string[] = str.toCharArray();

		System.out.print("Output:");

		for(int i=0; i<string.length; i++) {
			count=1;
					for(int j=i+1; j<string.length; j++) {

						if(string[i] == string[j] && string[i] != ' ') {
							count++;
							string[j]='0';
						}

					}
					 if(count > 1 && string[i] != '0')

						 System.out.print(string[i]);
			}
    }
}



