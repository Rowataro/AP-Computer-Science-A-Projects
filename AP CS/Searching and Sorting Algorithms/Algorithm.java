
/**
 * Enumeration class Algorithm - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum Algorithm
{
   SELECTION_SORT
   (
       1, 
       "Use SELECTION sort to organize by", "AUTHOR's LAST NAME", 
       "SELECTION SORT"
   ),
   INSERTION_SORT
   (
       2, 
       "Use INSERTION sort to organize by", "TITLE", 
       "INSERTION SORT"
   ),
   MERGE_SORT
   (
       3, 
       "Use MERGE sort to organize by", "NUMBER OF PAGES", 
       "MERGE SORT"
   ),
   QUICK_SORT
   (
       4, 
       "Use QUICK sort to organize by", "NUMBER OF COPIES", 
       "QUICK SORT"
   ),
   
   SEQUENTIAL_SEARCH
   (
       5, 
       "Use SEQUENTIAL search to search for a word in the", "TITLE", 
       "SEQUENTIAL SEARCH"
   ),
   BINARY_SEARCH
   (
       6, 
       "Use BINARY search to search for an", "AUTHOR by LAST NAME",
       "BINARY SEARCH"
   );
   
   Algorithm
   (
       int displayNumber, 
       String displayDescription, 
       String sortedByKey, 
       String name
   )
   {
       this.displayNumber = displayNumber;
       this.displayDescription = displayDescription;
       this.sortedByKey = sortedByKey;
       this.name = name;
   }
   
   public final int getDisplayNumber()
   {
       return displayNumber;
   }
   
   public final String getDisplayDescription()
   {
       return displayDescription;
   }
   
   public final String getSortedByKey()
   {
       return sortedByKey;
   }
   
   public final String getName()
   {
       return name;
   }
   
    private final String displayDescription;
    private final String sortedByKey;
    private final String name;
    private final int displayNumber;
}
