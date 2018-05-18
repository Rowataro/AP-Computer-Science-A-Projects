
/**
* Name: Jon Reyrao
 * Date: 9/22/17
 * Period: 8
 * Program Name: DaysInAYear
 * Program Description: Checks how many days are in the user-inputted year
 * The program has a method to print how many days are in a year 
 * (to make the main method less messy), 
 * and it has a method to check if the year is a leap year 
 * (the only case where the year has 366 days instead of 365 days).
 */

import java.util.Scanner;

public class DaysInAYear
{
   public static void main(String args[])
   {
       Scanner input = new Scanner(System.in);
       
       while(true)
       {
           //Major process included in this method
           printDaysInAYear();
          
           System.out.print
           (
           "\nDo you want to enter another year?" +
           "\nYes-Y   No-Any other character" +
           "\n\nChoice:"
           );
           
           char choiceToContinue = input.next().charAt(0);
           
           if(Character.toUpperCase(choiceToContinue) == 'Y')
           {
               continue;
           }
           
           else
           {
               break;
           }
       }
       
   }
   
   //This is the bulk of the program, and it just asks a user for a year.
   // It prints that the year has 365 days or 366 days in the case that the year is a leap year 
 
   public static void printDaysInAYear()
   {
       System.out.print("\nEnter a year: ");
       
       Scanner input = new Scanner(System.in);
       
       double doubleYear = input.nextDouble();
       
       int year = (int)doubleYear;
       
       boolean doNothing = false;
       
       if(year <=0)
       {
           System.out.println("\nThis is not a valid year.");
           doNothing = true;
       }
       
       if(!doNothing)
       {
           int daysInAYear = 0;
           
           if(isLeapYear(year))
           {
               daysInAYear = 366;
           }
           
           else
           {
               daysInAYear = 365;
           }
           
           //In the case that they enter 2017 as the year, the statement will be gramatically correct
           
           String tense = "";
           
           if(year == 2017)
           {
               tense = "is";
           }
          
           else
           {
               tense = "were";
           }
           
           System.out.println("\nThere " + tense + " " +daysInAYear + " days in the year " + year + '.');
       }
   }
   
   //This method is private because it doesn't need to be directly used in the main method
   private static boolean isLeapYear(int year)
   {
       return ((year % 4 == 0 && year % 100 !=0) || (year % 400 == 0));
   }
}
