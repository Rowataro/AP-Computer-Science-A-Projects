
/**
 * Write a description of class AverageScore here.
 * Name: Jon Reyrao
 * Date: 10/7/17
 * Period: 8
 * Program Name: AverageScore
 * Program Description: Calculates the average of a list of scores. Prints out how many
 * are above, equal, or below the average. Max size is 100 scores.
 */

import java.util.Scanner;

//ArrayList has the capabilities needed that a normal array doesn't have
//its size method returns the number of indexes that have elements,
//while the array's length method return the total number of indexes
import java.util.ArrayList;

public class AverageScore
{
    private static int maxSize = 100;
    
    public static void main(String args[])
    {   
        
        ArrayList<Integer> scores = new ArrayList<Integer>(maxSize);
       
        inputScores(scores);
        
        if(scores.size() > 0)
        {
            double average = calculateAverage(scores);
            if(average % 1 == 0)
            {
                System.out.println("\nAverage: " + (int)average); 
            }
            else
            {
                System.out.println("\nAverage: " + average); 
            }
            
            printDeviance(average, scores);
        }
    }
  
    //Note: arrays pass by reference, so the method does not need to return 
    //anything
    public static void inputScores(ArrayList<Integer> scores)
    {    
        Scanner input = new Scanner(System.in);
        
        System.out.println
        (
        "\nEnter scores. The maximum number that can be entered is " + maxSize + '.' +
        "\n\nEnter a negative number to quit."
        );
        
        int index = 0;
        double score = 0;
        do
        {   
           System.out.print("\nScore " + (index + 1) + ": ");
           score = input.nextDouble();
           
           //to prevent putting in a negative score into the array.
           if(score < 0)
           {
               break;
           }
           
           scores.add((int)score);
           
           // maxSize-1 because arrays start from 0.
           if(index == maxSize - 1)
           {
               System.out.println
               (
               "\nMaximum number of " + maxSize + " scores entered."
               );
           }
           
           ++index;
        }while(index <= maxSize-1); 
        
        System.out.println("\n" + scores.size() + " score(s) entered.");
    }
    
    public static double calculateAverage(final ArrayList<Integer> scores)
    {
        int sum = 0;
        
        for(int index = 0; index < scores.size(); ++index)
        {
            sum += scores.get(index);
        }
        
        double average = (double)sum/scores.size();
        return average;
    }
    
    //prints how many elements in the list are above or equal 
    //and below the average
    public static void printDeviance(double average, final ArrayList<Integer> scores)
    {
        //also accounts for those equal to average
        int aboveAverage = 0;
        
        int belowAverage = 0;
        
        for(int index = 0; index < scores.size(); ++index)
        {      
            if(scores.get(index) >= average)
            {
                ++aboveAverage;
            }
            
            else
            {
                ++belowAverage;
            }
        }
        
        System.out.println
        (
        "\n" + aboveAverage + " score(s) above or equal to the average." +
        "\n" + belowAverage + " score(s) below the average."
        );
    }
    
}
