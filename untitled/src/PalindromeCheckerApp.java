import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean isPalindrome = true;
        System.out.println("Welcome to Palindrome Checker App Management System");
        System.out.print("Input Text : ");
        String text = sc.nextLine();
        for (int i = 0; i<text.length()/2; i++ ){
            if (text.charAt(i)!=text.charAt(text.length()-1-i)) {
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome) {
            System.out.println(text + " is a palindrome");
        }else{
            System.out.println(text + " is not a palindrome");
        }
    }
}
