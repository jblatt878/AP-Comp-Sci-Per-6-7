public class BankAccountTest
{

public static void main(String[] args)
{
      BankAccount boadisChecking = new BankAccount();
      boadisChecking.deposit(3000);
      boadisChecking.withdraw(250);
      System.out.println(boadisChecking.getBalance());
}
    
    
}

   class BankAccount
{
  
    public BankAccount()
{
        myBalance = 0;
}
    
    public BankAccount(double balance)
{
        myBalance = balance;
}
    
    public double getBalance()
{
        return myBalance;
}
    
    public void deposit(double amount)
{
        myBalance = myBalance + amount;
}
    
    public void withdraw(double amount)
{
        myBalance = myBalance - amount;
}
    
    private double myBalance;
}