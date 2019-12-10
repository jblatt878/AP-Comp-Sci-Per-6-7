import java.util.Scanner;
public class Display // Anthony Kravchenko  and Deep Patel 6/7 12_21_19
{
    public static void main(String[] args)
    {
        Investments sherman = new Investments(0,0);
        
         Investments.displayType();
        System.out.println("You have $" + sherman.getCD()+ " In your Certificate of Deposit account");
        System.out.println("You have $" + sherman.getMMA()+ " In your Money Market account");
       
       
       Scanner keyboard1 = new Scanner(System.in);
       System.out.print("Enter how much you wish to deposit in your Certificate of Deposit account: ");
        double x = keyboard1.nextDouble();
        
      
       System.out.print("Enter how much you wish to deposit in your Money Market account: ");
        double y = keyboard1.nextDouble();
        
        
         System.out.print("Enter how much you wish to withdraw in your Certificate of Deposit account, there will be a twenty dollar penalty: ");
        double a = keyboard1.nextDouble();
        
        //CD withdraw fee
        if (a!=0)
            {
                a=a+20;
            }
        
         
        
        
         System.out.print("Enter how much you wish to withdraw in your Money Market account: ");
        double b = keyboard1.nextDouble();
        
        //double
        sherman.setCD(0 + x -  a);  
        sherman.setMMA(0 + y - b);
       
        /*System.out.println("Would you like to transfer funds? Type 1 for yes or 2 for no.");
        int trans = keyboard1.nextInt();
        if (trans = 1)
        {
            System.out.println("Which account would you like to transfer to? Type 1 for CD or 2 for MMA.");
            int trans2 = keyboard1.nextInt();
            if 
        }*/
       
       
        //Overdraft fees
        sherman.MMAoverdraw();
       
        //Interest
        sherman.CDinterest();
        sherman.MMAinterest();
        
        //Round
        sherman.CDround();
        sherman.MMAround();
       
        
        
       
        System.out.println();
        System.out.println("You now have $" + sherman.getCD() + " In your Certificate of Deposit account");
        System.out.println("You now have $" + sherman.getMMA() + " In your Money Market account");
      
    
        
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

}
