package MultipleOf5;

import java.util.Scanner;

/**
 * This code will display the closest multiple of 5, given an int input,
 * and the option to find a larger or smaller number than the input.
 */

public class multipleOf5 {

    public static void mul5 (Scanner sc){
        System.out.print("""
            Choose option: \s
            1)First multiple of 5 smaller than the chosen number; \s
            2)First multiple of 5 larger than the chosen number; \s
            Your choice:""");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Insert number: ");
        int num = sc.nextInt();
        sc.nextLine();

        int result = 0;

        if (num != 0){
            switch (choice) {
                case 1 -> result = 5 * (num / 5);
                case 2 -> result = 5 * (num / 5 + 1);
                default -> System.out.println("Option not available");
            }
        }
        System.out.println("(" + num + ") -> (" + result + ")" );
    }
}
