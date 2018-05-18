
/**
 * Write a description of class ArrayList here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class ArrayListPrograms
{
  public static void main(String[] args)
  {
      final int cont = 1;
      int choice = -1;
      do
      {
          menu();
          System.out.println("\nDo you want to test another program? Yes - " + cont +" No - Any other integer");
          choice = input.nextInt();
          if(choice != cont)
          {
              System.out.println("\nYou have exited the program.");
          }
      }while
      (choice == cont);
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
              System.out.print("\nChoice: ");
              choice = input.nextInt();
              switch(choice)
              {
                  case SORT:
                    ArrayList<Integer> I = new ArrayList<Integer>();
                    fillInt(5, I);
                    sort(I);
                    System.out.println("\nSorted in increasing order: " + I);
                    break;
                  case SUM:
                    ArrayList<Double> D = new ArrayList<Double>();
                    fillDouble(5, D);
                    System.out.println("\nSum of elements: " + sum(D));
                    break;
                  case REMOVEDUP:
                    ArrayList<Integer> I2 = new ArrayList<Integer>();
                    fillInt(10, I2);
                    removeDuplicate(I2);
                    break;
              }
                
              if(!(choice >= 1 && choice <= 3))
              {
                  System.out.println("\nInvalid choice.");
              }
          }while(!(choice >= 1 && choice <= 3));
  }
  private static void displayOptions()
  {
          System.out.println("\n  1. sort()");
          System.out.println("\n  2. sum()");
          System.out.println("\n  3. removeDuplicate()");
  }
  private static void fillInt(int total, ArrayList<Integer> list)
  {
      System.out.println("\nEnter " + total + " integers\n");
      for(int count = 0; count < total; ++count)
      {
          System.out.print("Number " + (count + 1) + ": ");
          list.add(input.nextInt());
          System.out.println();
      }
  }
  private static void fillDouble(int total, ArrayList<Double> list)
  {
      System.out.println("\nEnter " + total + " numbers\n");
      for(int count = 0; count < total; ++count)
      {
          System.out.print("Number " + (count + 1) + ": ");
          list.add(input.nextDouble());
          System.out.println();
      }
  }
  private static void sort(ArrayList<Integer> list)
  {
      for(int index = 0; index < list.size()-1; ++index)
      {
          int currentMin = list.get(index);
          int currentMinIndex = index;
          for(int index2 = index+1; index2 < list.size(); ++index2)
          {
              if(currentMin > list.get(index2))
              {
                  currentMin = list.get(index2);
                  currentMinIndex = index2;
              }
          }
          
          if(currentMinIndex != index)
          {
              Collections.swap(list, index, currentMinIndex);
          }
      }
  }
  private static double sum(final ArrayList<Double> list)
  {
      double total = 0;
      for(Double e: list)
      {
          total+= e;
      }
      return total;
  }
  //prints unique list of numbers in a list. delete duplicates actually goes
  //through and deletes
  private static void removeDuplicate(ArrayList<Integer> list)
  {
      //Set object does not allow duplicates
      Set<Integer> uniqueSet = new HashSet<>(list);
      list.clear();
      list.addAll(uniqueSet);
      
      System.out.print("The distinct integers are ");
      sort(list);
      for(int e: list)
      {
          System.out.print(e + " ");
      }
      System.out.println();
  }
  private static Scanner input = new Scanner(System.in);
}
