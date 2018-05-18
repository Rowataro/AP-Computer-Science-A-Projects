
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
 
import java.util.Arrays;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args) throws InterruptedException
   {
       do 
       {
            library = new ArrayList<>
            (Arrays.asList
                (
                    new LibraryBook(new Book("Tim O'Brien","The Things They Carried", 233),10),
                    new LibraryBook(new Book("George Orwell", "Animal Farm", 112), 15),  
                    new LibraryBook(new Book("Wilson Rawls","Where The Red Fern Grows", 208), 11),
                    new LibraryBook(new Book("Margaret Peterson Haddix", "Found", 336), 2),
                    new LibraryBook(new Book("Gayle Forman", "If I Stay", 210), 9),
                    new LibraryBook(new Book("Raina Telgemeier","Smile", 224), 4),
                    new LibraryBook(new Book("James Dashner", "The Eye of Minds", 312), 1),
                    new LibraryBook(new Book("Chris Rylander", "The Fourth Stall", 320), 3),
                    new LibraryBook(new Book("Ayn Rand", "Atlas Shrugged", 1168), 1),
                    new LibraryBook(new Book("Carl Sandburg", "Remembrance Rock", 1067), 1)
                )
            );
        
           displayOptions();
           
           choice = getEnteredChoice();
           
           if(choice != sentinel)
           {
               Algorithm algorithm = getAlgorithmByDisplayNumber(choice);
               
               doOption(algorithm);
           }
           
       }while(choice != sentinel);
       
       System.out.println("\nYou have exited the program.");
   }
   private static void displayOptions() throws InterruptedException
   {
       System.out.println("\n\nOptions: ");
       
       Algorithm[] algorithms = Algorithm.values();
       
       for (Algorithm algorithm : algorithms)
       {
           System.out.println
           (
               "\n  " + algorithm.getDisplayNumber() + 
               ". " + algorithm.getDisplayDescription() + 
               " " + algorithm.getSortedByKey() 
           );
       }
       
       System.out.println("\nTo QUIT enter -1");
   }
   private static int getEnteredChoice()
   {
       do
       {
           System.out.print("\nEnter choice: ");
           choice = input.nextInt();
               
           if
           (
                choice != sentinel &&
                (
                    choice < Algorithm.SELECTION_SORT.getDisplayNumber() || 
                    choice > Algorithm.BINARY_SEARCH.getDisplayNumber()
                )
           )
           {
               System.out.println("\nInvalid option.");
           }
       } 
       while
       (    choice != sentinel &&
            (
                choice < Algorithm.SELECTION_SORT.getDisplayNumber() || 
                choice > Algorithm.BINARY_SEARCH.getDisplayNumber()
            )
       );
       
       return choice;
   }    
   private static Algorithm getAlgorithmByDisplayNumber(int number)
   {
       for (Algorithm algorithm : Algorithm.values())
       {
           if(number == algorithm.getDisplayNumber())
           {
               return algorithm;
           }
       }
       
       System.out.println("\nAlgorithm not found. Returning null");
       return null;
   }
   private static void doOption(final Algorithm algorithm) throws InterruptedException
   {
       if
       (
           algorithm == Algorithm.SELECTION_SORT ||
           algorithm == Algorithm.INSERTION_SORT ||
           algorithm == Algorithm.MERGE_SORT ||
           algorithm == Algorithm.QUICK_SORT
       )
       {
           System.out.println("\nHere is the library before: ");
           TimeUnit.MILLISECONDS.sleep(900);
           printLibraryWithDelayInMS(0);
           TimeUnit.MILLISECONDS.sleep(900);
           
           switch(algorithm)
           {
               case SELECTION_SORT: //orders by book's author's last name
                library = Sort.doSelectionSort(library);
               break;
               case INSERTION_SORT: //orders by book's title
                library = Sort.doInsertionSort(library);
               break;
               case MERGE_SORT: //orders by book's number of pages
                library = Sort.doMergeSort(library);
               break;
               case QUICK_SORT: //orders by book's copies
                library = Sort.doQuickSort(library);
               break;
           }
           
           System.out.println("\n\n" + algorithm.getName());
           TimeUnit.MILLISECONDS.sleep(1332);
           
           System.out.println
           (
            "\nHere is the library after (sorted by " + algorithm.getSortedByKey() + ")"
           );
           TimeUnit.MILLISECONDS.sleep(1500);
           
           printLibraryWithDelayInMS(975);
       }
       else 
       {
           switch(algorithm)
           {
               case SEQUENTIAL_SEARCH:
                library = Sort.doInsertionSort(library);
               break;
               case BINARY_SEARCH: 
                library = Sort.doSelectionSort(library);
               break;
           }
           
           System.out.println
           (
            "\nHere is the library to be searched (sorted by " + algorithm.getSortedByKey() + ") "
           );
           TimeUnit.MILLISECONDS.sleep(870);
           printLibraryWithIndices();
           
           System.out.println("\n\n" + algorithm.getName());
           
           System.out.println
           (
               "\nNote that " + algorithm.getSortedByKey() + 
               " is case-sensitive, though " + algorithm.getSortedByKey() + 
               " can be a partial match."
           );
           
           System.out.print("\nEnter " + algorithm.getSortedByKey() + ": ");
           String key = getEnteredKey();
           switch(algorithm)
           {
               case SEQUENTIAL_SEARCH: 
                Search.doLinearSearch(key, library);
               break;
               case BINARY_SEARCH:
                Search.doBinarySearch(key, library);
           }
           
           if(Search.wasSuccessful())
           {
               System.out.println
               ("\n " + algorithm.getSortedByKey() + " found at index " + Search.getIndexOfLastKey());
               TimeUnit.MILLISECONDS.sleep(870);
           }
           else
           {
               System.out.println
               (
                "\n " + algorithm.getSortedByKey() +" not found in library"  
               );
               TimeUnit.MILLISECONDS.sleep(870);
           }
       }
   }
   private static String getEnteredKey()
   {
       input.nextLine();
       return input.nextLine();
   }
   private static void printLibraryWithDelayInMS(int milliseconds) throws InterruptedException
   {
       System.out.print("\nLibrary: ");
       for(LibraryBook book: library)
       {
           System.out.print(book);
           TimeUnit.MILLISECONDS.sleep(milliseconds);
       }
   }
   private static void printLibraryWithIndices() throws InterruptedException
   {
       System.out.print("\nLibrary: ");
       int index = 0;
       for(LibraryBook book: library)
       {
           System.out.print("\n\nIndex " + index + ":" + "" + book);
           ++index;
       }
       System.out.println();
   }
   
   private static Scanner input = new Scanner(System.in);
   private static int choice = -2;
   private static int sentinel = -1;
   
   private static ArrayList<LibraryBook> library = null;
}
