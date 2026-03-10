import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Palindrome Checker App Management System");
        System.out.print("Enter text : ");
        String text = sc.nextLine();
        char[] arr = text.toCharArray();
        int start = 0;
        int end = arr.length - 1;
        boolean isPalindrome = true;
        while (start<end){
            if(arr[start]!=arr[end]){
                isPalindrome = false;
                break;
            }
            start ++;
            end --;
        }
        if(isPalindrome){
            System.out.println(text + " is a Palindrome");
        }else{
            System.out.println(text + " is not a Palindrome");
        }
        sc.close();
    }
}
