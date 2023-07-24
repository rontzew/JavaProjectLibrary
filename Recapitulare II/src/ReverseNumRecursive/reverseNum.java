package ReverseNumRecursive;

import java.util.Scanner;

public class reverseNum {
    private static int reverse(int num){
        int reversed = 0;
        if(num > 0) {
            int copy = num;
            int digits = 0;
            while(copy > 0){
                digits++;
                copy /= 10;
            }
                System.out.println(num);
                reversed += (num % 10) * Math.pow(10, digits - 1) + reverse(num /10);
                System.out.println("reversed = " + reversed);
            }
        return reversed;
    }

    public static void initialize(Scanner sc){
        System.out.print("Insert number to be reversed: ");
        int num = sc.nextInt();
        sc.nextLine();
        System.out.println("reverseNumberR(" + num + ") -> " + reverse(num));
    }
}
