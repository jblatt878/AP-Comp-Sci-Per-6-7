import java.util.Scanner;
public class LoanDeptTest
{
public static void main(String[] args)
 {
    double mortgage;
    double car; 
    double college;
    int score;
    double productprice;
    LoanDept moneyOwed = new LoanDept();
    String name;
    System.out.print ( "Enter type of loan (lowercase): 'mortgage' 'car' 'college' 'home equity'\n");
    Scanner kind = new Scanner (System.in);
    name = kind.nextLine();
    System.out.print ( "Enter the price of the product you'd like a loan for: $");
    Scanner price = new Scanner (System.in);
    productprice = price.nextDouble();
//MORTGAGE
 if(name.equals("mortgage"))
     {
         double mname1 = 0;
System.out.print ("We can loan you up to $" + (productprice * 0.8) + ". Enter how much you want to be loaned: $");
    Scanner loan = new Scanner (System.in);
    mname1 = loan.nextDouble();
        moneyOwed.moveTo(0.0369);
        moneyOwed.mloan(mname1);
        System.out.print("Money Owed per Month over 30 years: $" + moneyOwed.getMortgage() + ". Your interest rate is 3.69%.");
     }

//CAR
      else if(name.equals("car"))
     {
         double carname = 0;
System.out.print ("We can loan you up to $" + (productprice * 0.8) + ". Enter how much you want to be loaned: $");
    Scanner loan1 = new Scanner (System.in);
    carname = loan1.nextDouble();
        moneyOwed.moveTo(0.0421);
        moneyOwed.cloan(carname);
        System.out.print("Money Owed per Month over 5 years: $" + moneyOwed.getCar() + ". Your interest rate is 4.21%.");
     }
     
//COLLEGE (https://www.nerdwallet.com/blog/loans/student-loans/much-borrow-college/)
        else if(name.equals("college"))
     {
        double cname = 0;
System.out.print ("We can loan you up to $" + (productprice * 0.8) + ". Enter how much you want to be loaned: $");
    Scanner loan2 = new Scanner (System.in);
    cname = loan2.nextDouble();
        moneyOwed.moveTo(0.0453);
        moneyOwed.collegeloan(cname);
        System.out.print("Money Owed per Month over 10 years: $" + moneyOwed.getCollege() + ". Your interest rate is 4.53%.");
     }
//HOME EQUITY
      else if(name.equals("home equity"))
      {
          double hname = 0;
System.out.print ("We can loan you up to $" + (productprice * 0.8) + ". Enter how much you want to be loaned: $");
    Scanner loan3 = new Scanner (System.in);
    hname = loan3.nextDouble();
         moneyOwed.moveTo(0.0565);
         moneyOwed.hloan(hname);
         System.out.print("Money Owed per Month over 15 years: $" + moneyOwed.getHome() + ". Your interest rate is 5.65%."); 
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
    myMortgage = Math.round(((amount * ((Math.pow((1 + interest / 12), 30*12))/360)) * 100.0) / 100.0); 
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
        myCar = Math.round(((amount * ((Math.pow((1 + interest / 12), 5*12))/60)) * 100.0) / 100.0);  
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
    
        myCollege = Math.round(((amount * ((Math.pow((1 + interest / 12), 10*12))/120)) * 100.0) / 100.0);  
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
        myHome = Math.round((( amount * ((Math.pow((1 + interest / 12), 15*12))/180)) * 100.0) / 100.0); 
    }
     double interest;
     double moneyOwed;
     double myMortgage;
     double myCar;
     double myCollege;
     double myHome;
}