package FilterStringTemplate;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This program will take an array of Strings (singular words), a key word (String key) and a
 * matchKey (degree of similarity; ex: 2 means there are two common
 * letters on the same position, between an element of the array of Strings and the key word).
 */

public class filterStringTemplate {

    private static int checkWord(String word, String keyWord){
        int maxSimilarity = 0;
        int similarity = 0;
        int maxLen = Math.min(word.length(), keyWord.length());
        boolean consecutive = false;
        for (int i = 0; i < maxLen; i++){
            if(word.charAt(i) == keyWord.charAt(i)){
                similarity++;
                if(!consecutive){
                    consecutive = true;
                }
            }else{
                if (similarity > maxSimilarity){
                    maxSimilarity = similarity;
                }
                similarity = 0;
                consecutive = false;
            }
        }
        if (similarity > maxSimilarity){
            maxSimilarity = similarity;
        }
        return maxSimilarity;
    }

    private static void analyzeWord(ArrayList<String> words, String keyWord, int matchKey){
        ArrayList <String> result = new ArrayList<>();

        for(String word : words){
            if(checkWord(word.toLowerCase(), keyWord.toLowerCase()) >= matchKey){
                result.add(word);
            }
        }
        System.out.print("RETURN: " + result);
    }

    public static void initialize(Scanner sc){
        System.out.print("This is an array of words to be checked. Insert a word: ");
        ArrayList<String> words = new ArrayList<>();
        while(true){
            String addWord = sc.next();
            if(addWord.equalsIgnoreCase("stop")){
                break;
            }
            else{
                words.add(addWord);
                System.out.print("Insert a word or \"stop\" to finish the array: ");
            }
        }
        System.out.print("Insert the key word to match with: ");
        String keyWord = sc.next().toLowerCase();
        System.out.print("Insert matchKey(degree of similarity): ");
        int matchWord = sc.nextInt();
        sc.nextLine();

        System.out.println("ARGUMENTS: " + words + ", " + keyWord + ", " + matchWord);
        analyzeWord(words, keyWord, matchWord);
    }
}
