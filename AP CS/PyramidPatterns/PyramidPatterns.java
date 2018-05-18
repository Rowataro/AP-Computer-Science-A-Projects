
/**
 Name: Jon Reyrao
 * Date: 9/14/17
 * Period: 8
 * Program Name: Pyramid Patterns
 * Program Description: Program that prints out 4 pyramid patterns (A,B,C, and D). The program does this through the use of nested loops.
 */
public class PyramidPatterns
{
   public static void main(String args[])
   {
       //Input: None
       //Major processes: Nested Loops to determine what each row prints, based on each column 
       
       System.out.println("\nPattern A: ");
       
       for(int row = 1; row <=6; ++row)
       {
           for(int column = 1; column <=row; ++column)
           {
               System.out.print(column+ " ");
           }
           
           System.out.println();
       }
       
       System.out.println("\nPattern B: ");
       
       for(int row = 6; row >=1; --row)
       {
           for(int column = 1; column <=row; ++column)
           {
               System.out.print(column + " ");
           }
           
           System.out.println();
       }
       
       
       System.out.println("\nPattern C: ");
       
        for(int row = 1; row <=6; ++row)
       {
           //like Pattern A, but with space formatting and numbers are backward
           for(int spaces = 0; spaces < 6-row; ++spaces)
           {
               //two spaces needed, or else pyramid will not be a right triangle
               System.out.print("  ");
           }
           
           for(int column = row; column >=1; --column)
           {
               System.out.print(column+ " ");
           }
           
           System.out.println();
       }
       
       
      
      System.out.println("\nPattern D: ");
       
      for(int row = 6; row >=1; --row)
      {
          //like Pattern B, but with space formatting
          for(int spaces = 0; spaces < 6 - row; ++spaces)
          {
              //two spaces needed, or else pyramid will not be a right triangle
              System.out.print("  ");
          }
          
          for(int column = 1; column <=row; ++column)
          {
              System.out.print(column + " ");
          }
           
          System.out.println();
      }
      
      //Output: Pyramid Patterns
    }
}
