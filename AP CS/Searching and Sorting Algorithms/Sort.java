
/**
 * Write a description of class Sort here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sort
{
    /*
     * precondition: 
     *  Array is unsorted and is of n-length
     * postcondition: 
     *  Array sorted in ASCENDING order by author's last name
     */
    public static ArrayList<LibraryBook> doSelectionSort(ArrayList<LibraryBook> library)
    {
        for(int unsortedIndex = 0;  unsortedIndex < library.size()-1; ++unsortedIndex)
        {
            int nextIndex = getMinIndexStartingFrom(unsortedIndex, library);
            
            if(nextIndex != unsortedIndex)
            {
                Collections.swap(library, unsortedIndex, nextIndex);
            }
        } 
        return library;
    }
    private static int getMinIndexStartingFrom(int startIndex, ArrayList<LibraryBook> library)
    {
        int minIndex = startIndex;
        String minValue = 
        StringManipulator.getLastWordOnly(library.get(startIndex).getAuthor());
        
        for(int index = startIndex + 1; index < library.size(); ++index)
        {
            if
            (
                StringManipulator.getLastWordOnly(library.get(index).getAuthor()).
                compareToIgnoreCase(minValue) < 0
            )
            {
               minIndex = index;
               minValue = 
               StringManipulator.getLastWordOnly(library.get(index).getAuthor());
            }
        }
        return minIndex;
    }
   
    /*
     * precondition: 
     *  Array is unsorted and is of n-length
     * postcondition: 
     *  Array sorted in ASCENDING order by title 
     */
    public static ArrayList<LibraryBook> doInsertionSort(ArrayList<LibraryBook> library)
    {
       if(library == null)
       {
           System.out.println("\nLibrary is null.");
       }
       else if (library.isEmpty())
       {
           System.out.println("\nLibrary is empty.");
           return library;
       }
       
       for(int unsortedIndex = 1; unsortedIndex < library.size(); ++unsortedIndex)
       {
           int sortedIndex = unsortedIndex - 1;
           LibraryBook unsortedValue = library.get(unsortedIndex);
         
           insertValueEndingAt(unsortedValue, sortedIndex, library);
       }
       return library;
    }
    private static void insertValueEndingAt(LibraryBook unsortedValue, int endIndex, ArrayList<LibraryBook> library)
    {   
        int endIndexOfRemoval = 3;        
        String unsortedTitle = unsortedValue.getTitle();
        unsortedTitle = StringManipulator.removeWordUpTo("The ", endIndexOfRemoval, unsortedTitle);
        
        int index;
        for
        (
            index = endIndex; 
            index >= 0 
            && 
            (
            StringManipulator.removeWordUpTo
            ("The ", endIndexOfRemoval, library.get(index).getTitle()).
            compareToIgnoreCase(unsortedTitle) > 0
            ); 
            --index
        )
        {
             library.set(index + 1, library.get(index));
        }
        ++index;
        int sortedIndex = index;
        library.set(sortedIndex, unsortedValue);
    }
     /*
     * preconditon: 
     *  lowestIndex < highestIndex. 
     *  Array is unsorted and of n-length.
     * postcondition:
     *  Array sorted in ASCENDING order by copies.
     */
    public static ArrayList<LibraryBook> doMergeSort(ArrayList<LibraryBook> library)
    {
       if(library == null)
       {
           System.out.println("\nLibrary is null.");
       }
       else if (library.isEmpty())
       {
           System.out.println("\nLibrary is empty.");
           return library;
       }
       
        int lowestIndex = 0;
        int highestIndex = library.size() - 1;
        mergeSortFromTo(lowestIndex, highestIndex, library);
        
       return library;
    }
    private static void mergeSortFromTo(int lowestIndex, int highestIndex, ArrayList<LibraryBook> library)
    {
         if (lowestIndex < highestIndex)
         {
            int middleIndex = (lowestIndex + highestIndex)/2;
            
            mergeSortFromTo(lowestIndex, middleIndex, library);
            mergeSortFromTo(middleIndex+1, highestIndex, library);
        
            // Merge the sorted halves
            merge(lowestIndex, middleIndex, highestIndex, library);
        }
    }
    private static void merge(int lowestIndex, int middleIndex, int highestIndex, ArrayList<LibraryBook> library)
    {
        int totalLowerHalfElements = middleIndex - lowestIndex + 1;
        int totalUpperHalfElements = highestIndex - (middleIndex + 1) + 1;
 
        ArrayList<LibraryBook> lowerHalf = new ArrayList();
        ArrayList<LibraryBook> upperHalf = new ArrayList();
        
        int originalArrayIndex = lowestIndex;
        
        for (int index = 0; index<totalLowerHalfElements; ++index, ++originalArrayIndex)
        {
            lowerHalf.add
            ( new LibraryBook( library.get(originalArrayIndex).getBook(), 
            library.get(originalArrayIndex).getCopies() ) 
            );
        }
        for (int index = 0; index < totalUpperHalfElements; ++index, ++originalArrayIndex)
        {
            upperHalf.add
            ( new LibraryBook( library.get(originalArrayIndex).getBook(), 
            library.get(originalArrayIndex).getCopies() )
            );
        }
        
        originalArrayIndex = lowestIndex;
        int lowerHalfIndex = 0;
        int upperHalfIndex = 0;
        
        while (lowerHalfIndex < lowerHalf.size() && upperHalfIndex < upperHalf.size())
        {
            if (lowerHalf.get(lowerHalfIndex).getNumPages() <= upperHalf.get(upperHalfIndex).getNumPages())
            {
                library.set(originalArrayIndex, lowerHalf.get(lowerHalfIndex));
                ++lowerHalfIndex;
            }
            else
            {
                library.set(originalArrayIndex, upperHalf.get(upperHalfIndex));
                ++upperHalfIndex;
            }
            ++originalArrayIndex;
        }
 
        while (lowerHalfIndex < lowerHalf.size())
        {
            library.set(originalArrayIndex, lowerHalf.get(lowerHalfIndex));
            ++lowerHalfIndex;
            ++originalArrayIndex;
        }
 
        while (upperHalfIndex < upperHalf.size() )
        {
            library.set(originalArrayIndex, upperHalf.get(upperHalfIndex));
            ++upperHalfIndex;
            ++originalArrayIndex;
        }
    }
    
    public static ArrayList<LibraryBook> doQuickSort(ArrayList<LibraryBook> library) 
    {
       if(library == null)
       {
           System.out.println("\nLibrary is null.");
       }
       else if (library.isEmpty())
       {
           System.out.println("\nLibrary is empty.");
           return library;
       }
       int lowestIndex = 0;
       int highestIndex = library.size() - 1;
       quickSortFromTo(lowestIndex, highestIndex, library);
       
       return library;
    }
    /*
     * preconditon: 
     *  lowestIndex < highestIndex. 
     *  Array is unsorted and of n-length.
     * postcondition:
     *  Array sorted in ASCENDING order by copies.
     */
    private static void quickSortFromTo(int lowestIndex, int highestIndex, ArrayList<LibraryBook> library)
    {   
        if(lowestIndex < highestIndex)
        {
            int partitionIndex = getIndexFromPartition(lowestIndex, highestIndex, library);
            quickSortFromTo(lowestIndex, partitionIndex - 1, library);
            quickSortFromTo(partitionIndex + 1, highestIndex, library);
        }
    }
    private static int getIndexFromPartition(int lowestIndex, int highestIndex, ArrayList<LibraryBook> library)
    {
        int partitionIndex = lowestIndex;
        int partitionValue = library.get(highestIndex).getCopies();
        
        for(int index = lowestIndex; index < highestIndex; ++index)
        {
            if(library.get(index).getCopies() <= partitionValue)
            {
                Collections.swap(library, index, partitionIndex);
                ++partitionIndex;
            }
        }
        
        Collections.swap(library, highestIndex, partitionIndex);
        return partitionIndex;
    }
}
