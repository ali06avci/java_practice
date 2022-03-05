package list;
import java.util.ArrayList;
import java.util.List;
public class Question1 {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();

        list.add("Ali");
        list.add("John");
        list.add("Jane");
        list.add("Azra");
        list.add("Tony");
        list.add("Nuray");
        list.add("Mustafa");
        list.add("Nicole");
        list.add("Edison");
        for(int i=0; i<list.size();i++)
        {
            if(list.get(i).contains("a")){
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}