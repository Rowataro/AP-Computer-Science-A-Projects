
/**
 * Write a description of class ArrayList here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListPrograms
{
  public static void main(String[] args)
  {
      final int sentinel = 1;
      int choice = -1;
      do
      {
          menu();
          System.out.println("\nDo you want to test another program? Yes - 1 No - Any other integer");
          choice = input.nextInt();
      }while
      (choice != sentinel);
  }
  private static void menu()
      {   
          final int SORT = 1;
          final int SUM = 2;
          final int REMOVEDUP = 3;
          
          int choice = 0;
          System.out.println("\nWhich program do you want to execute?");
          do
          {
              displayOptions();
              System.out.print("Choice: ");
              choice = input.nextInt();
              switch(choice)
              {
                  case SORT:
                    ArrayList<Integer> I = new ArrayList<Integer>();
                    fill(5, I);
                    sort(I);
                    break;
                  case SUM:
                    break;
                  case REMOVEDUP:
                    break;
              }
              print(list);
              if(!(choice >= 1 && choice <= 3))
              {
                  System.out.println("Invalid choice.");
              }
          }while(!(choice >= 1 && choice <= 3));
  }
  private static void displayOptions()
  {
          System.out.println("\n\n  1. sort()");
          System.out.println("\n  2. sum()");
          System.out.println("\n  3. removeDuplicate()");
  }
  private static void fill(int total, ArrayList<Integer> list)
  {
      System.out.println("\nEnter " + total + " numbers");
      for(int count = 0; count < total; ++count)
      {
          System.out.print("Number + " + (total + 1) + ": ");
          list.add(input.nextDouble());
          System.out.println();
      }
  }
  private static void print(ArrayList<Object> list)
  {
      for(Object e: list)
      {
          System.out.println(e);
      }
  }
  
  private static void sort(ArrayList<Integer> list)
  {
      Collections.sort(list);
  }
  
  private static Scanner input = new Scanner(System.in);
}
