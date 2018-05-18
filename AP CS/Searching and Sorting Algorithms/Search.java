
/**
 * Write a description of class Searches here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;

public class Search
{
  /*
   * precondition:
   *    Array is sorted in ASCENDING order.
   * postcondition: 
   *    Success flag and keyIndex set appropriately.
   * Note: 
   *    Searches for author by LAST NAME in book
   */
  public static void doBinarySearch(String key, ArrayList<LibraryBook> library)
  {
      success = false;
      int lowerBound = 0;
      int upperBound = library.size() -1;
      
      while(lowerBound <= upperBound)
      {
          int middle = (lowerBound + upperBound)/2;
          String authorLastName = 
          StringManipulator.getLastWordOnly(library.get(middle).getAuthor());
          if(authorLastName.contains(key))
          {
              keyIndex = middle;
              success = true; 
              break;
          }
          else if (authorLastName.compareToIgnoreCase(key) > 0)
          {
              upperBound = middle - 1;
          }
          else
          {
              lowerBound = middle + 1;
          }
      }
  }
  
  /*
   * precondition:
   *    Array is sorted in ASCENDING order.
   * postcondition: 
   *    Success flag and keyIndex set appropriately.
   * Note: 
   *    Searches for title in book 
   */
  public static void doLinearSearch(String key, ArrayList<LibraryBook> library)
  {
      success = false;
      
      for(int index = 0; index < library.size(); ++index)
      {
          if(library.get(index).getTitle().contains(key))
          {
              keyIndex = index;
              success = true;
              break;
          }
      }
  }

  
  /*
   * Indicate of the LAST search
   */
  public static int getIndexOfLastKey()
  {
      return keyIndex;
  }
  /*
   * Indicative of the LAST search
   */
  public static boolean wasSuccessful()
  {
      return success;
  }
  
  private static int keyIndex = -1;
  private static boolean success = false;
}
