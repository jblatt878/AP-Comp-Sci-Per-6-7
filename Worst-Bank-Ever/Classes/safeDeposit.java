import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class safeDeposit {

public static void main(String[] args)
{
        List<String> answers = new ArrayList<String>();
        List<String> answers2 = new ArrayList<String>();


  System.out.println("Welcome to the Safety Deposit Box");
  System.out.println("Press 1 to begin");

  Scanner start = new Scanner(System.in);

  int resetValue = start.nextInt();

   
Scanner whatbox = new Scanner(System.in);
System.out.println("What's box number?");
String bosdse = whatbox.next();
Scanner whatboxpas = new Scanner(System.in);
System.out.println("What's box password?");
String bosdse1 = whatboxpas.next();

if (bosdse1.equals(vito1.getMyPassword()) ){
while (resetValue == 1){


String box = new String();
System.out.println("Press D to make a Deposit, Press W to make a Withdrawl?");
Scanner asdf = new Scanner(System.in);
box = asdf.next();

if(box.equalsIgnoreCase("d")){
Scanner items = new Scanner(System.in);
System.out.println("How many items do you want to deposit");
int amount = items.nextInt();

for(int i=0; i < amount; i++){
 String temp = new String();
 Scanner thinginput = new Scanner(System.in);
 System.out.println("Name the item:");
 temp = thinginput.next();
 
 
 answers.add(temp);
 
 System.out.println("Your Deposit Box: ");
 System.out.println(answers);
}
}
else if(box.equalsIgnoreCase("w")) {
String maybe = new String();
Scanner p = new Scanner(System.in);
System.out.println("Name the item, you would like to withdrawl:");
System.out.println(answers);
maybe = p.next();

answers.remove(answers.indexOf(maybe));
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
    else if (bosdse1.equals(vito1.getMyPassword()) ){
        while (resetValue == 1){


            String box = new String();
             System.out.println("Press D to make a Deposit, Press W to make a Withdrawl?");
             Scanner asdf = new Scanner(System.in);
             box = asdf.next();
             
        if(box.equalsIgnoreCase("d")){
            Scanner items = new Scanner(System.in);
            System.out.println("How many items do you want to deposit");
             int amount = items.nextInt();
       
            for(int i=0; i < amount; i++){
              String temp = new String();
              Scanner thinginput = new Scanner(System.in);
              System.out.println("Name the item:");
              temp = thinginput.next();
             
             
              answers2.add(temp);
             
              System.out.println("Your Deposit Box: ");
              System.out.println(answers2);
            }
        }
        else if(box.equalsIgnoreCase("w")) {
            String maybe = new String();
            Scanner p = new Scanner(System.in);
            System.out.println("Name the item, you would like to withdrawl:");
            System.out.println(answers2);
            maybe = p.next();
           
            answers.remove(answers.indexOf(maybe));
            System.out.println(answers2);
        }
        else{
            System.out.println("Execute and try again");
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
    else
    {
      System.out.println("Wrong password.");
    }
}
static Customer vito1 = Main.vito1;
}