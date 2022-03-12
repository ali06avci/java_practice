package list;
import java.util.*;
public class List_02 {
    //swapping two elements
    public static void main(String[] args) {
        String names[]= {"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};

        String temp=names[2];
        names[2]=names[7];
        names[7]=temp;

        System.out.println(Arrays.toString(names));
    }
}
