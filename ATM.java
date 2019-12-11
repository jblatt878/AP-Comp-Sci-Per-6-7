/*import java.time.LocalDate;
class ATM {
	//default constructor
	public ATM() {
		location = "";
		managedBy = "";
		accountName = "";
		cardNumber = 0;
		pin = 0;
	}
	//other constructors: one will locate an account from the account name, one will locate from the card number
	public ATM(String input_location, String input_managedBy, String input_accountName, int input_pin) {
		location = input_location;
		managedBy = input_managedBy;
		accountName = input_accountName;
		cardNumber = 0;
		pin = input_pin;
	}
	public ATM(String input_location, String input_managedBy, int input_cardNumber, int input_pin) {
		location = input_location;
		managedBy = input_managedBy;
		accountName = "";
		cardNumber = input_cardNumber;
		pin = input_pin;
	}
	//accessor methods
	public String getLocation() {
		return location;
	}
	public String getManagedBy() {
		return managedBy;
	}
	public String getAccountName() {
		return accountName;
	}
	public int getCardNumber() {
		return cardNumber;
	}
	public int getPin() {
		return pin;
	}
	//modifier methods
	public void setLocation(String input_location) {
		location = input_location;
	}
	public void setManagedBy(String input_managedBy) {
		managedBy = input_managedBy;
	}
	public void setAccountName(String input_accountName) {
		accountName = input_accountName;
	}
	public void setCardNumber(int input_cardNumber) {
		cardNumber = input_cardNumber;
	}
	public void setPin(int input_pin) {
		pin = input_pin;
	}
	//methods
	public void deposit(int amount) {
		accountBalance += amount;
	}
	public int withdraw(int amount) {
		//check date: if date is different than the initial value, reset the daily amount
		if (!date.equalsIgnoreCase(LocalDate.now().toString())) {
			date = LocalDate.now().toString();
			dailyAmount = 1000;
		}
		//check managedBy: if a different company's atm is used, add a $5 charge
		int charge = 0;
		if (!managedBy.equalsIgnoreCase("Bank Name")) {
			charge = 5;
		}
		//check dailyAmount: don't return money if there is no money left in the atm
		if (dailyAmount == 0) {
			System.out.println("There are insufficient funds in this ATM.");
			//System.out.println("balance = " + accountBalance);
			return 0;
		}
		//check accountBalance: make sure there is enough money in the account, this is the "correct" output
		if ((amount + charge) < accountBalance) {
			if (amount < dailyAmount) {
				accountBalance -= (amount + charge);
				//System.out.println("balance = " + accountBalance);
				dailyAmount -= amount;
				return amount;
			}
			//check dailyAmount: atm can only output at most as much money as it contains
			else {
				System.out.println("There are insufficient funds in this ATM.");
				int temp = dailyAmount;
				accountBalance -= (dailyAmount + charge);
				dailyAmount = 0;
				//System.out.println("balance = " + accountBalance);
				return temp;
			}
		}
		//output for when there is not enough money in the account, returns as much money as the account has
		else {
			System.out.println("There are insufficient funds in this account.");
			int temp = accountBalance;
			accountBalance = 0;
			return temp;
		}
	}
	//variables
	String location;
	String managedBy;
	String accountName;
	int cardNumber;
	int pin;
	int dailyAmount = 1000;
	int accountBalance = 10000;
	String date = LocalDate.now().toString();
}*/

import java.time.LocalDate;
import java.util.Scanner;
class ATM {
	//default constructor
	public ATM() {
		location = "";
		managedBy = "";
		accountName = "";
		cardNumber = 0;
		pin = 0;
	}
	//other constructors: one will locate an account from the account name, one will locate from the card number
	public ATM(String input_location, String input_managedBy, String input_accountName, int input_pin) {
		location = input_location;
		managedBy = input_managedBy;
		accountName = input_accountName;
		cardNumber = 0;
		pin = input_pin;
	}
	public ATM(String input_location, String input_managedBy, int input_cardNumber, int input_pin) {
		location = input_location;
		managedBy = input_managedBy;
		accountName = "";
		cardNumber = input_cardNumber;
		pin = input_pin;
	}
	//accessor methods
	public String getLocation() {
		return location;
	}
	public String getManagedBy() {
		return managedBy;
	}
	public String getAccountName() {
		return accountName;
	}
	public int getCardNumber() {
		return cardNumber;
	}
	public int getPin() {
		return pin;
	}
	//modifier methods
	public void setLocation(String input_location) {
		location = input_location;
	}
	public void setManagedBy(String input_managedBy) {
		managedBy = input_managedBy;
	}
	public void setAccountName(String input_accountName) {
		accountName = input_accountName;
	}
	public void setCardNumber(int input_cardNumber) {
		cardNumber = input_cardNumber;
	}
	public void setPin(int input_pin) {
		pin = input_pin;
	}
	//methods
	public void deposit() {
		vito.checkingdeposit();
	}
	public int withdraw() {
		//ui: get withdraw amount
		Scanner input = new Scanner(System.in);
		System.out.println("How much do you want to withdraw?");
		int amount = input.nextInt();
		input.close();
		//check date: if date is different than the initial value, reset the daily amount
		if (!date.equalsIgnoreCase(LocalDate.now().toString())) {
			date = LocalDate.now().toString();
			dailyAmount = 1000;
		}
		//check managedBy: if a different company's atm is used, add a $5 charge
		int charge = 0;
		if (!managedBy.equalsIgnoreCase("Bank Name")) {
			charge = 5;
		}
		//check dailyAmount: don't return money if there is no money left in the atm
		if (dailyAmount == 0) {
			System.out.println("There are insufficient funds in this ATM.");
			//System.out.println("balance = " + accountBalance);
			return 0;
		}
		//check accountBalance: make sure there is enough money in the account, this is the "correct" output
		if ((amount + charge) < vito.getcheckingBalance()) {
			if (amount < dailyAmount) {
				vito.checkingwithdraw(amount + charge);
				//System.out.println("balance = " + accountBalance);
				dailyAmount -= amount;
				return amount;
			}
			//check dailyAmount: atm can only output at most as much money as it contains
			else {
				System.out.println("There are insufficient funds in this ATM.");
				int temp = dailyAmount;
				vito.checkingwithdraw(dailyAmount + charge);
				dailyAmount = 0;
				//System.out.println("balance = " + accountBalance);
				return temp;
			}
		}
		//output for when there is not enough money in the account, returns as much money as the account has
		else {
			System.out.println("There are insufficient funds in this account.");
			int temp = vito.getcheckingBalance();
			vito.checkingwithdraw(vito.getcheckingBalance());
			return temp;
		}
	}
	//variables
	String location;
	String managedBy;
	String accountName;
	int cardNumber;
	int pin;
	int dailyAmount = 1000;
	String date = LocalDate.now().toString();
}
