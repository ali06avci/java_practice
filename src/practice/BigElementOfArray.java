package practice;
import java.util.Arrays;
public class BigElementOfArray {
    public static void main(String[] args) {
	       //Please find the biggest element in the given array
        int [] array = {1,24,2,342,123,543,54,3,2};

        //1. way:
        int max=0;
        for (int w : array) {
            if(max <= w) {
                max = w;
            }
        }
        System.out.println("The biggest number is: " + max);

        //2. way:
//        Arrays.sort(array);
//        System.out.println(array[array.length-1]);
    }
}
