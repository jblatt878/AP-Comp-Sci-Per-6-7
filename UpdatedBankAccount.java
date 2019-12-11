import java.util.Scanner;
public class BankAccount
{

public static void main(String[] args)
{
      BankAccount boadi = new BankAccount();
      boadi.BankAccount1();
}

    public BankAccount()
{
        double checkingBalance;
        double savingsBalance;
        String myName; 
        String myAddress;
        String myBirthday;
        int cardNumber;
        int pin;
        String accountName;
        String myPassword;
}
    public void BankAccount1()
{
      BankAccount boadi = new BankAccount();
      String end = "g";
      while (end.equals("g"))
      {
        Scanner account = new Scanner(System.in);
        System.out.println("Do you wish to access your checking or savings account? c = checking s = savings");
        String input = account.next();
        if (input.equals("c"))
        {
          boadi.changeChecking();
        }
        if (input.equals("s"))
        {
          boadi.changeSavings();
        }
        Scanner end1 = new Scanner(System.in);
        System.out.println();
        System.out.println("Are you done, or do you wish to go back to your account? enter 'g' to go back");
        end = end1.next();
      }
}

    public BankAccount(double balance)
{
        checkingBalance = balance;
}
    
    public double getcheckingBalance()
{
        return checkingBalance;
}
    
    public void checkingdeposit(double amount)
{
        checkingBalance = checkingBalance + amount;
}

    public void checkingdeposit()
{
      BankAccount boadi = new BankAccount();
      Scanner account2 = new Scanner(System.in); 
      System.out.println("How much do you wish to deposit?");
      double input2 = account2.nextDouble();
      boadi.checkingdeposit(input2);
      System.out.println();
      System.out.println("Your checking balance is:");
      System.out.println(boadi.getcheckingBalance());
}
    
    public void checkingwithdraw(double amount)
{
        checkingBalance = checkingBalance - amount;
}

    public void checkingwithdraw()
{
      BankAccount boadi = new BankAccount();
      Scanner account2 = new Scanner(System.in); 
      System.out.println("How much do you wish to withdraw?");
      int input2 = account2.nextInt();
      boadi.checkingwithdraw(input2);
      System.out.println();
      System.out.println("Your checking balance is:");
      System.out.println(boadi.getcheckingBalance());
}

    public void changeChecking ()
{
      BankAccount boadi = new BankAccount();
      Scanner account1 = new Scanner(System.in); 
      System.out.println("Do you wish to deposit or withdraw from checking? w = withdraw d = deposit");
      String input1 = account1.next();
      if (input1.equals("w"))
      {
        boadi.checkingwithdraw();
      }
      if (input1.equals("d"))
      {
        boadi.checkingdeposit();
      }
}
public double getsavingsBalance()
{
       return savingsBalance;
}
  
   public void savingsdeposit1(double amount)
{
       savingsBalance = savingsBalance + amount;
}
 
   public void savingsdeposit()
{
     BankAccount boadi = new BankAccount();
     Scanner account2 = new Scanner(System.in);
     System.out.println("How much do you wish to deposit?");
     double input2 = account2.nextDouble();
     boadi.savingsdeposit1(input2);
     System.out.println();
     System.out.println("Your savings balance is:");
     System.out.println(boadi.getsavingsBalance());
}
  
   public void savingswithdraw(double amount)
{
       savingsBalance = savingsBalance - amount;
}
 
   public void savingswithdraw()
{
     BankAccount boadi = new BankAccount();
     Scanner account2 = new Scanner(System.in);
     System.out.println("How much do you wish to withdraw?");
     int input2 = account2.nextInt();
     boadi.savingswithdraw(input2);
     System.out.println();
     System.out.println("Your savings balance is:");
     System.out.println(boadi.getsavingsBalance());
}
 
   public void changeSavings ()
{
     BankAccount boadi = new BankAccount();
     Scanner account1 = new Scanner(System.in);
     System.out.println("Do you wish to deposit or withdraw from savings? w = withdraw d = deposit");
     String input1 = account1.next();
     if (input1.equals("w"))
     {
       boadi.savingswithdraw();
     }
     if (input1.equals("d"))
     {
       boadi.savingsdeposit();
     }

}
    
    
  double checkingBalance;
  double savingsBalance;
  String myName; 
  String myAddress;
  String myBirthday;
  int cardNumber;
  int pin;
  String accountName;
  String myPassword;
}