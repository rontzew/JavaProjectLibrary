package FilterZeros;

import java.util.Arrays;
import java.util.Scanner;

/**
 * This code will extract the zeros in an array and place them in front, leaving all other non-zero elements in order;
 */

public class filterZero {

    public static void filter(Scanner sc){
        System.out.print("Insert number of elements of array: ");
        int dim = sc.nextInt();
        sc.nextLine();
        int[] array = new int[dim];
        int[] result = new int[dim];
        for(int i = 0; i < dim; i++){
            System.out.print("Insert element number " + (i+1) + ": ");
            array [i] = sc.nextInt();
            sc.nextLine();
        }
        int end = 0;
        int start = 0;
        for(int i = dim - 1; i >= 0; i--){
            if (array[i] != 0){
                result[dim - end - 1] = array[i];
                end++;
            }else{
            result[start] = array[i];
            start++;
        }
    }
        System.out.println(Arrays.toString(array) + " - > " + Arrays.toString(result));
    }
}
