  
import java.util.Scanner;
public class LoanDeptTest
{
public static void main(String[] args)
 {
    double mortgage;
    double car; 
    double college;
    int score;
    LoanDept moneyOwed = new LoanDept();
    String name;
    int creditscore;
    System.out.print ( "Enter type of loan (lowercase): 'mortgage' 'car' 'college' 'home equity'");
    Scanner kind = new Scanner (System.in);
    name = kind.nextLine();
    System.out.print ( "Enter your credit score: ");
    Scanner ascore = new Scanner (System.in);
    score = ascore.nextInt();

//MORTGAGE
     if(name.equals("mortgage"))
     {
         double mname = 0;
//CREDIT SCORE
if(score >= 300 && score <= 629)
{
  System.out.print ("Your credit score is TRASH. You can borrow $50000. "); 
  mname = 50000;
}
if(score >= 630 && score <= 689)
{
  System.out.print ("Your credit score is OKAY. You can borrow $100000. "); 
  mname = 100000;
}
if(score >= 690 && score <= 719)
{
  System.out.print ("Your credit score is PRETTY GOOD. You can borrow $150000. "); 
  mname = 150000;
}
if(score >= 720 && score <= 850)
{
  System.out.print ("Your credit score is AMAZING. You can borrow $200000. "); 
  mname = 200000;
}
        moneyOwed.moveTo(0.0369);
        moneyOwed.mloan(mname);
        System.out.print("Money Owed per Month over 30 years: $" + moneyOwed.getMortgage());
     }

//CAR
      else if(name.equals("car"))
     {
         double carname = 0;
if(score >= 300 && score <= 629)
{
  System.out.print ("Your credit score is TRASH. You can borrow $50000. "); 
  carname = 50000;
}
if(score >= 630 && score <= 689)
{
  System.out.print ("Your credit score is OKAY. You can borrow $100000. "); 
  carname = 100000;
}
if(score >= 690 && score <= 719)
{
  System.out.print ("Your credit score is PRETTY GOOD. You can borrow $150000. "); 
  carname = 150000;
}
if(score >= 720 && score <= 850)
{
  System.out.print ("Your credit score is AMAZING. You can borrow $200000. "); 
  carname = 200000;
}
        moneyOwed.moveTo(0.0421);
        moneyOwed.cloan(carname);
        System.out.print("Money Owed per Month over 5 years: $" + moneyOwed.getCar());
     }
     
//COLLEGE
        else if(name.equals("college"))
     {
          double cname = 0;
if(score >= 300 && score <= 629)
{
  System.out.print ("Your credit score is TRASH. You can borrow $50000. "); 
  cname = 50000;
}
if(score >= 630 && score <= 689)
{
  System.out.print ("Your credit score is OKAY. You can borrow $100000. "); 
  cname = 100000;
}
if(score >= 690 && score <= 719)
{
  System.out.print ("Your credit score is PRETTY GOOD. You can borrow $150000. "); 
  cname = 150000;
}
if(score >= 720 && score <= 850)
{
  System.out.print ("Your credit score is AMAZING. You can borrow $200000. "); 
  cname = 200000;
}
        moneyOwed.moveTo(0.0453);
        moneyOwed.collegeloan(cname);
        System.out.print("Money Owed per Month over 10 years: $" + moneyOwed.getCollege());
     }
      else if(name.equals("home equity"))
      {
        double hname = 0;
if(score >= 300 && score <= 629)
{
  System.out.print ("Your credit score is TRASH. You can borrow $50000. "); 
  hname = 50000;
}
if(score >= 630 && score <= 689)
{
  System.out.print ("Your credit score is OKAY. You can borrow $100000. "); 
  hname = 100000;
}
if(score >= 690 && score <= 719)
{
  System.out.print ("Your credit score is PRETTY GOOD. You can borrow $150000. "); 
  hname = 150000;
}
if(score >= 720 && score <= 850)
{
  System.out.print ("Your credit score is AMAZING. You can borrow $200000. "); 
  hname = 200000;
}
         moneyOwed.moveTo(0.0565);
         moneyOwed.hloan(hname);
         System.out.print("Money Owed per Month over 15 years: $" + moneyOwed.getHome()); 
         //FIX NUMBERS TO ROUND 2 DECIMAL PLACES// 
      }
 }
}
//**********************************************************
class LoanDept
{
    public LoanDept()
    {
        myMortgage = 0;
        myCar = 0;
        myCollege = 0;
        myHome = 0;
    }
    public LoanDept(double mortgage, double car, double college, double home)
    {
        myMortgage = mortgage;
        myCar = car;
        myCollege = college;
        myHome = home;
    }
    public double getMortgage()
    {
        return myMortgage;
    }
//Modifier Methods
    public void setMortgage(double mortgage)
    {
        myMortgage = mortgage;
    }
    //interesting methods
    public void moveTo(double newInterest)
    {
    interest = newInterest;
    }
    public void mloan(double amount)
    {
    myMortgage = myMortgage + amount * (interest/12);
    }
    public double getCar()
    {
        return myCar;
    }
    
    public void setCar(double car)
    {
        myCar = car;
    }
    
    public void cloan(double amount)
    {
        myCar = myCar + amount * (interest/12);
    }
    public double getCollege()
    {
        return myCollege;
    }
    
    public void setCollege(double college)
    {
        myCollege = college;
    }
    
    public void collegeloan(double amount)
    {
    
        myCollege = myCollege + amount * (interest/12);
    }
    public double getHome()
    {
        return myHome;
    }
    
    public void setHome(double home)
    {
        myHome = home;
    }
    
    public void hloan(double amount)
    {
        myHome = myHome + amount * (interest/12);
    }
     double interest;
     double moneyOwed;
     double myMortgage;
     double myCar;
     double myCollege;
     double myHome;
}