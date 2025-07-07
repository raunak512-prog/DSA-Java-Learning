package RecursionDeepDive;

import java.util.Scanner;

public class AllPermutations {

    void Permutation(String path, String remaining){
       if (remaining.length() == 0){
           System.out.println(path);
           return;
       }
        for (int i = 0; i < remaining.length(); i++) {
            char ch = remaining.charAt(i);  // Choose one character

            // Remove ch from remaining
            String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);

            // Add ch to path and go deeper
            Permutation(path + ch, newRemaining);
        }
    }

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      AllPermutations sp = new AllPermutations();

      System.out.println("Enter a string: ");
      String input = sc.nextLine();

      System.out.println("All permutations are: ");
      sp.Permutation("", input);  // Start with empty path and full string
   }
}
