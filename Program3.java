/* Write a program to find a greater number among 3 by using ternary operator. */

public class Program3 {
    public static void main(String args[]) {
        int a = 10, b = 20, c = 30;
        String d = (a > b) ? (a > c) ? "A is greater" : "b is greater" : (b > c) ? "B is greter" : "c is greater";
        System.out.println(d);
    }
}
