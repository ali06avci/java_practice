package practice;
import java.util.Arrays;
public class SortArray {
    public static void main(String[] args) {
		/*
	    Given the array below, sort array elements in ascending and descending order
	     */
        int [] array = {6,24,404,245,123,601,375,3,2,2};
        Arrays.sort(array);
        System.out.println("before: " +Arrays.toString(array));

        for(int i=0; i<array.length; i++) {
            for(int j=i+1; j<array.length; j++) {
                if(array[i] <= array[j]) {
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.println("after: "+Arrays.toString(array));
    }
}
