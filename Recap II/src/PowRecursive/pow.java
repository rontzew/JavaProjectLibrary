package PowRecursive;

import java.util.Scanner;

/**
 *  A recursive implementation of a power calculator.
 */

public class pow {

    public static void initialize(Scanner sc){
        System.out.print("Insert base: ");
        int base = sc.nextInt();
        sc.nextLine();
        System.out.print("Insert power: ");
        int power = sc.nextInt();
        sc.nextLine();

        System.out.println("base ^ power = " + myMathPow(base, power));
    }

    public static int myMathPow(int x, int y) {
        if (y == 0) {
            return 1;
        }

        return x * myMathPow(x, y - 1);
    }
}
