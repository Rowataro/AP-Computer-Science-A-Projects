
/**
 * Write a description of class Encoding here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Arrays;
import java.util.Scanner;

public class Encoding
{
    private static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        String decoded = getString();
        int[] ASCII = getASCII(decoded);
        System.out.println(Arrays.toString(ASCII));
        ASCII = minus65Or6(ASCII);
        System.out.println(Arrays.toString(ASCII));
        ASCII = add28(ASCII);
    }
    public static String getString()
    {
        System.out.println("\nWhat would you like to return?");
        return input.nextLine();
    }
    public static int[] getASCII(String decoded)
    {
        int[] ascii = new int[decoded.length()];
        for(int index = 0; index < decoded.length(); ++index)
        {
            ascii[index] = (int)decoded.charAt(index);
        }
        return ascii;
    }
    
    public static int[] minus65Or6(final int[] array)
    {
        int[] result = new int[array.length];
        for(int index = 0; index < array.length; ++index)
        {
            if(array[index] > 25)
            {
                result[index] = array[index] - 65;
            }
            else
            {
                result[index] = array[index] - 6;
            }
        }
        return result;
    }
    
    public static int[] add28(int[] array)
    {
        int[] result - new int[array.length];
        for(int i = 0; i < array.length(); i++)
        {
            result[i] = array[i] + 28;
            while (result[i] >= 28)
            {
                result[i] = array[i] + 28;
            }
        }
    
    }
    
}
