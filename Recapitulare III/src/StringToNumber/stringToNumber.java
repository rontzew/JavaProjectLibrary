package StringToNumber;

import java.util.Scanner;



public class stringToNumber {

    private static void sendMessage(){
        System.out.println("String contains non-digit characters. Try again.");
        System.out.print("Insert a String with only digits: ");
    }

    private static boolean verifyString(String input){
        for(int i = 0; i < input.length(); i++){
            if(!Character.isDigit(input.charAt(i))){
                return false;
            }
        }
        return true;
    }

    private static int convert(String input){
        final char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        int result = 0;
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < digits.length; j++) {
                if (input.charAt(i) == digits[j]) {
                    result = result * 10 + j;
                    break;
                }
            }
        }
        return result;
    }

    public static void initialize(Scanner sc){
        System.out.print("Insert a String with only digits: ");
        String input = sc.nextLine();
        while(!verifyString(input)){
            sendMessage();
            input = sc.nextLine();
        }
        System.out.println(convert(input) + " says: \" I look the same but now I am an integer!\"");
    }
}
