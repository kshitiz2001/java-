import java.util.Scanner;
public class StaticDemo1 {
    static String cinemaName;
    static int costOfTicket;
    static{
        System.out.println("enter cinema name");
        Scanner scanner = new Scanner(System.in);
        cinemaName = scanner.next();
    }

    public static void main(String[] args) throws Exception{
        System.out.println("main method");
        System.out.println("cinema name: "+cinemaName);
        System.out.println("cost of ticket: "+costOfTicket);
    }
    static {
        System.out.println("enter the cost of ticket");
        Scanner scanner = new Scanner(System.in);
        costOfTicket = scanner.nextInt();
    }

}
