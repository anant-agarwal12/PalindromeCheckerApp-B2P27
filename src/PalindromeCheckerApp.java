public class PalindromeCheckerApp {

    public static void main(String[] args){
        charArray();
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