import java.util.*;
// Alex Park, Dean Johnson, Anna Arushanyan 
// Period 6/7 
// December 5, 2019
public class Customer {

	public static void main(String[] args) {
		new Customer();
	}
	
    public Customer() 
    {
TypeInfo();
Confirm();
    }
    
public void TypeInfo() {
    Scanner customer = new Scanner(System.in); 
    System.out.println("Enter your name (First-Last.....ex. John-Doe).");
    myName = customer.next();
    System.out.println("Enter your address (#-Street Name-Suffix.....ex. 1-Park-Avenue).");
    myAddress = customer.next();
    System.out.println("Enter your birthday (MM/DD/YYYY).");
    myBirthday = customer.next();
    System.out.println("Enter your card number.");
    myCardNumber = customer.next();
    System.out.println("Enter your pin number.");
    myPin = customer.next();
    System.out.println("Enter your username.");
    myUsername = customer.next();
    System.out.println("Enter your password.");
    myPassword = customer.next();
    }
    
public void Confirm() {
Scanner customer = new Scanner(System.in); 
    System.out.println(myName);
    System.out.println(myAddress);
    System.out.println(myBirthday);
    System.out.println(myCardNumber);
    System.out.println(myPin);
    System.out.println(myUsername);
    System.out.println(myPassword);
    System.out.println("Is all of this information correct? Type yes or no.");
    String confirm = customer.next();
    if (confirm.equalsIgnoreCase("yes"))
        System.out.println("You are verified. Enjoy your day.");
    if (confirm.equalsIgnoreCase("no")) {
        TypeInfo();
        Confirm(); }
    if (!(confirm.equalsIgnoreCase("yes"))&&!(confirm.equalsIgnoreCase("no"))) {
        System.out.println("There was an error. Check your credentials again.");
        Confirm();
    }
}

private String myName; 
private String myAddress;
private String myBirthday;
private String myCardNumber;
private String myPin;
private String myUsername;
private String myPassword;
}

