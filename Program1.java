/* Write a Program to find greater among of 4 by using nested if. */
public class Program1 {
    public static void main(String args[]) {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        if (a > b) {
            if (a > c) {
                if (a > d) {
                    System.out.println("a is Bigger");
                } else {
                    System.out.println("d is Bigger");
                }
            }
        } else if (b > c) {

            if (b > d) {
                System.out.println("b is bigger");
            } else {
                System.out.println("d is Bigger");
            }
        } else if (c > d) {
            System.out.println("c is bigger");
        } else {
            System.out.println("d is bigger");
        }
    }
}
