
/**
 * Name: Jon Reyrao
 * Date: 9/14/17
 * Period: 8
 * Program Name: BasicCalc 2.0
 * Program Description: Basic calculator that allows the user to either add, subtract, multiply, or divide
 * for integer operands. It outputs the result
 * Revisions:
    One return, and one exit
    Control loop so the user can decide when to quit the program
    Allow user to decide how many times to do an operation
    Use of BigDecimal class for precision of result
    Calculator is accurate up to 6 decimal places
 */

import java.util.Scanner;
//for result precision
import java.math.BigDecimal;
import java.math.RoundingMode;

public class BasicCalculator
{
    public static void main(String[] args)
    {
        while(true)
        {
            System.out.println
            (
            "\nOptions:" +
            "\n1. Addition" +
            "\n2. Subtraction" +
            "\n3. Multiplication" +
            "\n4. Division" +
            "\n\nNote: This program cannot handle operands that are fractions."
            );
            
            Scanner input = new Scanner(System.in);

            //Input: operation choice and operands of operation
            System.out.print("\nChoice: ");
        
            double doubleChoice = input.nextDouble();
            int choice = (int)doubleChoice;
        
            boolean doNothing = false; 
        
            if(choice <1 || choice >4)
            {
                //premature input checking for choice
                System.out.println("\nNot a valid option.");
                doNothing = true;
            }
        
            if(doNothing)
            {
            }
        
            else
            {
                int maxTimes = 0;
                
                do
                {
                    System.out.print("\nPut in how many times you want to do the operation: ");
                    double doubleTimes = input.nextDouble();
                    maxTimes = (int)doubleTimes;
                    if(maxTimes < 2)
                    {
                        System.out.println("\nDo an operation at least two times.");
                    }
                }while(maxTimes<2);
                
                System.out.println("\nEnter in operand 1: ");
                BigDecimal result = input.nextBigDecimal();
                
                switch(choice)
                {
                    //addition
                    case 1:
                        for(int count = 2; count <= maxTimes; ++count)
                        {
                            System.out.print("\nEnter in operand " + count + ": " );
                        
                            result = result.add(input.nextBigDecimal());
                        
                            System.out.println("\nResult: " + result);
                        }
                    break;

                    //subtraction
                    case 2:
                        for(int count = 2; count <= maxTimes; ++count)
                        {
                            System.out.print("\nEnter in operand " + count + ": " );
                      
                            result = result.subtract(input.nextBigDecimal());
                            
                            System.out.println("\nResult: " + result);
                        }
                    break;
            
                    //multiplication
                    case 3:
                        for(int count = 2; count <= maxTimes; ++count)
                        {
                            System.out.print("\nEnter in operand " + count + ": " );
                         
                            result = result.multiply(input.nextBigDecimal());
          
                            System.out.println("\nResult: " + result);
                        }
                    break;

                    //division
                    case 4:
                        System.out.println("\nNote: Division is accurate up to 3 decimal places.");
                     
                        for(int count = 2; count <= maxTimes; ++count)
                        {
                            System.out.print("\nEnter in operand " + count + ": " );
                       
                            //rounding to handle infinitely repeating decimals
                        
                            result = result.divide(input.nextBigDecimal(), 3, RoundingMode.HALF_UP);
                        
                            System.out.println("\nResult: " + result);
                        }
                     
                    break;
                }
        
        //Output: the result, which is either a sum, difference, product, or quotient,
        //based on the operation chosen
        
        System.out.println("\nDo you want to continue? (Yes-Y No-Any other character)");
       
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
   }
}
