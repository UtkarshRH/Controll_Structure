/* Write a program to find the grater number among the 4 by using the ternary operator. */

public class Program4 {
    public static void main(String args[]) {
        int a = 10, b = 20, c = 30, d = 40;
        String e = (a > b) ? (a > c) ? (a > d) ? "A is bigger" : "D is bigger" : "C is bigger"
                : (b > c) ? (b > d) ? "B is bigger" : "D is Bigger" : (c > d) ? "C is bigger " : "D is bigger";
        System.out.println(e);
    }
}
