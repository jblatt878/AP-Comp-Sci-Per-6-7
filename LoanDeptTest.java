import java.util.Scanner;
public class LoanDeptTest
{
public static void main(String[] args)
 {
    double mortgage;
    double car; 
    double college;
    LoanDept moneyOwed = new LoanDept();
String name;
    System.out.print ( "Enter type of loan (lowercase): ");
    Scanner kind = new Scanner (System.in);
    name = kind.nextLine();
     if(name.equals("mortgage"))
     {
        moneyOwed.moveTo(0.0369);
        moneyOwed.mloan(200000);
        System.out.print("Money Owed per Month over 30 years: " + moneyOwed.getMortgage());
     }
      else if(name.equals("car"))
     {
        moneyOwed.moveTo(0.0421);
        moneyOwed.cloan(20000);
        System.out.print("Money Owed per Month over 5 years: " + moneyOwed.getCar());
     }
        else if(name.equals("college"))
     {
        moneyOwed.moveTo(0.0453);
        moneyOwed.collegeloan(40000);
        System.out.print("Money Owed per Month over 10 years: " + moneyOwed.getCollege());
     }
      else if(name.equals("home equity"))
      {
         moneyOwed.moveTo(0.0565);
         moneyOwed.hloan(25000);
         System.out.print("Money Owed per Month over 15 years: " + moneyOwed.getHome()); 
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
    public LoanDept(double mortgage, double car, double college, double business, double home)
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
    private double interest;
    private double moneyOwed;
    private double myMortgage;
    private double myCar;
    private double myCollege;
    private double myBusiness;
    private double myHome;
}