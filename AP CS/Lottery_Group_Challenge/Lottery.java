
/**
 * Name: Jon Reyrao
 * Date: 8/30/17
 * Period: 8
 * 
 * Program Description: This program randomly generates a lottery of a two-digit number.
 * It promts the user to enter a two-digit number, and determines whether the user wins accrding to
 * the follwing rules:
 * 1.If the user matches the lottery number in the exact order, the award is $10,000
 * 2.If all digits in the user input match all digits in the lottery number, the award is $3,000
 * 3. If one digit in the user input mathes a digit in the lottery number, the award is $1,000
 */
import java.util.Scanner;

public class Lottery
{
    public static void main(String args[])
    {
        //Input: two-digit number to be compared with randomly generated number
        Scanner input = new Scanner(System.in);
        
        System.out.println("\nEnter a two-digit number:");
        
        //double type just in case they put in doubles
        //however the userNumber will cast as an int
        double doubleInput = input.nextDouble();
        int userNumber = (int)doubleInput;
              
        if (userNumber < 0 || userNumber > 99)
        {
           //catches exception if the user enters below 0 or above 99
           //note: one digit numbers allowed, but it will have a 0 for the tens place.
           //example: 8 becomes 08
            System.out.println("\nNot a valid option. Result will be corrupted.");
        }
        
        //generate a random number within the range of 0-99
        //for future reference random generation should follow this format:
        //variable = (int)(Math.random()*max-min)+min
        int randomNumber = (int)(Math.random()*99);
               
        //gets the ones and tens digit for the random number and user number
        int randomOnes = randomNumber % 10; 
        int randomTens = randomNumber / 10;
        
        int userOnes = userNumber % 10;
        int userTens = userNumber / 10;
        
        System.out.println("\nThe lottery number is " + randomNumber);
        
        
        //logic:
        //follows lottery rules in program description
        
        //exact order means they get $10,000
        if(userNumber == randomNumber)
        {
            System.out.println("\nExact match: you win $10,000");
        }
        
        //the right digits but not right order means they get $3,000
        else if (userOnes == randomTens && userTens == randomOnes)
        {
            System.out.println("\nMatch all digits: you win $3,000");
        }
        
        //at least one right digit when comparing with random number means they 
        //get $1,000
        else if
        (
        userOnes == randomOnes || 
        userOnes == randomTens ||
        userTens == randomOnes ||
        userTens == randomTens
        )
        {
            System.out.println("\nMatch one digit: you win $1,000");
        }
        
        //no right digits means they don't get anything
        else
        {
            System.out.println("Sorry: no match");
        }
        
        //Output: Message stating what dollar amount they won, depending on matches of inputted number
        //to random number
    }
}