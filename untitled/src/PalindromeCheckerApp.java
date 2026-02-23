import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main (String[] args){
        System.out.println("Welcome to Palindrome Checker App Management System");
        Scanner sc = new Scanner(System.in);
        System.out.println ("Enter text : ");
        String text = sc.nextLine();
        String reversedText = "";
        for (int i = text.length() - 1; i>=0; i--)
            reversedText += text.charAt(i);
        if(text.equalsIgnoreCase(reversedText))
            System.out.println(text + " is a palindrome");
        else
            System.out.println(text + " is not a palindrome");
    }
}
