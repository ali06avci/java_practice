package oca_questions;

public class OCA_q13_WhileLoop {
    public static void main(String[] args) {
        int x = 0;
        while (x++ < 10) {
        }
        String message = x > 10 ? "Greater than" : false;
        System.out.println(message + "," + x);
    }
}
