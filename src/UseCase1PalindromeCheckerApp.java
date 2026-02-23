// Use Case 1 - Application Entry & Welcome Message
import java.util.*;
public class UseCase1PalindromeCheckerApp{

    public static void main(String args[]){
        stringReverse();
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
