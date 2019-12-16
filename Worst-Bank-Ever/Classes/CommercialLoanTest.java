import java.lang.Math;
import java.util.Scanner;

public class CommercialLoanTest
{

    public static void main(String args[]) 

    {

    BankAccount vito = Main.vito;
    int loop1 = 0;
    int loop2 = 0;  

    Scanner Input = new Scanner (System.in);  

    CommercialLoan newloan = new CommercialLoan();

    System.out.println("This section of the bank distributes and manages commercial loans for businesses");

    System.out.println("Enter your company name (username):");

    newloan.setUsername(Input.nextLine());    

    System.out.println("Set a password for future logins:");

    newloan.setPassword(Input.nextLine());

    System.out.println("Enter the type of loan needed (Enter 1 for a property loan, 2 for a loan to cover bills, 3 for a loan for new staff, or 4 for a loan for new equiment):");

    newloan.setLoantype(Input.nextInt());

    System.out.println("Enter the amount of money in dollars to be loaned:");

    newloan.setLoan(Input.nextDouble());

    System.out.println("Your amount to be loaned is $" + (Math.floor(newloan.calculateFinalLoan() * 100) / 100));

    System.out.println("A new checking account has been set up with the bank for you.");

    System.out.println("Enter the amount of months to pay the loan over to set up a payment plan:");

    newloan.setMonthlyPayments(Input.nextInt());

    System.out.println("The following is a spreadsheet of the payment calculations of your loan, and how much will need to be paid per month:");

    newloan.setLoanTemp(newloan.getLoan());
    newloan.setLoanEdited(newloan.getLoan());

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

        System.out.println("Welcome, " + newloan.getUsername() + ".  You currently owe a " + newloan.evaluateLoanType() + " loan of $" + (Math.floor(newloan.getLoanEdited() * 100) / 100) + " and have made " + newloan.getPaymentsMade() + " monthly payments.");


        while (loop1 == 0)

        {

            System.out.println("Press 1 to make new payments, press 2 to view the payment spreadsheet, or press 3 to log out. (Enter number individually until result)");
            Scanner Input3 = new Scanner (System.in); 

                if (Input3.nextInt() == 1)

                {
                    Scanner Input4 = new Scanner (System.in);
                    System.out.println("The current amount of the loan still owed is $" + (Math.floor(newloan.getLoanEdited() * 100) / 100) + ", with " + newloan.getPaymentsMade() + " payments having been made.");
                    System.out.println("This monthly principal is $" + (Math.floor(newloan.calculatePrincipalFinal() * 100) / 100));
                    System.out.println("Press 4 to make this payment, or press 0 to cancel (Enter number individually until result)");

                        if (Input4.nextInt() == 4)

                        {

                            vito.checkingdeposit(newloan.calculatePrincipalFinal());
                            System.out.println("The payment has been deposited to your checking account, which now has $" + (Math.floor(vito.getcheckingBalance() * 100) / 100));
                            newloan.makePayment();
                            System.out.println("You now owe $" + (Math.floor(newloan.getLoanEdited() * 100) / 100) + " on the loan.");

                        }

                        else if (Input4.nextInt() == 0)

                        {
                            System.out.println("No payment was made.");
                        }

                }

               else if (Input3.nextInt() == 2)

                {
                    System.out.println("The current amount of the loan still owed is $" + (Math.floor(newloan.getLoanEdited() * 100) / 100) + ", " + "or month #" + (1 + newloan.getPaymentsMade()) +", with " + newloan.getPaymentsMade() + " payments having been made.");
                    System.out.println("\nRepayment per Month: $" + (Math.floor(newloan.calculateMonthlyPayment() * 100) / 100));
                    System.out.println("+---------------------------------------------------------------------------------------------+");
                    System.out.println("| Month |        Starting Balance |     Interest (3.5%) |       Principal |    Ending Balance |");
                    System.out.println("|---------------------------------------------------------------------------------------------|");

                    newloan.setMonthsTemp(1);
                    newloan.setLoanTemp(newloan.getLoan());

                    while (newloan.getMonthsTemp() <= newloan.getMonths())

                    {

                    System.out.format("|%6s | $%22s | $%18s ", newloan.getMonthsTemp(), (Math.floor(newloan.getLoanTemp() * 100) / 100), (Math.floor(newloan.calculateInterest() * 100) / 100)); //%20s %16s %18  (Math.floor(newloan.getLoanTemp() * 100) / 100)
                    System.out.format("| $%14s | $%16s |\n", (Math.floor(newloan.calculatePrincipal() * 100) / 100), (Math.floor(newloan.calculateEndingBalance() * 100) / 100));

                    newloan.incrementMonthsTemp(newloan.getMonthsTemp());    

                    }

                    System.out.println("+---------------------------------------------------------------------------------------------+");


                }

                else if (Input3.nextInt() == 3)

                {
                    System.out.println("You've been logged out.");
                    break;
                }

        }   

    }

    }

}

class CommercialLoan
{

    //constructors 
    public CommercialLoan()
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

    public void setMonthsTemp(int inputmonths)
    {
        monthstemp = inputmonths;
    }

    public void setLoanEdited(double loanedit)
    {
    	loanedited = loanedit;
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

    public double getLoanEdited()
    {
    	return loanedited;
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
        return monthlypayment - (loanedited * (Interest / (double) months));
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
    	loanedited = loanedited - (monthlypayment - (loanedited * (Interest / (double) months)));
        loantemp = loanedited;
        paymentsmade++;
        return loanedited;
    }

    //Properties
    public double loan;
    public double loanedited;
    public int loantype;
    public double loantemp;
    public int months;
    public int monthstemp;
    public double monthlypayment;
    public int paymentsmade;

    //for calculations
    public double i;
    public double n;

    //for login
    public String cipassword;
    public String ciusername;

    //Serve as additional costs added to the loan depending on the type of loan
    double MainteneceCost = 1.05;  //To cover land maintenece cost for *property loan
    double FeesCost = 1.025; //To cover mailing/transaction fees for a loan used to pay *bills
    double HiringCost = 1.075; //To cover the cost of the hiring process on a loan for new *staff
    double InsuranceCost = 1.1; //To cover insurance on a loan for new *equipment
    double Interest = 0.035;
}
