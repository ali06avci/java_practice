package loops;
import java.util.Arrays;
public class For_While_3_1 {
    public static void main(String[] args) {
        String str="Javaisalsoeasy";
        String output = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.lastIndexOf(str.charAt(i)) != str.indexOf(str.charAt(i))) {
                if (output.indexOf(str.charAt(i)) == -1) {
                    output += str.charAt(i)+",";
                }
            }
        }

        String[] chr = output.split(",");

        System.out.println(Arrays.toString(chr));
    }
}



