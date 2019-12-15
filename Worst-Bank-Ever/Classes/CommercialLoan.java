import java.lang.Math;
import java.util.Scanner;

public class CommercialLoan
{
  
    public static void main(String args[]) 

    {

    int loop1 = 0;
    int loop2 = 0;  
    int loop3 = 0; 

    Scanner Input = new Scanner (System.in);  

    CommercialLoan1 newloan = new CommercialLoan1();

    System.out.println("This section of the bank distributes and manages commercial loans for businesses");

    System.out.println("Enter your company name (this will serve as the username for future logins):");

    newloan.setUsername(Input.nextLine());

    System.out.println("Set a password:");

    newloan.setPassword(Input.nextLine());

    System.out.println("Enter the type of loan needed (Enter 1 for a property loan, 2 for a loan to cover bills, 3 for a loan for new staff, or 4 for a loan for new equiment):");

    newloan.setLoantype(Input.nextInt());

    System.out.println("Enter the amount of money in dollars to be loaned:");

    newloan.setLoan(Input.nextDouble());

    System.out.println("Your amount to be loaned is $" + (Math.floor(newloan.calculateFinalLoan() * 100) / 100));

    //OTHER CLASSES
    
    vito.savingswithdraw(newloan.getLoan());

    System.out.println("The new bank account balance is $" + (Math.floor(vito.getsavingsBalance() * 100) / 100));

    System.out.println("Enter the amount of months to pay the loan over to set up a payment plan:");

    newloan.setMonthlyPayments(Input.nextInt());

    System.out.println("The following is a spreadsheet of the payment calculations of your loan, and how much will need to be paid per month:");

    newloan.setLoanTemp(newloan.getLoan());

    System.out.println("\nRepayment per Month: $" + (Math.floor(newloan.calculateMonthlyPayment() * 100) / 100));
    System.out.println("+---------------------------------------------------------------------------------------------+");
    System.out.println("| Month |        Starting Balance |     Interest (3.5%) |       Principal |    Ending Balance |");
    System.out.println("|---------------------------------------------------------------------------------------------|");

    while (newloan.getMonthsTemp() <= newloan.getMonths())

    {

    System.out.format("|%6s | $%22s | $%18s ", newloan.getMonthsTemp(), (Math.floor(newloan.getLoanTemp() * 100) / 100), (Math.floor(newloan.calculateInterest() * 100) / 100)); //%20s %16s %18  (Math.floor(newloan.getLoanTemp() * 100) / 100)
    System.out.format("| $%14s | $%16s |\n", (Math.floor(newloan.calculatePrincipal() * 100) / 100), (Math.floor(newloan.calculateEndingBalance() * 100) / 100));

    newloan.incrementMonthsTemp(newloan.getMonthsTemp());    


    }

    System.out.println("+---------------------------------------------------------------------------------------------+");



    System.out.println("The loan has been created.  You will now be logged out and prompted to log back in.");

    Scanner Input2 = new Scanner (System.in); 

    while (loop2 == 0)

    {

        while (loop1 == 0)

        {
            System.out.print("\nEnter username: ");

            if (Input2.nextLine().equals(newloan.getUsername()))
            break;

            else
            System.out.println("Invalid username, try again.");

        }

        while (loop1 == 0)

        {
            System.out.print("\nEnter password: ");

            if (Input2.nextLine().equals(newloan.getPassword()))
            break;

            else
            System.out.println("Invalid password, try again.");

        }

        System.out.println("Welcome, " + newloan.getUsername() + ".  You currently owe a " + newloan.evaluateLoanType() + " loan of $" + (Math.floor(newloan.getLoan() * 100) / 100) + " and have made " + newloan.getPaymentsMade() + " monthly payments.");


        while (loop1 == 0)

        {

            System.out.println("Press 1 to make new payments, press 2 to view the payment spreadsheet, or press 3 to log out. (Enter number individually until result)");

                if (Input2.nextInt() == 1)

                {
                    Scanner Input3 = new Scanner (System.in);
                    System.out.println("The current amount of the loan still owed is $" + (Math.floor(newloan.getLoan() * 100) / 100) + ", with " + newloan.getPaymentsMade() + " payments having been made.");
                    System.out.println("This monthly principal is $" + (Math.floor(newloan.calculatePrincipalFinal() * 100) / 100));
                    System.out.println("Press 4 to make this payment, or press 0 to cancel (Enter number individually until result)");

                        if (Input3.nextInt() == 4)

                        {
                            vito.savingsdeposit1(newloan.calculatePrincipalFinal());
                            newloan.makePayment();
                            System.out.println("A new payment on the loan has just been made, you now owe $" + (Math.floor(newloan.getLoan() * 100) / 100));

                        }

                        else if (Input3.nextInt() == 0)

                        {
                            System.out.println("No payment was made.");
                        }

                }

                else if (Input2.nextInt() == 2)

                {

                    System.out.println("The current amount of the loan still owed is $" + (Math.floor(newloan.getLoan() * 100) / 100) + ", with " + newloan.getPaymentsMade() + " payments having been made.");
                    System.out.println("\nRepayment per Month: $" + (Math.floor(newloan.calculateMonthlyPayment() * 100) / 100));
                    System.out.println("+---------------------------------------------------------------------------------------------+");
                    System.out.println("| Month |        Starting Balance |     Interest (3.5%) |       Principal |    Ending Balance |");
                    System.out.println("|---------------------------------------------------------------------------------------------|");

                    while (newloan.getMonthsTemp() <= newloan.getMonths())

                    {

                    System.out.format("|%6s | $%22s | $%18s ", newloan.getMonthsTemp(), (Math.floor(newloan.getLoanTemp() * 100) / 100), (Math.floor(newloan.calculateInterest() * 100) / 100)); //%20s %16s %18  (Math.floor(newloan.getLoanTemp() * 100) / 100)
                    System.out.format("| $%14s | $%16s |\n", (Math.floor(newloan.calculatePrincipal() * 100) / 100), (Math.floor(newloan.calculateEndingBalance() * 100) / 100));

                    newloan.incrementMonthsTemp(newloan.getMonthsTemp());    


                    }

                    System.out.println("+---------------------------------------------------------------------------------------------+");


                }

                else if (Input2.nextInt() == 3)

                {
                    System.out.println("You've been logged out.");
                    break;
                }

        }   

    }

    }
        static BankAccount vito = Main.vito;
}

class CommercialLoan1
{

    //constructors 
    public CommercialLoan1()
    {
        loan = 0;
        monthstemp = 1;
        paymentsmade = 0;
    }

    //modifiers 

    ////set
    public void setLoantype(int typeinput)
    {
        loantype = typeinput;
    }

    public void setLoan(double loaninput)
    {
        loan = loaninput;
    }

    public void setMonthlyPayments(int monthinput)
    {
        months = monthinput;
    }

    public void setLoanTemp(double loantempinput)
    {
        loantemp = loantempinput;
    }

    public void setUsername(String un)
    {
        ciusername = un;
    }

    public void setPassword(String pw)
    {
        cipassword = pw;
    }

    ////other
    public void incrementMonthsTemp(int monthsmethod)
    {
        monthstemp = monthsmethod + 1;
    }


    //accessor
    public double getLoan()
    {
        return loan;
    }

    public int getMonths()
    {
        return months;
    }

    public int getMonthsTemp()
    {
        return monthstemp;
    }

    public double getLoanTemp()
    {
        return loantemp;
    }

    public double getMonthlyPayment()
    {
        return monthlypayment;
    }

    public String getUsername()
    {
        return ciusername;
    }

    public String getPassword()
    {
        return cipassword;
    }

    public int getPaymentsMade()
    {
        return paymentsmade;
    }

    //interesting
    public double calculateFinalLoan()
    {
        if (loantype == 1)
        {
            return loan = loan * MainteneceCost;
        }

        else if (loantype == 2)
        {
            return loan = loan * FeesCost;
        }

        else if (loantype == 3)
        {
            return loan = loan * HiringCost;
        }

        else if (loantype == 4)
        {
            return loan = loan * InsuranceCost;
        }

        else
        {
            return loan;
        }

    }

    public String evaluateLoanType()
    {
        if (loantype == 1)
        {
            return "property";
        }

        else if (loantype == 2)
        {
            return "bills";
        }

        else if (loantype == 3)
        {
            return "staff";
        }

        else if (loantype == 4)
        {
            return "equipment";
        }

        else
        {
            return "";
        }

    }

    //public double subtractLoan()

    //{
        //return accountbalance - loan;
    //}


    public double calculateMonthlyPayment()

    {
        i = Interest / (double) months;
        n = (double) months;
        monthlypayment = loan / (((Math.pow((1 + i), n)) - 1) / (i * (Math.pow((1 + i), n))));
        return monthlypayment;

    }

    public double calculateInterest()

    {
        return loantemp * (Interest / (double) months);
    }

    public double calculatePrincipal()

    {
        return monthlypayment - (loantemp * (Interest / (double) months));
    }

    public double calculatePrincipalFinal()

    {
        return monthlypayment - (loan * (Interest / (double) months));
    }

    public double calculateEndingBalance()

    {
        loantemp = loantemp - (monthlypayment - (loantemp * (Interest / (double) months)));

        if (loantemp < 0)
        loantemp = loantemp + 0.01;

        return loantemp;
    }

    public double makePayment()

    {
        loan = loan - (monthlypayment - (loan * (Interest / (double) months)));
        paymentsmade++;
        return loan;
    }

    //Properties
    public double loan;
    public int loantype;
    public double loantemp;
    public int months;
    public int monthstemp;
    public double monthlypayment;
    public int paymentsmade;

    //for calculations
    public double i;
    public double n;

    public String cipassword;
    public String ciusername;

    //Serve as additional costs added to the loan depending on the type of loan
    double MainteneceCost = 1.05;  //To cover land maintenece cost for *property loan
    double FeesCost = 1.025; //To cover mailing/transaction fees for a loan used to pay *bills
    double HiringCost = 1.075; //To cover the cost of the hiring process on a loan for new *staff
    double InsuranceCost = 1.1; //To cover insurance on a loan for new *equipment
    double Interest = 0.035;

}