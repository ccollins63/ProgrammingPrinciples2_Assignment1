//Cameron Collins

import java.util.Date;

public class Account
{

    //data fields
    private int id                    = 0;
    private double balance            = 0.0;
    private double annualInterestRate = 0.0;
    private Date dateCreated;

    //no arg constructor
    Account()
    {
        dateCreated = new Date();
    }

    //constructor
    Account(int id, double balance, double annualInterestRate) {
        this.id                 = id;
        this.balance            = balance;
        this.annualInterestRate = annualInterestRate;
        dateCreated             = new Date();
    }

    public int getId()
    {
        return this.id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public double getBalance()
    {
        return this.balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public double getAnnualInterestRate()
    {
        return this.annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate)
    {
        this.annualInterestRate = annualInterestRate;
    }

    Date getDateCreated()
    {
        return dateCreated;
    }

    //method to return the monthly interest rate
    double getMonthlyInterestRate()
    {
        return this.annualInterestRate / 12.0;
    }

    //method to return the monthly interest
    double getMonthlyInterest()
    {
        double monthlyInterestRate = this.getMonthlyInterestRate();
        return this.balance * monthlyInterestRate;
    }

    //method to withdraw from the account
    double withdraw(double amount)
    {
        return this.balance -= amount;
    }

    //method to deposit into the account
    double deposit(double amount)
    {
        return this.balance += amount;
    }

    public String toString()
    {
        return "Account ID:\t\t\t\t" + this.getId() + "\nAccount Balance:\t\t$" + this.getBalance() + "\nInterest Rate:\t\t\t" + this.getAnnualInterestRate() * 100.0 + "%\nDate Opened:\t\t\t" + getDateCreated();
    }
}
