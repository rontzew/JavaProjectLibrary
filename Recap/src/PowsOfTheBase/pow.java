package PowsOfTheBase;

import java.util.Scanner;

/**
 * Given a base and a power, this program will display all the calculations of the powers
 * Example: base = 2, power = 10; result: "2 10 -> 1 2 4 8 16 32 64 128 256 512 1024"
 */

public class pow {
    public static void displayPow(Scanner scanner){
        System.out.print("Insert base: ");
        int base = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Insert power: ");
        int pow = scanner.nextInt();
        scanner.nextLine();

        StringBuilder result = new StringBuilder(base + " " + pow + " -> ");
        int tmp = 0;
        while (tmp <= pow){
            result.append((int)Math.pow(base, tmp));
            result.append(" ");
            tmp++;
        }
        System.out.println(result);
    }
}
