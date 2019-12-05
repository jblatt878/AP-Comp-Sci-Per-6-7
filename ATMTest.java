
public class ATMTest {

	public static void main(String[] args) {
		ATM test = new ATM("a", "Bank Name", "c", 234);
		System.out.println("Example ATM with no extra charges:");
		System.out.println("widthdraw(400), returns: $" + test.withdraw(400));
		System.out.println("widthdraw(2000), returns: $" + test.withdraw(2000));
		System.out.println("widthdraw(500), returns: $" + test.withdraw(500));
		System.out.println();
		ATM test_wrongManagedBy = new ATM("a", "b", "c", 234);
		System.out.println("Example ATM that does not belong to the host bank, having extra charges:");
		System.out.println("widthdraw(400), returns: $" + test_wrongManagedBy.withdraw(400));
		System.out.println("widthdraw(2000), returns: $" + test_wrongManagedBy.withdraw(2000));
		System.out.println("widthdraw(500), returns: $" + test_wrongManagedBy.withdraw(500));
	}

}
