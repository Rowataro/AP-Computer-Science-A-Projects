
/**
 Name: Jon Reyrao
 Data:  8/24/17
 Period: 8
 Program Name: Scanner
 Description: This program takes input from the user.
 */
//
import java.util.Scanner;

public class TheScannerClass
{
  public static void main(String[] args) 
  {
      Scanner input = new Scanner(System.in);
      
      System.out.println("\nEntere the year you were born: ");
      int born = input.nextInt();
      
      System.out.println("Enter the current year: ");
      int year = input.nextInt();
      
      input.nextLine(); //to clear the buffer
      
      System.out.println("Enter your name");
      String name = input.nextLine();
      
      System.out.print(name + ". This year you will turn " + (year-born));
  }
}
