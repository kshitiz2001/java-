import java.util.Scanner;

class Demo{
    static int b = 222;
}
public class StaticDemo {
    static Scanner sc = new Scanner(System.in);
    static int a = sc.nextInt();
    public static void main(String[] args) {
        System.out.println("by directly : "+a);
        System.out.println("by className : "+StaticDemo.a);
        StaticDemo sd = new StaticDemo();
        System.out.println("by reference : "+sd.a);
        System.out.println("by object : "+new StaticDemo().a);
        System.out.println("---------------------------------");
        System.out.println("by directly : "+Demo.b);
        Demo d = new Demo();
        System.out.println("by reference : "+d.b);
        System.out.println("by object : "+new Demo().b);

    }
}
