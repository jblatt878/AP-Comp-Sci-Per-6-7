import java.util.Scanner;
public class Main {
    
    static BankAccount vito = new BankAccount();
    static Customer vito1 = new Customer();
    static ATM vito2 = new ATM("a","The Worst Bank",0,0);
    static EmployeeTeam vito4 = new EmployeeTeam();
    static Investment vito5 = new Investment();
    static LoanDeptTest vito6 = new LoanDeptTest();
    static safeDeposit vito7 = new safeDeposit(); 
    static CommercialLoanTest vito8 = new CommercialLoanTest();

    public static void main(String[] args) {

    System.out.println("Welcome to The Worst Bank™");
    String end = "g";
    while (end.equals("g"))
    {

    System.out.println();
    Scanner question = new Scanner(System.in);
    System.out.println("Are you a customer, employee, or a representative of a company?");
    System.out.println("c = customer e = employee r = company");
    String ans = question.next();
    if (ans.equals("c"))
    {
      vito1.main(args);
      System.out.println("Welcome customer!"); 
      Scanner question1 = new Scanner(System.in);
      System.out.println("Do you wish to access your account, go to the virtual ATM, start an investment, take out a loan, go to the safety deposit boxes, or exit.");
      System.out.println("a = account v = ATM i = investment l = loan b = deposit box e = exit");
      String ans1 = question1.next();
      if (ans1.equals("a"))
      {
        vito.BankAccount1();
      }
      else if (ans1.equals("v"))
      {
        String end1 = "g";
        while (end1.equals("g"))
        {
          vito2.UI();
          Scanner atm = new Scanner(System.in);
           System.out.println("Are you done, or do you wish to go back to ATM? enter 'g' to go back or enter any other character to exit");
           end1 = atm.next();
        }
      }
      else if (ans1.equals("i"))
      {
        vito5.main(args);
      }
      else if (ans1.equals("l"))
      {
        vito6.main(args);
      }
      else if (ans1.equals("b"))
      {
        vito7.main(args);
      }
      else if (ans1.equals("e"))
      {
        //null
      }
      else
      {
        System.out.println("Error, type the right characters.");
      }
    }

    else if (ans.equals("e"))
    {
      System.out.println("Welcome employee!");
      Scanner question2 = new Scanner(System.in);
      System.out.println("Do you wish to access your account, go to the virtual ATM, start an investment, take out a loan, go to the safety deposit boxes, access the employee account or return to start.");
      System.out.println("a = account v = ATM i = investment l = loan b = deposit box e = employee account r = return");
      String ans2 = question2.next();
      if (ans2.equals("a"))
      {
        vito.BankAccount1();
      }
      else if (ans2.equals("v"))
      {
        String end1 = "g";
        while (end1.equals("g"))
        {
          vito2.UI();
          Scanner atm = new Scanner(System.in);
           System.out.println("Are you done, or do you wish to go back to ATM? enter 'g' to go back or enter any other character to exit");
           end1 = atm.next();
        }
      }
      else if (ans2.equals("i"))
      {
        vito5.main(args);
      }
      else if (ans2.equals("l"))
      {
        vito6.main(args);
      }
      else if (ans2.equals("b"))
      {
        vito7.main(args);
      }
      else if (ans2.equals("e"))
      {
        vito4.getLogin();
      }
      else if (ans2.equals("r"))
      {
        //null
      }
      else
      {
        System.out.println("Error, type the right characters.");
      }
    }

    else if (ans.equals("r"))
    {
      System.out.println("Welcome representative of company!");
      vito8.main(args);
    }

    else
    {
      System.out.println("Error, please type 'c', 'e', or 'r'.");
    }

    Scanner end1 = new Scanner(System.in);
    System.out.println();
    System.out.println("Are you done, or do you wish to go back to starting screen? enter 'g' to go back or enter any other character to leave");
    end = end1.next();
    }

    System.out.println("Thank you for using The Worst Bank™, please come again... PLEASE!");
    }
}
