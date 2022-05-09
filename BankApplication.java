import java.util.Scanner;

class BankAccount{
    int balance;
    int previousTransaction;
    String customerName;
    String customerId;

    public BankAccount(String Name, String Id){
        customerName = Name;
        customerId = Id;
    }

    void deposit(int amount){
        if(amount != 0){
            balance = balance + amount;
            previousTransaction = amount;
        }
    }
    void withdraw(int amount){
        if(amount != 0){
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }
    void getPrevoiusTransactions(){
        if(previousTransaction > 0){
            System.out.println("deposited " + previousTransaction);
        }else if(previousTransaction < 0){
            System.out.println("withdrawn " +previousTransaction);
        }else{
            System.out.println("NO TRANSACTIONs ARE MADE");
        }
    }
    void showMenu(){
        char option = '\0';
        Scanner s = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("Welcome " + customerName);
        System.out.println("your ID is " + customerId);
        System.out.println("\n");
        System.out.println("A  check your account  balance.");
        System.out.println("B  deposit. ");
        System.out.println("C  withdraw. ");
        System.out.println("D  previous transactions.");
        System.out.println("E  Exit.");

        do{
            System.out.println("==================================================================");
            System.out.println("Enter your option ");
            option = s.next().charAt(0);
            System.out.println("\n");
            switch(option){

                case 'A':
                    System.out.println("============================================================");
                    System.out.println("\n");
                    System.out.println("Your account banlance is " + balance);
                    //System.out.println("\n");
                    System.out.println("=============================================================");
                    break;

                case 'B':
                    System.out.println("=============================================================");
                    System.out.println("***************DEPOSIT************");
                    System.out.println("Enter the amount to be deposited");
                    int amount = s.nextInt();
                    deposit(amount);
                    System.out.println("\n");
                    break;

                case 'C':
                    System.out.println("=============================================================");
                    System.out.println("***************WITHDRAW************");
                    System.out.println("Enter the amount to be withdrawn");
                    int amount2 = s.nextInt();
                    withdraw(amount2);
                    System.out.println("\n");
                    break;

                case 'D':
                    System.out.println("==============================================================");
                    System.out.println("***************PREVIOUS TRANSACTIION*****************");
                    getPrevoiusTransactions();
                    System.out.println("==============================================================");
                    System.out.println("\n");
                    break;

                case 'E':
                     System.out.println("***************EXITING*****************");
                     break;
                
                default :
                     System.out.println("INVALID INPUT ");
                     break;
            }
        }while(option != 'E');
          System.out.println("Thankyou for using our service ");
    }
}
public class BankApplication{
    public static void main(String args[]){
        BankAccount menu = new BankAccount("Achint kumar.", "0008721.");
        menu.showMenu();

    }

}