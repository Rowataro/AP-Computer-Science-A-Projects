

/**
 * Name: Jon Reyrao
 * Date: 9/18/17
 * Period: 8
 * Program Name: ConsonantVowelCounter
 * Program Description: Program that counts how many vowels and consonants there in a user-inputted string.
 */

import java.util.Scanner;

public class ConsonantVowelCounter
{
 public static void main(String args[])
 {
     System.out.print("\nEnter a string: ");
     
     Scanner input = new Scanner(System.in);
     //Input: Words
     String userInput = input.nextLine();
    
     int vowelCounter = 0;
     
     int consonantCounter = 0;
     
     
     final char[] vowels = {'A', 'E', 'I', 'O', 'U'};
          
     //Major Process: Loop to iterate through the string and count the number of 
     //vowels and consonants 
     
     //Note: for lengths, it counts from 1 to the length of array, but arrays start from 0.
     //therefore, the for loop shoud iterate from 0 to length-1 times
     //otherwise, there will be an exception thrown for checking an index out of the range
     //of the array
     
     for(int count = 0; count < userInput.length(); ++count)
     {
         char ch = userInput.charAt(count);
         
         if(Character.isLetter(ch))
         {
             //checks if it is one of the vowels. if not, it is a consonant
             //it increments the appropriate counter for both.
             
             for(int count2 = 0; count2 < vowels.length; ++count2)
             {
                 if(Character.toUpperCase(ch) == vowels[count2])
                 {
                     ++vowelCounter;
                     break;
                 }
                 
                 //else if only executes if the character is not a vowel
                 //AND the loop has had the chance to check all indexes
                 //of the vowel array
                 
                 else if(count2 == vowels.length-1)
                 {
                    ++consonantCounter;
                 }
             }
            
         }
         
         else
         {
             continue;
         }
     }
     
     System.out.println
     (
     "\nThe number of vowels is " + vowelCounter + 
     "\nThe number of consonants is " + consonantCounter
     );
 }
}
