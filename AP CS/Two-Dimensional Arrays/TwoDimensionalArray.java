/**
  * Write a description of class CardDraw here.
 * Name: Jon Reyrao
 * Date: 10/20/17
 * Period: 8
 * Program Name: Two-Dimensional Arrays
 * Program Description: 7 tasks of 2d Array
 * Tasks:
 *  1. Initialize an array with input values from user
 *  2. Print out array with each row on its own line
 *  3. Reassign array with random values between 0  and 99
 *  4. Print out array with each row on its own line
 *  5. Sum all elements. Use a variable named total to store the sum. Output total
 *  6. Summing elements by column. Sum the value of each column and output the results for 
 *  each column. Identify the results by column number
 *  7. Find which row has the largest sum. Use variable maxRow and indexOfMaxRow to track
 *  the largest sum and index of the row. For each row, compute its sum and update maxRow and 
 *  indexOfMaxRow if the new sum is greater.
 */
import java.util.Scanner;

public class TwoDimensionalArray
{
    public static void main(String[] args)
    {
        int totalRows = 10;
        int totalColumns = 10;
        int[][] array = new int [totalRows][totalColumns];
     
        //Task 1
        enterValues(array);
        
        //Task 2
        printArray(array);
        
        
        //Task 3:
        int min = 0;
        int max = 99;
        assignRandomValues(array, min, max);
        
        //Task 4
        printArray(array); 
        
        //Task 5
        int total = getTotal(array);
        System.out.println("\nTotal: " + total);
       
        //Task 6
        printColumnSum(array);
        
        //Task 7
        printLargestRow(array);
        
        
    }
    
    public static void enterValues(int[][] array)
    {
        int row = 0;
        int column = 0;
        
        Scanner userInput = new Scanner(System.in);
        int userChoice = 0;
        
        System.out.println("Enter a negative number to quit");
        
        do
        {
            //People count fromm 1
            System.out.print("\nColumn " + (column + 1) + " of row " + (row + 1) + ":");
            array[row][column] = userInput.nextInt();
            
            //to prevent a negative value from being entered into the array
            if(array[row][column] < 0)
            {
                break;
            }
            
            ++column;
            
            //reset the columns and go to the next row.
            if(column > array[row].length-1)
            {
                column = 0;
                ++row;
            }
        }while(row <= array.length -1); //arrays start from 0
    }
    
    public static void printArray(final int[][] array)
    {
        //People count from 1
        int rowCounter = 1;
        for(int[] row : array)
        {
            System.out.print("Row " + rowCounter + ": ");
            for(int column : row)
            {
                System.out.print(column + " ");
            }
            ++rowCounter;
            System.out.println();
        }
    }
    
    public static void assignRandomValues(int[][] array, int min, int max)
    {
        if(min > max)
        {
            int temp = min;
            max = min;
            min = temp;
        }
        
        for(int row = 0; row < array.length; ++row)
        {
          for(int column = 0; column < array[row].length; ++column)
          {
              array[row][column] = min + (int)(Math.random() * (max-min+1));
          }
        }
    }
    
    //sum of every number in the 2d array
    public static int getTotal(final int[][] array)
    {
        int total = 0;
        
        for(int row[] : array)
        {
            for(int column : row)
            {
                total+=column;
            }
        }
        
        return total;
    }
    
    public static void printColumnSum(final int[][] array)
    {
        
        for(int column = 0; column < array[0].length; ++column)
        {
            int columnSum = 0;
            for(int row = 0; row < array.length; ++row)
            {
                columnSum += array[row][column];
            }
            
            System.out.println("\nColumn " + (column+1)+ " sum: " + columnSum);
        }
    }
    
    public static void printLargestRow(final int[][] array)
    {
        int maxRow = 0;
        int indexOfMaxRow = 0;
    
        for(int row = 0; row < array.length; ++row)
        {
            int computeMaxRow = 0;
            for(int column = 0; column < array[row].length; ++column)
            {
                computeMaxRow += array[row][column];
            }
            
            if(computeMaxRow > maxRow)
            {
                maxRow = computeMaxRow;
                indexOfMaxRow = row;
            }
        }
        
        System.out.println("\nRow " + (indexOfMaxRow + 1) + " has the largest sum at " + maxRow);
    }
}