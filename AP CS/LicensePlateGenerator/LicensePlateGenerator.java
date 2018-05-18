/**
 * Name: Jon Reyrao
 * Date: 9/8/17
 * Period: 8
 * Program Name: LicensePlateGenerator
 * Program Description: Generates a string (a vehicle plate number) that consists of three uppercase 
 * letters followed by four digits. 
 * 
 *  Revisions: 
 *   I made the program more modular with two new methods
 *      generateRandomLetters returns a string of a specified amount of random letters 
 *      generateRandomNumbers returns a string of a specified amount of random numbers
 */
public class LicensePlateGenerator
{
  public static void main(String args[])
  {
      final int totalLetters = 3;
      final int totalNumbers = 4;
       
      String licensePlate = new String(generateRandomLetters(totalLetters));
      
      licensePlate += generateRandomNumbers(totalNumbers);
      
      System.out.println("Licensplate: " + licensePlate);
  }
  
  public static String generateRandomLetters(int amount)
  {
      String letters = "";
        //Concatenate three upper case letters
       for(int count = 0; count < amount; ++count)
       {
           
           /*
           For future random integer generation:
           min+(int)(Math.random()*((max-min)+1))
           min and max inclusive
           
           ASCII value of uppercase letters:
           A=65, B=66... Z = 90.
           */
          
           int asciiValue = 65+(int)(Math.random() * 26);
           letters +=  (char)asciiValue;;
       }
       
       return letters;
  }
  
  public static String generateRandomNumbers(int amount)
  {
      String numbers = "";
      
       for(int count = 0; count < amount; ++count)
       {
           //Random digit between 0 and 9
           int digit = (int)(Math.random() * 10);
           numbers += digit;
       }
       
       return numbers;
  }
}
