/**
 * Name: Jon Reyrao
 * Date: 10/2/17
 * Periiod: 8
 * Program Name: Account
 * Program Description: Test Account object
 */

public class TestAccount
{
    public static void main(String[] args)
    {
        Account account = new Account(1122, 20000);
        //WS never specified a constructor with the annual interest rate data field
        //so, this is the method used
        account.setAnnualInterestRate(4.5);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println(account);
        CheckingAccount cacc = new CheckingAccount(1122, 2000,100);  
        System.out.println(cacc.getBalance());
        cacc.withdraw(2100); System.out.println(cacc);
    }
}
