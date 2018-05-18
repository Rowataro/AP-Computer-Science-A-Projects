/**
 * Name: Jon Reyrao
 * Date: 11/8/17
 * Periiod: 8
 * Program Name: StopWatch
 * Program Description: Tests the stopwatch class by measuring the execution time of sorting 100, 000 numbers using selection sort
 */
public class TestStopWatch
{
  public static void main(String[] args) 
  {
      int[] array = new int[100000];
      for(int count = 0; count < 100000; ++count)
      {
          array[count] = count;
      }
      
      //randomize the array
      shuffle(array);
     
      StopWatch stopWatch = new StopWatch();
      stopWatch.start();
      selectionSort(array);
      stopWatch.stop();
      
      System.out.println
      ("The selection sort of 100,000 numbers took " 
      + stopWatch.getElapsedTime()/1000.0 + " seconds.");
  }
  
  public static void selectionSort(int[] list)
  {
      //responsible for continually putting the minimum at each successive index
      for(int index1 = 0; index1 < list.length-1; ++index1)
      {
          int currentMin = list[index1];
          int currentMinIndex = index1;
          
          //responsible for finding the minimum of list
          for(int index2 = index1+1; index2 < list.length; ++index2)
          {
              if(list[index2] < currentMin)
              {
                  currentMinIndex = index2;
                  currentMin = list[index2];
              }
          }
          
          if(currentMinIndex != index1)
          {
              list[currentMinIndex] = list[index1];
              list[index1] = currentMin;
          }
      }
  }
  
  public static void shuffle(int[] list)
  {
       for(int index = 0; index < list.length; ++index)
       {
           int temp = list[index];
           //formula for random number generation: min + (int)(Math.random() * (max-min+1));
           //min = 0
           //max = endIndex = list.length - 1
           int randomIndex = (int)(Math.random() * (list.length));
           list[index] = list[randomIndex];
           list[randomIndex] = temp;
       }
  }
  
}