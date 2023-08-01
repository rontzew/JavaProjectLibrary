package PythagoreanTriples;

import java.util.Scanner;

/**
 *This program will compute pythagorean triples (number 'a', 'b' and 'c', that satisfy the condition a^2 + b^2 = c^2), up to the limit given as input by the user.
 *Method of work: This iterates through 'a' up to the limit, then through 'b' for each 'a' value. We obtain a value for c^2 and check if 'c' is an integer.
 *If it is, we have found a triplet. The values of 'a' and 'b' will be displayed in ascending order.
 *It is to be noted that the smallest Pythagorean triple is formed with 3, 4 and 5, therefore we will start iterating from a = 3, and b = 4, respectively.
 */

public class pyTri {

    public static void triple(Scanner sc){
        System.out.print("Insert upper limit: ");
        int lim = sc.nextInt();
        sc.nextLine();

        for(int i = 3; i <= lim; i++){
            for(int j = i; j <= lim; j++){
                int k2 = i * i + j * j;
                int k = (int)Math.sqrt(k2);
                if(k * k == k2 && k <= lim){
                    System.out.println(i + " " + j + " " + k);
                }
            }
        }
    }
}
