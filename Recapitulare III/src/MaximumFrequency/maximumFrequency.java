package MaximumFrequency;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * This program will display the non-symbol character that appears the most (and how often it appears) in a user-input sentence.
 * Ideas for improvement: This program only stores the current and maximum values. If we need to store all values of a sentence,
 * we can use a HashMap to do so, with the keys being the characters and the values can be updated to reflect the number of appearances.
 */

public class maximumFrequency {

    private static ArrayList<Character> convertInput (String input){
        input = input.toLowerCase();
        ArrayList<Character> result = new ArrayList<>();
        for(int i = 0; i < input.length(); i++){
            char crt = input.charAt(i);
            if(crt >= 'a' && crt <= 'z'){
                result.add(crt);
            }
        }
        return result;
    }

    private static String analyzeInput(ArrayList<Character> input){
        int maxAppearances = 0;
        StringBuilder result = new StringBuilder();
        char currChar = input.get(0);
        int currCharApp = 1;

        while (input.size() > 1) {
            if (input.get(1).equals(currChar)) {
                currCharApp++;
                input.remove(1);
                if (currCharApp == maxAppearances){
                    result.append('\n').append("Character '").append(currChar).append("' appears ").append(currCharApp).append(" times.");
                }else if(currCharApp > maxAppearances){
                    maxAppearances = currCharApp;
                    result.setLength(0);
                    result.append("Character '").append(currChar).append("' appears ").append(currCharApp).append(" times.");
                }
            } else {
                currChar = input.get(1);
                currCharApp = 1;
                input.remove(0);
            }
        }

        return result.toString();
    }

    public static void initialize(Scanner sc){
        System.out.print("Sentence to be analyzed: ");
        String input = sc.nextLine();
        ArrayList<Character> convInput = convertInput(input);
        System.out.println(analyzeInput(convInput));
    }
}
