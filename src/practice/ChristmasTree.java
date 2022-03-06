package practice;
public class ChristmasTree {
    public static void main(String[] args) {
        int h=5;
        int r,c,x,y;

        for (r=0;r<h;r++) {
            for (c=0; c<h-r-1; c++) {
                System.out.print(" ");
            }
            for(x=0; x<r+1; x++) {
                System.out.print("*");
            }
            System.out.print("  ");

            for(x=0; x<r+1; x++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
