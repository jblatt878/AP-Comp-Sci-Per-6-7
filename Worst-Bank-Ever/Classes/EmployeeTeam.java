import java.util.Scanner;

public class EmployeeTeam
{
    public static void main(String[] args) 
    {
    getLogin();
    
    }

    public static void getLogin()
    {

    String Username;
    String Password;

    Password = "456293"; 
    Username = "BankTeller";

    Scanner input1 = new Scanner(System.in);
    System.out.println("Enter Username : ");
    String username = input1.next();

    Scanner input2 = new Scanner(System.in);
    System.out.println("Enter Password : ");
    String password = input2.next();

    if (username.equals(Username) && password.equals(Password)) 
    {
        System.out.println("Access Granted! Welcome!");
        System.out.println();
        payRate();
    }

    else if (username.equals(Username)) 
    {
        System.out.println("Invalid Password!");
    } else if (password.equals(Password)) 
    {
        System.out.println("Invalid Username!");
    } else {
        System.out.println("Invalid Username & Password!");
    }
} 
  
    public static void payRate()
    {
     double tax = 0;
     double SIrate = 0;	
     double FIrate = 0; 		
     double netpay = 0;
     double pay = 0;
     final double PAY_RATE = 22.00; 
     double hours = 0; 
     Scanner input3 = new Scanner(System.in);
     System.out.println("Enter hours worked: "); 
     hours = input3.nextDouble();
     pay = ( hours * PAY_RATE ) ;
     FIrate = ( pay * .0927);
     SIrate = ( pay * .0206);
     tax = (FIrate + SIrate);
     netpay = ( pay - tax );
     System.out.println("*****************************"); 
     System.out.println("Employee : Bank Teller"); 
     System.out.println("Hour : " + hours ); 
     System.out.println("Payrate : " + PAY_RATE); 
     System.out.println("Pay : " + pay); 
     System.out.println("*****************************");
     System.out.println("Taxes");
     System.out.println("Federal Income : " + (Math.floor(FIrate*100+0.5)/100));
     System.out.println("State Income : " + (Math.floor(SIrate*100+0.5)/100));
     System.out.println("Total Deductions : " + (Math.floor(tax*100+0.5)/100));
     System.out.println("*****************************");
     System.out.println("Net Pay : " + (Math.floor(netpay*100+0.5)/100));
     } 
}
