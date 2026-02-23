import java.util.*;
public class PalindromeCheckerApp {

    public static void main(String[] args){
        welcomeMessage();
        hardcodedPalindrome();
        stringReverse();
        charArray();
    }

    public static void welcomeMessage(){
        System.out.println("Welcome to the Palindrome Checker System");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully\n");
    }

    public static void hardcodedPalindrome(){
        String test = "madam";
        System.out.println("Hardcoded Palindrome Checker:");
        System.out.println("Input text: madam");

        int j=test.length()-1;
        boolean notPalindrome = false;
        for(int i=0 ; i<test.length()/2 ; i++){
            if(test.charAt(i)!=test.charAt(j)) {
                notPalindrome = true;
                break;
            }
            j--;
        }

        if(notPalindrome)
            System.out.println("Is it a Palindrome? : false\n");
        else
            System.out.println("Is it a Palindrome? : true\n");
    }

    public static void stringReverse(){
        System.out.println("Palindrome Checker Using String Reverse:");
        System.out.println("Input text: madam");
        String test = "madam";
        String reverse = "";
        for(int i = test.length()-1 ; i>=0 ; i--){
            reverse = reverse + test.charAt(i);
        }
        System.out.println("Is it a palindrome? : " + test.equals(reverse)+'\n');
    }

    public static void charArray(){
        System.out.println("Palindrome Checker Using Char Array:");
        System.out.println("Input text: radar");
        String test = "radar";
        char[] chars = test.toCharArray();

        int i=0 , j=test.length()-1;
        boolean palindrome = true;
        while(i<=j){
            if(chars[i]!=chars[j]){
                palindrome = false;
                break;
            }
            i++;
            j--;
        }
        System.out.println("Is it a palindrome? : "+palindrome);
    }
}
