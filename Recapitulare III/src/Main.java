import MaximumFrequency.maximumFrequency;
import AnagramSolver.anagramSolver;
import StringToNumber.stringToNumber;
import FilterStringTemplate.filterStringTemplate;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean run = true;
        while(run){
            System.out.println ("""
                1. MaximumFrequency;\s
                2. AnagramSolver;\s
                3. StringToNumber;\s
                4. FilterStringTemplate;\s
                0. Quit""");
            System.out.print("Exercise to run: ");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1 ->  {
                    maximumFrequency.initialize(scanner);
                    System.out.println();
                }
                case 2 -> {
                    anagramSolver.initialize(scanner);
                    System.out.println();
                }
                case 3 -> {
                    stringToNumber.initialize(scanner);
                    System.out.println();
                }
                case 4 -> {
                    filterStringTemplate.initialize(scanner);
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