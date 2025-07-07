package RecursionDeepDive;

import java.util.Scanner;

public class AllSubSequenceOfString {
    void generateSubSequence(String str, int index, String path){
        if (index == str.length()){
            System.out.print(path + " ");
            return;
        }

        //For including the character

        generateSubSequence(str, index + 1, path + str.charAt(index));

        //For excluding the character

        generateSubSequence(str, index + 1, path);
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        AllSubSequenceOfString ac = new AllSubSequenceOfString();

        System.out.println("Enter the string: ");

        String inp = sc.nextLine();

        System.out.println("All the subsequence are: ");

        ac.generateSubSequence(inp, 0, "");
    }
}
