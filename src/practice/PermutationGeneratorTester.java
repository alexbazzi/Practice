package practice;

/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */

/**
 *
 * @author alexbazzi
 */
import java.util.ArrayList;
import java.util.Scanner;

public class PermutationGeneratorTester
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String s = in.nextLine();
        
        PermutationGenerator permutator = new PermutationGenerator(s);
        
        ArrayList<String> arrayS = permutator.getPermutations();
        System.out.println("The permutations of the word " + s + " are: " + arrayS);
        System.out.println("And the size is: " + arrayS.size());
        
    }
}