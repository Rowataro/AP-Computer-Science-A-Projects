
/**
 * Write a description of class SavingsAccount here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CheckingAccount extends Account
{
    public CheckingAccount()
    {
    }
    
    public CheckingAccount(final int newId, final double newBalance, final double newOver)
    {
        super(newId, newBalance);
        overdraftLimit = newOver;
    }
    double overdraftLimit = 0;
    public void withdraw(final double amount)
    {
        boolean valid = true;
        if(balance - amount < overdraftLimit)
        {
            System.out.println
            ("\nYou cannot withdraw " + amount + 
              "\nYou only have " + balance
            );
            valid = false;
        }
        if(valid)
        {
            balance -= amount;
        }
    }
    public String toString()
    {
        return "\nChecking Account" +
                super.toString() + 
               "\n  Overdraft Limit: " + overdraftLimit;
    }
}
