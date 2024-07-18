import java.util.Scanner;
public class Account {
/*     long accNo;
     String accName;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Of Account");
        byte size = sc.nextByte();
        Account[] acc = new Account[size];
        for(int i =0;i<acc.length;i=i+1){
            System.out.println("Enter Customer " + (i+1)+" Detail");
            Account obj = new Account();
            System.out.println("Enter Account Number");
            obj.accNo = sc.nextLong();
           System.out.println("Enter Account Holder Name");
            obj.accName = sc.next();
            acc[i]=obj;
        }
        for(int i =0;i<acc.length;i=i+1){
            Account obj = acc[i];
            System.out.println("Customer Detail of Account "+(i+1)+" is :");
            System.out.println("Account Number: "+(i+1)+obj.accNo);
            System.out.println("Account Name: "+(i+1)+obj.accName);
        }

    }
*/

    //Hard Code
    long accNo;
    String accName;
    Account(long accNo, String accName){
        this.accNo = accNo;
        this.accName = accName;
    }

    public static void main(String[] args) {
        Account obj1 = new Account(1234567890,"Rahul");
        Account obj2 = new Account(1234567891,"Rohit");
        System.out.println("Account Number: "+obj1.accNo);
        System.out.println("Account Holder Name: "+obj1.accName);
        System.out.println("Account Number: "+obj2.accNo);
        System.out.println("Account Holder Name: "+obj2.accName);
    }
}
