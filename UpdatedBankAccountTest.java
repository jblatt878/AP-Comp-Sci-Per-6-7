import java.util.Scanner; 

public class AccountTeam {

public static void main(String[] args)
{
    
     BankAccount Checking = new BankAccount();
     BankAccount Saving = new BankAccount();
     Saving.deposits(0);
     Saving.withdraws(0);
     Checking.deposit(0);
     Checking.withdraw(0);
     System.out.println("Checking: " + Checking.getBalance());
     System.out.println("Saving: " + Saving.getBalanceS());
     
}
  
  
}

  class BankAccount
{
  

   public BankAccount()
{
       myBalance = 0;
       myBalanceS = 0;
}
  
   public BankAccount(double balance, double balanceS)
{
       myBalance = balance;
       myBalanceS = balanceS; 
}
  
   public double getBalance()
{
       return myBalance;
}  
   public double getBalanceS()
   {  
       return myBalanceS; 
   }
   public void deposits(double Deposits)
{
      Scanner Input3 = new Scanner(System.in);
      System.out.println("How much do you want to deposit in saving ? ");
      Deposits = Input3.nextDouble();
      myBalanceS = myBalanceS + Deposits ; 
}
   public void withdraws(double Withdraws)
{
      Scanner Input4 = new Scanner(System.in);
      System.out.println("How much do you want to withdraw from saving ? ");
      Withdraws = Input4.nextDouble();
      myBalanceS = myBalanceS - Withdraws; 
}
   public void deposit(double Deposit)
{
      Scanner Input1 = new Scanner(System.in);
      System.out.println("How much do you want to deposit in checking ? ");
      Deposit = Input1.nextDouble();
      myBalance = myBalance + Deposit ; 
}
  
   public void withdraw(double Withdraw)
{
    Scanner Input2 = new Scanner(System.in);
    System.out.println("How much do you want to withdraw from checking ? ");
    Withdraw = Input2.nextDouble();
    myBalance = myBalance - Withdraw ;
}
   public double myBalance;
   public double myBalanceS; 
 
} 