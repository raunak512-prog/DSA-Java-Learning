package RecursionDeepDive;

import java.util.Scanner;

public class Palindrome {

    boolean isPalindrome(String str, int start, int end){
        if (start >= end)return true;
        if (str.charAt(start) != str.charAt(end))return false;

        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Palindrome pc = new Palindrome();

        System.out.println("Enter the string to check if it's a palindrome: ");
        String input = sc.nextLine();

        boolean result = pc.isPalindrome(input, 0, input.length() - 1);

        if (result){
            System.out.println("Yes, Its a palindrome.");
        }
        else {
            System.out.println("No, Its not a palindrome.");
        }
    }
}
