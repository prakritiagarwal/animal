public class BankAccount {
    private String accountHolderName;
    private double accountBalance;
    private int accountNumber;

    public BankAccount(String accountHolderName, double accountBalance) {
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;    
    }
    
    public BankAccount(String accountHolderName, double accountBalance, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
        this.accountNumber = accountNumber;
    }

    public String getName()
    {
        return this.accountHolderName;
    }

    public int getAccountNumber()
    {
        return this.accountNumber;
    }

    public void setAccountNumber(int accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance()
    {
        return this.accountBalance;
    }

    public void deposit(double amount)
    {
        this.accountBalance = this.accountBalance + amount;
    }

    public void withdraw(double amount)
    {
        this.accountBalance = this.accountBalance - amount;
    }

    @Override
    public String toString()
    {
        return this.accountHolderName + " 's account balance is: " 
        +  this.accountBalance + " for account number " + this.accountNumber;
    }
}