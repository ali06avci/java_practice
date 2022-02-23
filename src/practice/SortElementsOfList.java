package practice6;
import java.util.*;
public class SortElementsOfList {

    public static void main(String[] args) {
        //Sort all elements of the list
        List<String> zoo = new ArrayList<String>();
        zoo.add("Wolf");
        zoo.add("Lion");
        zoo.add("Bear");

        Collections.sort(zoo);
        System.out.println(zoo);
    }
}