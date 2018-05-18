
/**
 * Write a description of class TotalLetters here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.ArrayList;

public class TotalLetters
{
   public static void main(String[] args)
   {
       ArrayList<String> list = new ArrayList<String>();
       addWords(list);
       System.out.println("\nTotal letters (excluding spaces): " + getTotalLetters(list));
   }
   
   public static void addWords(ArrayList<String> list)
   {
       Scanner input = new Scanner(System.in);
       int counter = 1;
       int choice = 0;
       int sentinel = -1;
       do
       {
           System.out.println("\nWord " + counter + ":");
           list.add(input.nextLine());
           
           System.out.println("\nDo you want to quit? Yes: -1 No: Any other integer");
           choice = input.nextInt();
           input.nextLine();
           ++counter;
       }while(choice != sentinel);
   }
  
   public static int getTotalLetters(final ArrayList<String> list)
   {
       int total = 0;
       for(String e: list)
       {
          for(int index = 0; index < e.length(); ++index)
          {            
              if(Character.isLetter(e.charAt(index)))
              {
                  ++total;
              }
          }
       }
       return total;
   }
   
}
