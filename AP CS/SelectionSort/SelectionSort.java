
/**
 * Name: Jon Reyrao
 * Date: 10/18/17
 * Period: 8
 * Program Name: SelectionSort
 * Program Description: Algorithm to sort an array
 */
public class SelectionSort
{
   public static void main(String[] args)
   {
       double[] array = {123, 12, 213, 4, 6, 7};
       selectionSort(array);
       printArray(array);
   }
   public static void selectionSort(double[] list)
   {
      for(int i = 0; i < list.length-1; ++i)
      {
          double currentMin = list[i];
          int currentMinIndex = i;
          
          for(int j = i+1; j < list.length; ++j)
          {
              if(currentMin > list[j])
              {
                  currentMin = list[j];
                  currentMinIndex = j;
              }
          }
          
          if(currentMinIndex != i)
          {
              list[currentMinIndex] = list[i];
              list[i] = currentMin;
          }
      }
   }
   
   public static void printArray(double[] array)
   {
       for(double element: array)
       {
           System.out.print(element + " ");
       }
       
       System.out.println();
   }
}
