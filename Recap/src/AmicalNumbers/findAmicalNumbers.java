package AmicalNumbers;

import java.util.Scanner;

/**
 * Given a lower and upper limit, this code will identify all the "friendly numbers"
 * within the range. A pair of friendly numbers imply the sums of divisors of the numbers is equal.
 * Possible improvements to be made to the code:
 *  -replacing while loop with for loop in getSumDiv() method;
 *  -removing StringBuilder method (output line by line in while loop of amical() method).
 */

public class findAmicalNumbers {

    private static int getSumDiv(int num){
        int sumDiv = 0;
        int cnt = 1;
        while (cnt <= num/2){
            if(num % cnt == 0){
                sumDiv += cnt;
            }
            cnt++;
        }
        return sumDiv;
    }

    private static int getFriend(int num){
        int possibleFriendOfNum = getSumDiv(num);
        int possibleFriendOfPossibleFriendOfNum = getSumDiv(possibleFriendOfNum);
        if(possibleFriendOfPossibleFriendOfNum == num){
            return possibleFriendOfNum;
        }
        return num;
    }

    public static void amical(Scanner sc){
        System.out.print("Provide a lower limit: ");
        int lowLim = sc.nextInt();
        sc.nextLine();
        System.out.print("Provide a higher limit: ");
        int highLim = sc.nextInt();
        sc.nextLine();

        StringBuilder result = new StringBuilder();

        int num = lowLim;

        while(num < highLim){
            int friend = getFriend(num);
            if (num < friend){
                result.append(num);
                result.append(" ");
                result.append(friend);
                result.append("\n");
            }
            num++;
        }
        System.out.println("Input: [" + lowLim + ", " + highLim + "] \n" + result);
    }
}
