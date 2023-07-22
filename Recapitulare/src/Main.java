import AmicalNumbers.findAmicalNumbers;
import ComplementaryNumbers.*;
import MultipleOf5.multipleOf5;
import PowsOfTheBase.*;
import PrimeSum.primeSum;
import PythagoreanTriples.pyTri;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean run = true;
        while(run){
            System.out.println ("""
                1. Find Complementary;\s
                2. Powers of the base;\s
                3. Multiple of 5;\s
                4. Friendly Numbers;\s
                5. Sums of prime numbers;\s
                6. Pythagorean triples;\s
                0. Quit""");
            System.out.print("Exercise to run: ");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1 ->  {
                    complementary.findComplementary(scanner);
                    System.out.println();
                }
                case 2 -> {
                    pow.displayPow(scanner);
                    System.out.println();
                }
                case 3 -> {
                    multipleOf5.mul5(scanner);
                    System.out.println();
                }
                case 4 -> {
                    findAmicalNumbers.amical(scanner);
                    System.out.println();
                }
                case 5 -> {
                    primeSum.prime(scanner);
                    System.out.println();
                }
                case 6 -> {
                    pyTri.triple(scanner);
                    System.out.println();
                }
                case 0 -> {
                    System.out.println("Program will close") ;
                    run = false;
                }
                default -> System.out.println("Wrong number inserted. Try again");
            }
        }
    }
}