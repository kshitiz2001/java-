import java.util.Scanner;
public class Account11 {
    String accountHolderName;
    double balance;
    Account11(){
        balance = 0.0;
    }
    Account11(double balance){
        this.balance = balance;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the account type: ");
        String accType = scanner.nextLine();
        if(accType.equalsIgnoreCase("ZeroBalance")){
            System.out.println("Enter the account holder name: ");
            String accountHolderName = scanner.next();
            Account11 account = new Account11();
            account.accountHolderName = accountHolderName;
            System.out.println("Account Details: "+account.accountHolderName+"...."+account.balance);
        }else if(accType.equalsIgnoreCase("Min Balance")){
            System.out.println("Enter the account holder name: ");
            String accountHolderName = scanner.next();
            Account11 account = new Account11(5000.00);
            account.accountHolderName = accountHolderName;
            System.out.println("Account Details: "+account.accountHolderName+"...."+account.balance);
        }
    }
}

//namekshitiz