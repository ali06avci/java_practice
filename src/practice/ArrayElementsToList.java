package practice;
import java.util.*;
//Add elements of list to an Array and print them on the console
public class ArrayElementsToList {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        list1.add("Ali");
        list1.add("Kemal");
        list1.add("Susan");
        list1.add("Brian");
        list1.add("Peter");

        Object [] array = list1.toArray();
        System.out.println(Arrays.toString(array));

        List<String> list2 =new ArrayList(Arrays.asList(array));
        System.out.println(list2);
    }
}

