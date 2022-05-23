package practice;
public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a=3;
        int b=5;
        System.out.println("Before Swapping: " + "\n"+"a= "+a+" \n"+ "b= "+b);

        int temp= a;

        a=b;
        b=temp;

        System.out.println("After Swapping: " + "\n"+"a= "+a+" \n"+ "b= "+b);
    }
}
