package practice;
import java.util.*;

public class SortKeySetsOfMap {
    public static void main(String[] args) {
        /*
         * "a"  "One"
         * "b"  "Two"
         * "d"  "Four"
         * "c"  "Three
         * Sort the elements using Map
         */
        SortedMap map=new TreeMap<>();

        map.put("a","One");
        map.put("b","Two");
        map.put("d","Four");
        map.put("c","Three");

        System.out.println(map);
    }
}