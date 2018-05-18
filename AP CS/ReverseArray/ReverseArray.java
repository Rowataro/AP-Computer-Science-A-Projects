
/**
 * Write a description of class ReverseArray here.
 * Name: Jon Reyrao
 * Date: 10/7/17
 * Period: 8
 * Program Name: ReverseAray
 * Program Description: Generates a random integer array (elements 1-5). One method
 * will create a new array, copy them into a new array in reverse, and return the new array to be printed.
 * The second will take the original array, reverse the numbers inside of the original array
 * and print them inside the method
 */
public class ReverseArray
{
   public static void main(String args[])
   {
       int[] array = generateRandomArray(5,1,5);
       System.out.print("\nNormal Array: ");
       printArray(array);
       
       
       int[] reversedArray = generateReversedArray(array);
       System.out.print("\nReversed Array (Method 1): ");
       printArray(reversedArray);
       
       
       System.out.print("\nReversed Array (Method 2): ");
       reverseArray(array);
   }
   
   //returns an array filled with random integers of specific length.
   //range is from min to max
   public static int[] generateRandomArray(int maxSize, int min, int max)
   {
      
       if(min > max)
       {
           //swapping of max and min
           int temp = max;
           max = min;
           min = temp;
           System.out.println
           (
           "\nMinimum greater than maximum. Range automatically swapped for generating random array."
           );
       }
       
       int[] array = new int[maxSize];
       
       //assigns random number from min to max to each index of the array
       for(int index = 0; index < maxSize; ++index)
       {
           array[index] = min + (int)(Math.random() * (max-min +1));
       }
       
       return array;
   }
   
   //prints the contents of an array
   public static void printArray(final int[] array)
   {
       for(int item : array)
       {
           System.out.print(item + " ");
       }
   }
   
   //returns an array in reverse
   public static int[] generateReversedArray(final int[] sourceArray)
   {
       int[] reversedArray = new int[sourceArray.length];
       
       //only switch up to half of the array, or else elements will go back to where 
       //they were originally
       //round up the mid-point for odd array lengths
       for(int index = 0; index < sourceArray.length; ++index)
       {
           //length-1 because arrays start from 0
           reversedArray[index] = sourceArray[sourceArray.length-1-index];
       }
       
       return reversedArray;
   }
   
   //reverses the contents of an array
   public static void reverseArray(int[] array)
   {
       //similar to generateReversedMethod, except there is a use of a swapping algorithm
       for(int index = 0; index < Math.ceil((double)array.length/2); ++index)
       {
           //swap/reverse algorithm
           int temp = array[index];
           //length-1 because arrays start from 0.
           array[index] = array[array.length-1-index]; 
           array[array.length-1-index] = temp;
       }
       
       printArray(array);
   }
}
