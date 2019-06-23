package ch09pc02;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author frank.olson
 * date 11/21/2017
 * purpose: to count the number of words in a string
 */
public class Ch09pc02 {

    public static void main(String[] args) {
        //variables
        String phrase;
        
        //create keyboard Scanner
        Scanner keyboard = new Scanner(System.in);
        
        //Request input from user
        System.out.print("Please enter a phrase: ");
        phrase = keyboard.nextLine();
        
        System.out.println("The number of words in your phrase is: " + wordCounter(phrase));
    }
    
    public static int wordCounter(String str)
    {
        StringTokenizer token = new StringTokenizer(str, " ", false);
        
        return token.countTokens();
    }
}
