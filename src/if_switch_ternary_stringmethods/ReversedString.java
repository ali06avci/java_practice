package if_switch_ternary_stringmethods;
public class ReversedString {
    public static void main(String[] args) {
        String str = "You'll Never Walk Alone";
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }
        System.out.println(reversed);
    }
}
