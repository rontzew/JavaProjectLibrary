package PrimeSum;

import java.util.Scanner;

/**
 * This program will procedurally add then display the sum of prime numbers up to a limit established
 * by user input. Example: INPUT -> OUTPUT : 20 -> 2 5 10 17
 */

public class primeSum {

    private static boolean checkIfPrime(int num){
        for(int i = 2 ; i <= num/2 ; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    private static int generateNextPrime(int prevPrime,int lim){
        for(int i = prevPrime + 1; i < lim ; i++){
            if(checkIfPrime(i)){
                return i;
            }
        }
        return prevPrime;
    }

    public static void prime(Scanner sc) {
        int sum = 0;
        int nextPrime;
        int prevPrime = 1;
        System.out.print("Insert upper limit: ");
        int lim = sc.nextInt();
        sc.nextLine();
        if (lim < 2) {
            System.out.println("No prime number has been found");
        } else if (lim == 2) {
            System.out.println(lim + " -> " + lim);
        } else {
            System.out.print(lim + " -> ");
            while (sum < lim) {
                nextPrime = generateNextPrime(prevPrime, lim);
                sum += nextPrime;
                if(sum > lim){
                    break;
                }else {
                    System.out.print(sum + " ");
                    prevPrime = nextPrime;
                }
            }
            System.out.println();
        }
    }
}
