
/**
 * Write a description of class ComputePi here.
 * Name: Jon Reyrao
 * Date: 9/14/17
 * Period: 8
 * Program Name: ComputePi
 * Program Description: Program that lets the user estimate Pi through Gottfried Leibniz's
 * series: π/4 = 1-(1/3)+(1/5)-(1/7)... = (-1)^n/(2(n)+1), where n is the nth term
 */

import java.util.Scanner;

public class ComputePi
{
  public static void main(String args[])
  {
      System.out.println
      (
      "This program calculates π through Gottfried Leibniz's series (starts from term 0): " +  
      "π/4 = 1-(1/3)+(1/5)-(1/7)......"
      );
      
      Scanner input = new Scanner(System.in);
      
      int terms = 0;
      
      do
      {
          System.out.print("\nEnter how many terms of the series you want to calculate: ");
      
          double nDouble = input.nextDouble();
          terms = (int)nDouble;
          
          if(terms<0)
          {
              System.out.println("\nTerms have to be greater than or equal to 0.");
          }
      }while (terms<0);
      
      double approximation = 0.0;
      
      double termSign = 1.0;
      
      for(int count = 0; count <=terms; ++count)
      {
          approximation += termSign/(2*count+1);
          
          //the series alternates sign every iteration (from positive to negative to positive...)
          termSign = -termSign;
      }
      
      //for integer results
      if(approximation % 1 == 0)
      {
          int intApproximation = (int)approximation;
          System.out.println
          (
          "\nThe series up to term " + terms + " calculates π to be " + 4*intApproximation + '.'
          );
      }
      
      else
      {
        System.out.println
        (
        "\nThe series up to term " + terms + " calculates π to be " + 4*approximation + '.'
        );
      }
  }
}
