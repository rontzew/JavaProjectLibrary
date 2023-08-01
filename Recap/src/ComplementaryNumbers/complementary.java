package ComplementaryNumbers;

import java.util.Scanner;

/**
    Receives a number (from keyboard) and computes the complementary
    (The complementary number is the one that, summed with the given number,
    results in the nearest power of 10 of the given number).
 */

public class complementary {

    private static int calculateDigits(int n){
        int cnt = 0;
        while(n > 0){
            cnt++;
            n /= 10;
        }
        return cnt;
    }

    private static int returnComplementary(int n){
        if(n == 0){
            return 0;
        }
        return (int)Math.pow(10, calculateDigits(n)) - n;
    }

    public static void findComplementary(Scanner scanner){
        System.out.print("Insert number to calculate complementary: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Complementary number is: " + returnComplementary(n) + ".");
    }
}
