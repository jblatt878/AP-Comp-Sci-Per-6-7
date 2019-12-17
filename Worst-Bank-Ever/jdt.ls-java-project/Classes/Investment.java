import java.util.Scanner;
public class Investment // Anthony Kravchenko  and Deep Patel 6/7 12_21_19
{
   public static void main(String[] args)
  {
    Investments anthony = new Investments();
    anthony.Investments1();
  }
}
// Investment Class
class Investments
{
   //default constructor
  public Investments()
  {
      myCD=0;
      myMMA=0;
    
    
  }
  // Other constructor
  public Investments(double CD, double MMA)
  {
      myCD= CD;
      myMMA = MMA;
  }
   public void Investments1()
  {

      Investments.displayType();
      System.out.println("You have $" + this.getCD()+ " In your Certificate of Deposit account");
      System.out.println("You have $" + this.getMMA()+ " In your Money Market account");
   
    //for while statement
     int loopy = 0;
   
   while(loopy!=2)
   {
   
        //Deposits
         Scanner keyboard1 = new Scanner(System.in);
        System.out.print("Enter how much you wish to deposit in your Certificate of Deposit account, there is a 2% interest rate: ");
        double x = keyboard1.nextDouble();
    
  
         System.out.print("Enter how much you wish to deposit in your Money Market account, there is a 5% interest rate: ");
         double y = keyboard1.nextDouble();
    
    
    
    
         //Withdrawls
         System.out.print("Enter how much you wish to withdraw in your Certificate of Deposit account, there will be a twenty dollar penalty: ");
         double a = keyboard1.nextDouble();
    
          //CD withdraw fee
         if (a!=0)
              {
                 a=a+20;
              }
    
     
         System.out.print("Enter how much you wish to withdraw from your Money Market account, if your account balance falls below $500 there will be a twenty dollar penalty: ");
        double b = keyboard1.nextDouble();
    
    
        //make transfer variable to prevent error
        double trans4 = 0;
        double trans6 = 0;
   
    
         //Tranfer
        System.out.println("Would you like to transfer funds from your checking account? Type 1 for yes or 2 for no.");
        int trans = keyboard1.nextInt();
        if (trans == 1)
         {
           System.out.println("Would you like to transfer to your CD account? Type 1 for yes or 2 for no.");
           int trans3 = keyboard1.nextInt();
           if (trans3 == 1)
           {
               System.out.println("How much?");
                  trans4 = keyboard1.nextDouble();
              }
            else if (trans3 == 2)
             {
                 System.out.println();
             }
        
             System.out.println("Would you like to transfer to your MMA account? Type 1 for yes or 2 for no.");
            int trans5 = keyboard1.nextInt();
            if (trans5 == 1)
            {
                System.out.println("How much?");
                trans6 = keyboard1.nextDouble();
            }
             else if (trans5 == 2)
             {
                  System.out.println();
             }
        
        
        }
    
        if (trans == 2)
         {
            System.out.println();
         }
   
    
    
   
         //Deposit,withdraw,transfer
        this.setCD(0 + x -  a + trans4);
        this.setMMA(0 + y - b + trans6);
    
    
         //Take away from Checking account
        vito.setcheckingBalance(vito.getcheckingBalance() - trans4 - trans6);
      
    
    
        //Overdraft fees
        this.MMAoverdraw();
   
        //Interest
        this.CDinterest();
        this.MMAinterest();
    
        //Round
        this.CDround();
        this.MMAround();
   
    
    
   
             System.out.println();
             System.out.println("You now have $"+ vito.getcheckingBalance() +"in your Checking Account ");
             System.out.println("You now have $" + this.getCD() + " in your Certificate of Deposit account");
             System.out.println("You now have $" + this.getMMA() + " in your Money Market account");
             
             
        System.out.print("Would you like to continue using our bank's investment services, type 1 for yes, 2 for no");
        loopy = keyboard1.nextInt();
                      
    }
  }
  
  
  
  
   //Accessor methods
  public double getCD()
  {
      return myCD;
  }
  public double getMMA()
  {
      return myMMA;
  }
 
   //Modifier methods
  public void setCD(double CD)
  {
      myCD = CD;
  }
  public void setMMA(double MMA)
  {
      myMMA = MMA;
  }
 
  //Interesting Methods
   public void MMAoverdraw()
  {
      if(myMMA< 500)
      {
        myMMA = myMMA-20;  ;
      }
  }
   public void CDinterest()
  {
      myCD = myCD*1.02;
  }
  public void MMAinterest()
  {
      myMMA = myMMA*1.05;
  }
 
  public void CDround()
  {
      myCD = (int) (myCD* 100 +.0001)/100.00;
  }
  public void MMAround()
  {
      myMMA = (int) (myMMA* 100 +.0001)/100.00;
  }
 
   
 
   public static void displayType()
  {
      System.out.println("Investments services");
  }
 
 
  // Properties
  double myCD;  //Certificate of Deposit
  double myMMA; //Money Market Account
  BankAccount vito = Main.vito;
}