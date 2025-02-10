package Homezadacha1;

import java.util.Scanner;

public class maxOfThree {
    public class MaxOfThree {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("enter number: ");
            int a = scanner.nextInt();

            System.out.print("enter number: ");
            int b = scanner.nextInt();

            System.out.print("enter number: ");
            int c = scanner.nextInt();
            if (b > a) {
                a = b;
            }
            if (c > a) {
                a = c;
            }
            System.out.println("max number: " + a);

        }
    }
}