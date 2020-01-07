import java.util.Scanner;

public class EmployeeTeam
{
    public static void main(String[] args) 
    {
    Scanner input1 = new Scanner(System.in);
    System.out.println("Pick your Employee ID between 1-5");
    int value = input1.nextInt(); 
    
    if (value == 1) 
    {
    getLogin1(); 
    }
    else if (value == 2)
    {
    getLogin2();
    }
    else if (value == 3) {
    getLogin3();
    }
    else if (value == 4) {
    getLogin4();
    }
    else if  (value == 5) {
    getLogin5();
    }
    }

    public static void getLogin1()
    {

    String Username1;
    String Password1;
   

    Password1 = "456293"; 
    Username1 = "BankTeller";
    
    Scanner input1 = new Scanner(System.in);
    System.out.println("Enter Username : ");
    String username = input1.next();

    Scanner input2 = new Scanner(System.in);
    System.out.println("Enter Password : ");
    String password = input2.next();

    if (username.equals(Username1) && password.equals(Password1)) 
    {
        System.out.println("Access Granted! Welcome!");
        System.out.println();
        System.out.println("Bank Teller");
        System.out.println("*****************************"); 
        payRate();
    }
    else if (username.equals(Username1)) 
    {
        System.out.println("Invalid Password!");
    } else if (password.equals(Password1)) 
    {
        System.out.println("Invalid Username!");
    } else {
        System.out.println("Invalid Username & Password!");
    }
    }
    
   public static void getLogin2()
    {

    String Username2;
    String Password2;
   

    Password2 = "657658";
    Username2 = "Security";
    
    Scanner input1 = new Scanner(System.in);
    System.out.println("Enter Username : ");
    String username = input1.next();

    Scanner input2 = new Scanner(System.in);
    System.out.println("Enter Password : ");
    String password = input2.next();

    if (username.equals(Username2) && password.equals(Password2)) 
    {
        System.out.println("Access Granted! Welcome!");
        System.out.println();
        System.out.println("Security");
        System.out.println("*****************************"); 
        payRate();
    }
    else if (username.equals(Username2)) 
    {
        System.out.println("Invalid Password!");
    } else if (password.equals(Password2)) 
    {
        System.out.println("Invalid Username!");
    } else {
        System.out.println("Invalid Username & Password!");
    }
    }
     public static void getLogin3()
    {

    String Username3;
    String Password3;
   

    Password3 = "321455";
    Username3 = "Janitor";
    
    Scanner input1 = new Scanner(System.in);
    System.out.println("Enter Username : ");
    String username = input1.next();

    Scanner input2 = new Scanner(System.in);
    System.out.println("Enter Password : ");
    String password = input2.next();

    if (username.equals(Username3) && password.equals(Password3)) 
    {
        System.out.println("Access Granted! Welcome!");
        System.out.println();
        System.out.println("Janitor");
        System.out.println("*****************************"); 
        payRate();
    }
    else if (username.equals(Username3)) 
    {
        System.out.println("Invalid Password!");
    } else if (password.equals(Password3)) 
    {
        System.out.println("Invalid Username!");
    } else {
        System.out.println("Invalid Username & Password!");
    }
    }
     public static void getLogin4()
    {

    String Username4;
    String Password4;
   

    Password4 = "694208";
    Username4 = "Manager";
    
    Scanner input1 = new Scanner(System.in);
    System.out.println("Enter Username : ");
    String username = input1.next();

    Scanner input2 = new Scanner(System.in);
    System.out.println("Enter Password : ");
    String password = input2.next();

    if (username.equals(Username4) && password.equals(Password4)) 
    {
        System.out.println("Access Granted! Welcome!");
        System.out.println();
        System.out.println("Manager");
        System.out.println("*****************************"); 
        payRate();
    }
    else if (username.equals(Username4)) 
    {
        System.out.println("Invalid Password!");
    } else if (password.equals(Password4)) 
    {
        System.out.println("Invalid Username!");
    } else {
        System.out.println("Invalid Username & Password!");
    }
    }
    
    public static void getLogin5()
    {

    String Username5;
    String Password5;
   

    Password5 = "236547";
    Username5 = "HR";
    
    Scanner input1 = new Scanner(System.in);
    System.out.println("Enter Username : ");
    String username = input1.next();

    Scanner input2 = new Scanner(System.in);
    System.out.println("Enter Password : ");
    String password = input2.next();

    if (username.equals(Username5) && password.equals(Password5)) 
    {
        System.out.println("Access Granted! Welcome!");
        System.out.println();
        System.out.println("Human Resources");
        System.out.println("*****************************"); 
        payRate();
    }
    else if (username.equals(Username5)) 
    {
        System.out.println("Invalid Password!");
    } else if (password.equals(Password5)) 
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
