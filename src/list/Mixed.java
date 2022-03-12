package list;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
public class Mixed {
	public static void main(String[] args) {
		        Object[] obj = new Object[]{ "3", 4, "2", "5",1 ,6 };

		        TreeSet<Integer> list = new TreeSet<>();
		        List<Integer> intList = new ArrayList<>();

		        for (Object w: obj) {
		            if ( w instanceof Integer) {
		                list.add((int) w);
		                intList.add((int) w);
		            } else {
						list.add( Integer.valueOf((String) w) );
					}
		        }
		System.out.println(list);
		System.out.println(intList);
		        for (int i : list) {
		            if (intList.contains(i)) {
						System.out.print(i);
					} else {
						System.out.print("\"" + i + "\"");
					}
		            System.out.print(", ");
		        }
		    }
}
