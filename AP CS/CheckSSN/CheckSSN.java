
/**
 * Write a description of class CheckSSN here.
 * Name: Jon Reyrao
 * Date: 9/12/17
 * Period: 8
 * Program Name: CheckSSN
 * Program Description: This program checks if a user-inputted line is a valid social security number. All characters must be digits, and have the exact form of DDD-DD-DDDD.
 */
import java.util.Scanner;

public class CheckSSN
{
   public static void main(String args[])
   {
    System.out.println("\nExact format of social security number: DDD-DD-DDDD, where D is a digit.");
    
    System.out.print("\nEnter in your social security number:");
   
    Scanner input = new Scanner(System.in);
   
    boolean validSSN = true;
    
    //Input: Social Security Number
    String SSN = input.nextLine();
    
    //Major Process: Error Checking
    
    //first form of error checking
    if(SSN.length() != 11)
    {
        validSSN = false;
    }
        
    //check if all characters are digits and hyphens are in the right place
    else
    {
    /* SSN should be all digits
       Important to note that although length is 11, Strings start at 
       index 0. So, SSN should go from index 0 to index 10, like in the
       for loop, but it still has 11 characters.
    */
       for(int count = 0; count < 11; ++count)
       {
            char ch = SSN.charAt(count);
                
            //These iterations (where the hyphens should be)
            //won't check if the character is a digit, but instead checks
            //if the character is a hyphen
            if(count == 3 || count == 6)
            {
                // if hypen in right place, then continue to next iteration
                if(ch != '-')
                {
                    validSSN = false;
                    break;
                }
            }
           
            else if(!Character.isDigit(ch))
            {
               validSSN = false;
               break;
            }
       }
    }
    
    //Output: Based on error checking, prints out if user inputted a valid SSN
    if(validSSN)
    {
        System.out.println("\n" + SSN + " is a valid social security number.");
    }
    
    else    
    {
        System.out.println("\n" + SSN + " is not a valid social security number.");
    }
 }
}