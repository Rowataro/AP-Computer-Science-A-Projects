
/**
 * Name: Jon Reyrao
 * Date: 9/18/17
 * Period: 8
 * Program Name: Primes
 * Program Description: Program that prints out primes, with a new line every 10 primes
 *  Revisions:
 *  User can now enter how many primes they want to print and how many primes per line.
 *  Program has been made more modular with methods. Main method is less cluttered
 */


import java.util.Scanner;

public class Primes
{
   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in);
       
      System.out.print("\nEnter how many primes you want to print: ");
      
      int numberOfPrimes = input.nextInt();
      
      System.out.print("\nEnter how many primes per line: ");
      
      int primesPerLine = input.nextInt();
      
      printPrimes(numberOfPrimes, primesPerLine);
   }  
   
   public static void printPrimes(int numberOfPrimes, int primesPerLine)
   {
       int primeCounter = 0;
       boolean prime = true;
       
       int number = 2;
       
       do
       {
           prime=true;
           
           for(int factor = 2; factor <= Math.sqrt(number); ++factor)
           {
               if(number % factor == 0)
               {
                   prime = false;
                   break;
               }
               
           }
           
           if(prime)
           {
                System.out.print(number + " ");
                ++primeCounter;
               
                if(primeCounter % primesPerLine == 0)
                {
                    System.out.println();
                }
            }
            
           ++number;
       }while(primeCounter<numberOfPrimes);
   }
}
