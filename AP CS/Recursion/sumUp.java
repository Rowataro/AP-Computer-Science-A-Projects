
/**
 * Write a description of class sumUp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class sumUp
{
   public static void main(String[] args)
   {
       final int test = 457829;
       System.out.println(test + " is divisible by 9: " + divisible(test));
   }
   public static Boolean divisible(int dividend)
   {
       return (sumUpDigits(dividend) == 9);
   }
   
   public static int sumUpDigits(int dividend)
   {
       int sum = 0;
       while(dividend > 0)
       {
           sum += dividend % 10;
           dividend /= 10;
       }
       if(sum > 9)
       {
           return sumUpDigits(sum);
       }
       else
       {
           return sum;
       }
    }
}
