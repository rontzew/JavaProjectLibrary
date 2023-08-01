import BubbleSort.bubbleSort;
import FilterZeros.filterZero;
import PowRecursive.pow;
import ReverseNumRecursive.reverseNum;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean run = true;
        while(run){
            System.out.println ("""
                1. Reverse Number Recursive;\s
                2. Power Recursive;\s
                3. Filter Zeros;\s
                4. Bubble Sort;\s
                0. Quit""");
            System.out.print("Exercise to run: ");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1 ->  {
                    reverseNum.initialize(scanner);
                    System.out.println();
                }
                case 2 -> {
                    pow.initialize(scanner);
                    System.out.println();
                }
                case 3 -> {
                    filterZero.filter(scanner);
                    System.out.println();
                }
                case 4 -> {
                    bubbleSort.bubbles(scanner);
                    System.out.println();
                }
                case 0 -> {
                    System.out.println("Program will close") ;
                    run = false;
                    scanner.close();
                }
                default -> System.out.println("Wrong number inserted. Try again");
            }
        }
    }
}