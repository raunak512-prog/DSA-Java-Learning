package JavaCore;

import java.util.Scanner;
import java.util.Random;
public class rockpaper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Choose a number between 10, 20, 30.
        System.out.println("Choose a number between... |10-Rock, 20-Paper, 30-Scissor|");

        // Scanner class defined for taking input from the user and an JavaCore.array for storing numbers like, 10, 20, 30.
        int a = sc.nextInt();
            int[] numbers = {10, 20, 30};
        // importing random to make computer choose a random number b/w, 10, 20, 30.
            Random rand = new Random();
            int randomIndex = rand.nextInt(numbers.length);
            int randomNumber = numbers[randomIndex];

            //Conditions for how the basics of the works.
        if (a == randomNumber){
            System.out.println("NOBODY WON.");
        }
        else if ((a == 10 && randomNumber == 30) || (a == 20 && randomNumber == 10) || (a == 30 && randomNumber == 20)) {
            System.out.println("YOU WON.");
        }
        else {
            System.out.println("COMPUTER WON.");
        }
    }
}
