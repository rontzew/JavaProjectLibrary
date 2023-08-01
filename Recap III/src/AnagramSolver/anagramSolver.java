package AnagramSolver;

import java.util.Scanner;

/**
 * This program will compare two given sentences and find out if they are anagrams (if they contain the same characters)
 * Any non-letter caracter will be ignored.
 * Example: fairy tales! ↔ rail, safety
 */

public class anagramSolver {

    private static void filterString(StringBuilder givenSentence){ //removes any non-letter character
        int crt = 0;
        while (crt < givenSentence.length()){
            char crtChar = givenSentence.charAt(crt);
            if(crtChar >= 'a' && crtChar <= 'z'){
                crt++;
            } else {
                givenSentence.deleteCharAt(crt);
            }
        }
    }

    private static boolean solveAnagram(StringBuilder firstSentence, StringBuilder secondSentence){
        filterString(firstSentence);
        filterString(secondSentence);
        if(firstSentence.length() != secondSentence.length()){ //if sentences are not the same length they can't be anagrams
            return false;
        }

        while (firstSentence.length() > 0){
            int length = firstSentence.length(); //both sentences should be the same length
            char crt = firstSentence.charAt(0);
            for(int i = 0; i < secondSentence.length(); i++){ //if a pair of matching letters is found, it is removed from both sentences
                if(secondSentence.charAt(i) == crt){
                    firstSentence.deleteCharAt(0);
                    secondSentence.deleteCharAt(i);
                    break;
                }
            }
            if (length == firstSentence.length()){ // if the length is the same after "for" loop -> no match was found -> no anagram
                return false;
            }
        }
        return true;
    }

    public static void initialize(Scanner sc){
        System.out.print("First sentence: ");
        String first = sc.nextLine();
        StringBuilder firstSentence = new StringBuilder(first.toLowerCase());
        System.out.print("Second sentence: ");
        String second = sc.nextLine();
        StringBuilder secondSentence = new StringBuilder(second.toLowerCase());

        System.out.println("anagramSolver(\"" + first + "\", \"" + second + "\") -> " + solveAnagram(firstSentence, secondSentence));
    }
}
