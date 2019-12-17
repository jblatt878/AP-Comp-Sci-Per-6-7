import java.util.*;
// Alex Park, Dean Johnson, Anna Arushanyan 
// Period 6/7 
// December 12, 2019
public class Customer {

	public static void main(String[] args) {
		new Customer();
	}
	
    public Customer() 
    {
        Scanner customer = new Scanner(System.in); 
        System.out.println("Are you a new customer? Type yes or no.");
        String status = customer.next();
        if (status.equalsIgnoreCase("yes")) {
            TypeNew();
            ConfirmNew(); }
        if (status.equalsIgnoreCase("no")) {
            TypeReturn();
            ConfirmReturn(); }
        if (!(status.equalsIgnoreCase("yes"))&&!(status.equalsIgnoreCase("no"))) {
            System.out.println("There was an error.\n");
            New(); }
    }
    
    public void New() {
        Scanner customer = new Scanner(System.in); 
        System.out.println("Are you a new customer? Type yes or no.");
        String status = customer.next();
        if (status.equalsIgnoreCase("yes")) {
            TypeNew();
            ConfirmNew(); }
        if (status.equalsIgnoreCase("no")) {
            TypeReturn();
            ConfirmReturn(); }
        if (!(status.equalsIgnoreCase("yes"))&&!(status.equalsIgnoreCase("no"))) {
            System.out.println("There was an error.\n");
            New(); }
    }
    
public void TypeNew() {
    Scanner customer = new Scanner(System.in); 
    System.out.println("Enter your name (First-Last.....ex. John-Doe).");
    myName = customer.next();
    System.out.println("Enter your address (#-Street Name-Suffix.....ex. 1-Park-Avenue).");
    myAddress = customer.next();
    System.out.println("Enter your birthday (MM/DD/YYYY).");
    myBirthday = customer.next();
    System.out.println("Enter your card number (16 digits).");
    cardNumber = customer.nextLong();
    System.out.println("Enter a pin number (4 digits).");
    pin = customer.nextInt();
    System.out.println("Enter a username.");
    accountName = customer.next();
    System.out.println("Enter a password.");
    myPassword = customer.next();
    }

public void TypeReturn() {
    Scanner customer = new Scanner(System.in);	
    System.out.println("Enter your username.");
    accountName = customer.next();
    System.out.println("Enter your password.");
    myPassword = customer.next();
    System.out.println("Enter your pin number (4 digits).");
    pin = customer.nextInt();
    System.out.println("Enter your card number (16 digits).");
    cardNumber = customer.nextLong();
}
    
public void ConfirmNew() {
Scanner customer = new Scanner(System.in); 
    System.out.println(myName);
    System.out.println(myAddress);
    System.out.println(myBirthday);
    System.out.println(cardNumber);
    System.out.println(pin);
    System.out.println(accountName);
    System.out.println(myPassword);
    System.out.println("Is all of this information correct? Type yes or no.");
    String confirm = customer.next();
    if (confirm.equalsIgnoreCase("yes"))
        System.out.println("You are verified.");
    if (confirm.equalsIgnoreCase("no")) {
        TypeNew();
        ConfirmNew(); }
    if (!(confirm.equalsIgnoreCase("yes"))&&!(confirm.equalsIgnoreCase("no"))) {
        System.out.println("There was an error. Check your credentials again.");
        ConfirmNew();
    }
}
public void ConfirmReturn() {
Scanner customer = new Scanner(System.in); 
    System.out.println(accountName);
    System.out.println(myPassword);
    System.out.println(pin);
    System.out.println(cardNumber);
    System.out.println("Is all of this information correct? Type yes or no.");
    String confirm = customer.next();
    if (confirm.equalsIgnoreCase("yes"))
        System.out.println("You are verified.");
    if (confirm.equalsIgnoreCase("no")) {
        TypeReturn();
        ConfirmReturn(); }
    if (!(confirm.equalsIgnoreCase("yes"))&&!(confirm.equalsIgnoreCase("no"))) {
        System.out.println("There was an error. Check your credentials again.");
        ConfirmReturn(); }
}

//accessor methods
public String getMyName() {

	return myName;

}

public String getMyAddress() {

	return myAddress;

}

public String getMyBirthday() {

	return myBirthday;

}

public String getAccountName() {

	return accountName;

}

public String getMyPassword() {

	return myPassword;

}

public long getCardNumber() {

	return cardNumber;

}

public int getPin() {

	return pin;

}

//modifier methods
public void setMyName(String input_myName) {

	myName = input_myName;

}

public void setMyAddress(String input_myAddress) {

	myAddress = input_myAddress;

}

public void setAccountName(String input_accountName) {

	accountName = input_accountName;

}

public void setCardNumber(long input_cardNumber) {

	cardNumber = input_cardNumber;

}

public void setPin(int input_pin) {

	pin = input_pin;

}

public void setMyPassword(String input_myPassword) {

	myPassword = input_myPassword;

}

public void setMyBirthday(String input_myBirthday) {

	myBirthday = input_myBirthday;

}

String myName; 
String myAddress;
String myBirthday;
long cardNumber;
int pin;
String accountName;
String myPassword;
}
