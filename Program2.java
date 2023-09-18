/* Write a program to find grater among 5 by using nested if. */

public class Program2 {
    public static void main(String agrs[]) {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;
        if (a > b) {
            if (a > c) {
                if (a > d) {
                    if (a > e) {
                        System.out.println("A is Greater");
                    } else {
                        System.out.println("E is Greater");
                    }
                }
            }
        } else if (b > c) {
            if (b > d) {
                if (b > d) {
                    if (b > e) {
                        System.out.println("b is Greater");
                    } else {
                        System.out.println("E is Greater");
                    }
                }
            }
        } else if (c > d) {

            if (c > e) {
                System.out.println("c is Greater");
            } else {
                System.out.println("E is Greater");

            }
        } else if (d > e) {
            System.out.println("D is Greater");
        } else {
            System.out.println("E is Greater");
        }
    }
}
