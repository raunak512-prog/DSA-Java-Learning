package QueuePrac.MiniCodingChallenge;
import java.util.*;
public class StringPalindromeUsingDeque {

    static boolean isPalindrome(String input) {
        Deque<Character> dq = new LinkedList<>();

        // Step 1: Add all characters to deque
        for (char c : input.toCharArray()) {
            dq.add(c);
        }

        // Step 2: Compare front and rear
        while (dq.size() > 1) {
            if (dq.pollFirst() != dq.pollLast()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word:");
        String str = sc.nextLine();

        if (isPalindrome(str)) {
            System.out.println(str + " is a Palindrome.");
        } else {
            System.out.println(str + " is NOT a Palindrome.");
        }
    }
}
