package BubbleSort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * A basic algorithm for bubble sorting.
 */

public class bubbleSort {

    private static void swap (int[] array, int posA, int posB){
        int aux = array[posA];
        array[posA] = array[posB];
        array[posB] = aux;
    }

    private static int[] sort(int[] array){
        int size = array.length;
        for(int i = 1 ; i < array.length; i++){
            for (int j = 1; j < size; j++) {
                if (array[j - 1] > array[j]) {
                    swap(array, j - 1, j);
                }
            }
            size--;
        }
        return array;
    }

    public static void bubbles(Scanner sc){
        System.out.print("Insert number of elements: ");
        int dim = sc.nextInt();
        sc.nextLine();
        int [] array = new int[dim];
        for (int i = 0; i < dim; i++) {
            System.out.print("Insert element " + (i + 1) + ": ");
            array[i] = sc.nextInt();
            sc.nextLine();
        }
        System.out.println(Arrays.toString(array) + " -> " + Arrays.toString(sort(array)));
    }
}
