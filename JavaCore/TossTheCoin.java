package JavaCore;

import java.util.Random;
import java.util.Scanner;

public class TossTheCoin {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int size  = 2;
        System.out.println("Choose 0-HEADS and 1-TAILS");
        int choose = sc.nextInt(size);
        int toss = rand.nextInt(size);
        if (toss == choose){
            System.out.println("You won.");
            System.out.println("Computer Lost. " );
        }
        if (toss!=choose){
            System.out.println("You lost.");
            System.out.println("Computer Won. " );
        }
    }
}
