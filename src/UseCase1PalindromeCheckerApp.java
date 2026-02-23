// Use Case 1 - Application Entry & Welcome Message
import java.util.*;
public class UseCase1PalindromeCheckerApp{

    public static void main(String args[]){
        welcomeMessage();
        hardcodedPalindrome();
        stringReverse();
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
        System.out.println("Is it a palindrome? : " + test.equals(reverse));
    }
}