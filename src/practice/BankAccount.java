/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */

package practice;

/**
 *
 * @author Alex
 */
public class BankAccount
{
    public BankAccount(double initialBalance)
    {
        balance = initialBalance;
    }
    
    public void deposit(double amount)
    {
        balance += amount;
    }
    
    public void withdraw(double amount)
    {
        balance -= amount;
    }
    
    //adds compounded interest.
    public void addInterest()
    {
        interest = balance*(INTEREST_RATE/100);
        balance += interest;
    }
    
    public double getBalance()
    {
        return balance;
    }
    
    private double interest;
    private double balance;
    private final double INTEREST_RATE = 3.0;
}
