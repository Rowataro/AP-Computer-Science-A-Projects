/**
 * Write a description of class Account here.
 * Name: Jon Reyrao
 * Date: 10/2/17
 * Periiod: 8
 * Program Name: Account
 * Program Description: Account class with balance, interest rate, deposit, 
 * and withdrawal functionalities
 */

import java.util.Date;
import java.math.RoundingMode;
import java.math.BigDecimal;

public class Account
{
    private int id = 0;
    protected double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated = new Date();
    
    Account()
    {
    }
    
    Account(final int newId, final double newBalance)
    {
        id = newId;
        balance = newBalance;
    }
    
    public final int getId()
    {
        return id;
    }
    
    public void setId(final int newId)
    {
        id = newId;
    }
    
    public final double getBalance()
    {
        return balance;
    }
    
    public void setBalance(final double newBalance)
    {
        balance = newBalance;
    }
    
    public final double getAnnualInterestRate()
    {
        return annualInterestRate;
    }
    
    public void setAnnualInterestRate(final double newAnnualInterestRate)
    {
        annualInterestRate = newAnnualInterestRate;
    }
    
    public final Date getDateCreated()
    {
        return dateCreated;
    }
    
    public final double getMonthlyInterestRate()
    {
        return annualInterestRate/12;
    }
    
    //interest rate is a percentage, so it needs to be divided by 100
    public final double getMonthlyInterest()
    {
        return balance*(getMonthlyInterestRate()/100);
    }
    
    public void withdraw(final double amount)
    {
        balance -= amount;
    }
    
    public void deposit(final double amount)
    {
        balance += amount;
    }
    
    public String toString()
    {
        return "\nAccount information: " +
               "\n  Balance: " + String.format("%.2f", balance) +
               "\n  Monthly Interest: " + String.format("%.2f", getMonthlyInterest()) +
               "\n  Account created: " + dateCreated;
    }
}
