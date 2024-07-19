public class Bank {
     Bank(){
        System.out.println("Static block is invoked");
    }
    public static void main(String args[]){
        System.out.println("Hello main");
        Bank b1 = new Bank();
        Bank b2 = new Bank();

    }


}
