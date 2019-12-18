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

        checkingBalance = this.getcheckingBalance();

        savingsBalance = this.getsavingsBalance();

}



    public void BankAccount1()



{



      String end = "g";

      while (end.equals("g"))

      {



        Scanner account = new Scanner(System.in);

        System.out.println("Do you wish to access your checking or savings account? c = checking s = savings");

        String input = account.next();

        if (input.equals("c"))

        {

          this.changeChecking();

        }



        if (input.equals("s"))

        {

          this.changeSavings();

        }



        Scanner end1 = new Scanner(System.in);

        System.out.println();

        System.out.println("Are you done, or do you wish to go back to your account? enter 'g' to go back or any other character to exit.");

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



public void setcheckingBalance(double amount)

{

       checkingBalance = amount;

}



    public void checkingdeposit(double amount)

{

         checkingBalance = checkingBalance + amount;

}



    public void checkingdeposit()

{



      Scanner account2 = new Scanner(System.in); 

      System.out.println("How much do you wish to deposit?");

      double input2 = account2.nextDouble();

      this.checkingdeposit(input2);

      System.out.println();

      System.out.println("Your checking balance is:");

      System.out.println(this.getcheckingBalance());

}



    public void checkingwithdraw(double amount)

{

        
        if (checkingBalance < amount){
            System.out.println("You can't withdraw that much.");
        }
       else {
           checkingBalance = checkingBalance - amount;
       }

}



    public void checkingwithdraw()

{



      Scanner account2 = new Scanner(System.in); 

      System.out.println("How much do you wish to withdraw?");

      int input2 = account2.nextInt();

      this.checkingwithdraw(input2);

      System.out.println();

      System.out.println("Your checking balance is:");

      System.out.println(this.getcheckingBalance());

}



    public void changeChecking ()



{

      Scanner account1 = new Scanner(System.in); 

      System.out.println("Do you wish to deposit or withdraw from checking? w = withdraw d = deposit");

      String input1 = account1.next();

      if (input1.equals("w"))

      {

        this.checkingwithdraw();

      }



      if (input1.equals("d"))

      {

        this.checkingdeposit();

      }

}

public double getsavingsBalance()



{

       return savingsBalance;

}



public void setsavingsBalance(double amount)



{

       savingsBalance = amount;

}



   public void savingsdeposit1(double amount)



{

       savingsBalance = savingsBalance + amount;

}



   public void savingsdeposit()



{

     Scanner account2 = new Scanner(System.in);

     System.out.println("How much do you wish to deposit?");

     double input2 = account2.nextDouble();

     this.savingsdeposit1(input2);

     System.out.println();

     System.out.println("Your savings balance is:");

     System.out.println(this.getsavingsBalance());

}



   public void savingswithdraw(double amount)



{
        if (savingsBalance < amount){
            System.out.println("You can't withdraw that much.");
        }
       else {
           savingsBalance = savingsBalance - amount;
       }

}



   public void savingswithdraw()



{

     Scanner account2 = new Scanner(System.in);

     System.out.println("How much do you wish to withdraw?");

     int input2 = account2.nextInt();

     this.savingswithdraw(input2);

     System.out.println();

     System.out.println("Your savings balance is:");

     System.out.println(this.getsavingsBalance());

}



   public void changeSavings ()



{

     Scanner account1 = new Scanner(System.in);

     System.out.println("Do you wish to deposit or withdraw from savings? w = withdraw d = deposit");

     String input1 = account1.next();

     if (input1.equals("w"))

     {

       this.savingswithdraw();

     }

     if (input1.equals("d"))

     {

       this.savingsdeposit();

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