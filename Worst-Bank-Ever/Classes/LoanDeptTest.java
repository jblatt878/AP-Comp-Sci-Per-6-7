import java.util.Scanner;
public class LoanDeptTest
{
public static void main(String[] args)
 {
    double mortgage;
    double car; 
    double college;
    int score;
    double salary;
    LoanDept moneyOwed = new LoanDept();
    String name;
    System.out.print ( "Enter type of loan (lowercase): ");
    Scanner kind = new Scanner (System.in);
    name = kind.nextLine();
    System.out.print ( "Enter your salary: $");
    Scanner income = new Scanner (System.in);
    salary = income.nextDouble();
//MORTGAGE
 if(name.equals("mortgage"))
     {
         double mname1 = 0;
System.out.print ("You can loan up to $" + (salary * 2) + ". Enter how much you want to loan: $");
    Scanner loan = new Scanner (System.in);
    mname1 = loan.nextDouble();
        moneyOwed.moveTo(0.0369);
        moneyOwed.mloan(mname1);
        System.out.print("Money Owed per Month over 30 years: $" + moneyOwed.getMortgage());
     }

//CAR
      else if(name.equals("car"))
     {
         double carname = 0;
System.out.print ("You can loan up to $" + (salary * 1.1) + ". Enter how much you want to loan: $");
    Scanner loan1 = new Scanner (System.in);
    carname = loan1.nextDouble();
        moneyOwed.moveTo(0.0421);
        moneyOwed.cloan(carname);
        System.out.print("Money Owed per Month over 5 years: $" + moneyOwed.getCar());
     }
     
//COLLEGE (https://www.nerdwallet.com/blog/loans/student-loans/much-borrow-college/)
        else if(name.equals("college"))
     {
        double cname = 0;
System.out.print ("You can loan up to $" + (salary * 1.5) + ". Enter how much you want to loan: $");
    Scanner loan2 = new Scanner (System.in);
    cname = loan2.nextDouble();
        moneyOwed.moveTo(0.0453);
        moneyOwed.collegeloan(cname);
        System.out.print("Money Owed per Month over 10 years: $" + moneyOwed.getCollege());
     }
//HOME EQUITY
      else if(name.equals("home equity"))
      {
          double hname = 0;
System.out.print ("You can loan up to $" + (salary * 2) + ". Enter how much you want to loan: $");
    Scanner loan3 = new Scanner (System.in);
    hname = loan3.nextDouble();
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