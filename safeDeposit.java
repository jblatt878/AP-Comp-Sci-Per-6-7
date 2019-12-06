import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class safeDeposit {

public static void main(String[] args) {
//while loop
    String yes;
   System.out.println("Welcome to the Safety Deposit Box)");
   System.out.println("Press 1 to begin");

   Scanner start = new Scanner(System.in);

   int resetValue = start.nextInt();

List<String> answers = new ArrayList<String>();

Scanner items = new Scanner(System.in);

while (resetValue == 1){
 
 System.out.println("How many items would you like to add?");
 
 int gays = items.nextInt();

for(int i=0; i < gays; i++){
  String temp = new String();
  Scanner thinginput = new Scanner(System.in);
  System.out.println("Name the item:");
  temp = thinginput.next();
  
  
  answers.add(temp);
  
  System.out.println("Your Deposit Box: ");
  System.out.println(answers);
}

if (resetValue == 1){
            System.out.println("Type 0 to do another transaction or 2 to stop");
            resetValue =  start.nextInt();
        }//reset values for whileloop to make a start and stop solution
        if (resetValue == 0){
            resetValue++;
        }
        if (resetValue == 2){
        System.out.println("Have a great day!");
            break;
        }
        }
}

}