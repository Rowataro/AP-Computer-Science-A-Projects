
/**
 * Write a description of class Decoding here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Arrays;
public class Decoding
{
    private static int[] array = {334, 384, 105, 222, 61, 2, 175, 228, 114, 235, 241, 213, 206, 3, 321, 152, 214, 137, 224};
    
    public static void main(String[] args)
    {
        System.out.println("2. " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("4. " + Arrays.toString(array));
        array = reverseThreeDigitNumbers(array);
        System.out.println("6. " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("8. " + Arrays.toString(array));
        array = add150Or100(array);
        System.out.println("10." + Arrays.toString(array));
        array = reverseThreeDigitNumbers(array);
        System.out.println("12." + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("14." + Arrays.toString(array));
        array = minus113(array);
        System.out.println("16." + Arrays.toString(array));
        array = mod28(array);
        System.out.println("18." + Arrays.toString(array));
        array = add65Or6(array);
        System.out.println("20." + Arrays.toString(array));
        System.out.println("21." + printASCII(array)); 
    }
    
    private static int[] reverseThreeDigitNumbers(final int[] array)
    {
        int[] result = new int[array.length];
        for(int index = 0; index < array.length; ++index)
        {
            if( isThreeDigits(array[index]) )
            {
                result[index] = reverseNumber(array[index]);
            }
            else
            {
                result[index] = array[index];
            }
        }
        return result;
    }
    public static boolean isThreeDigits(int number)
    {
        return (number > 99 && number < 1000);
    }
    public static int reverseNumber(int number)
    {
        StringBuilder builder = new StringBuilder();
        String num = Integer.toString(number);
        builder.append(num);
        builder = builder.reverse();
        return Integer.parseInt( builder.toString() );
        
    }
    
    public static int[] add150Or100(final int[] array)
    {
        int[] result = new int[array.length];
        for(int index = 0; index < array.length; ++index)
        {
            if(array[index] >= 450)
            {
                result[index] = array[index] + 150;
            }
            else
            {
                result[index] = array[index] + 100;
            }
        }
        return result;
    }
    
    public static int[] minus113(final int[] array)
    {
        int[] result = new int[array.length];
        for(int index = 0; index < array.length; ++index)
        {
            result[index] = array[index] - 113;
        }
        return result;
    }
    
    public static int[] mod28(final int[] array)
    {
        int[] result = new int[array.length];
        for(int index = 0; index < array.length; ++index)
        {
            result[index] = array[index] % 28;
        }
        return result;
    }
    
    public static int[] add65Or6(final int[] array)
    {
        int[] result = new int[array.length];
        for(int index = 0; index < array.length; ++index)
        {
            if(array[index] <= 25)
            {
                result[index] = array[index] + 65;
            }
            else
            {
                result[index] = array[index] + 6;
            }
        }
        return result;
    }
    
    public static String printASCII(int[] array)
    {
        String ASCII = "";
        for(int e: array)
        {
            ASCII += Character.toString((char)e);
        }
        return ASCII;
    }
}
