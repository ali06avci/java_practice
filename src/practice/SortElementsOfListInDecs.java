package practice;
import java.util.*;
public class SortElementsOfListInDecs {
    public static void main(String args[]) {
        //Sort all elements of list in reverse order / descending order

        ArrayList<Integer> myList = new ArrayList<Integer>();
        myList.add(38);
        myList.add(99);
        myList.add(12);
        myList.add(65);
        myList.add(6);
        myList.add(501);
        myList.add(375);
        myList.add(34);

        Collections.sort(myList,Collections.reverseOrder());
        System.out.println(myList);
    }

}