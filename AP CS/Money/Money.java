
/**
 * Name: Jon Reyrao
 * Date: 8/28/17
 * Period: 8
 * Program Name: MoneyMoneyMoney
 * Program Description: This program lets the user enter in a dollar amount. The program then 
 * splits this dollar amount into the denominations of dollars, quarters, dimes, nickels, and pennies.
 * It then prints out how much are in each denomination.
 */
import java.util.Scanner;
public class Money
{
  public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
     
      //Input: dollar amount
      System.out.println("Enter in a dollar amount: ");
      
      //to convert input into cents
      double moneyEntered = input.nextDouble()*100;
      
      //remainders are used to calculate the next quantity 
      //logic:
      //1.25 entered
      //multiply by 100 to make it 125 cents
      //int dollars = 125 cents/100 = 1; int remainder = 125$100 = 25 cents remaining. 
      //int quarters = remainder/25 = 1;  int remainder  = remainder % 25 = 0 cents remaining
      //prints out dollar:1 ... quarter:1
      
      int dollars = (int)moneyEntered/100;
      int dollarRemainder = (int)moneyEntered%100;
  
      int quarters = dollarRemainder/25;
      int quarterRemainder = dollarRemainder%25;
      
      int dimes = quarterRemainder/10;
      int dimeRemainder = quarterRemainder%10;
      
      int nickels = dimeRemainder/5;
      int nickelRemainder = dimeRemainder%5;
      
      int pennies = nickelRemainder;
      
      //Output: the amount of dollars, quarters, dimes, nickels, and pennies in the amount entered.
      System.out.println
      (
      "Output = \n" + 
      "dollars:" + dollars + 
      "\nquarters:" + quarters +  
      "\ndimes:" + dimes + 
      "\nnickels:" + nickels + 
      "\npennies: " + pennies
      );
     
  }
}
