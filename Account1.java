import java.util.Scanner;

public class Account1 {
    long accNo;
    String accHoldName;
    static Scanner scan =  new Scanner(System.in);
    Account1(long no, String name) {
        accNo = no;
        accHoldName = name;
    }
    public static void main(String[] args){
        System.out.println("Enter The Number Of Account");
        short records = scan.nextShort();
        Account1[] acc = new Account1[records];
        for(int i = 0; i < acc.length;i++){
            System.out.println("Enter The Account Number Of Account "+(i+1));
            long no = scan.nextLong();
            System.out.println("Enter Account Holder Name");
            String name = scan.next();
            Account1 obj = new Account1(no, name);
            acc[i] = obj;
        }
        for(int i = 0; i < acc.length;i++){
            Account1 obj = acc[i];
            System.out.println("Customer"+(i+1)+" Details");
            System.out.println("Account Number: "+obj.accNo);
            System.out.println("Account Holder Name: "+obj.accHoldName);
        }
    }
}
