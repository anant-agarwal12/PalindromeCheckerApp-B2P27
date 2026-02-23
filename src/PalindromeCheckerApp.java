public class PalindromeCheckerApp {

    public static void main(String[] args[{
        hardcodedPalindrome();
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
            System.out.println("Is it a Palindrome? : false");
        else
            System.out.println("Is it a Palindrome? : true");
    }
}