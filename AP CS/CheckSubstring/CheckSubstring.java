
/**
 * Write a description of class CheckSubstring here.
 * Name: Jon Reyrao
 * Date: 9/8/17
 * Period: 8
 * Program Name: CheckSubstring
 * Program Description: This program checks if the second user-inputted string is a substring (i.e. contains the other string)
 * of the first user-inputted string
 */

import java.util.Scanner;

public class CheckSubstring
{
   public static void main(String args[])
   {
       System.out.println("\nThis program is case-sensitive");
       
       System.out.print("\nEnter in your first string:");
       
       Scanner input = new Scanner(System.in);
       
       //Input: Two user inputted strings
       String string1 = input.nextLine();
      
       System.out.print("\nEnter in your second string:");
       
       String string2 = input.nextLine();
       
       //Output: Prints whether string is a substring, using string method contains
       if(string1.contains(string2))
       {
           System.out.println("\n" + string2 + " is a substring of " + string1);
       }
       
       else
       {
           System.out.println("\n" + string2 + " is not a substring of " + string1);
       }
    }
    
   
}
