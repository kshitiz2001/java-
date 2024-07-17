class C{
    int b = 10;
}
public class NSDemo {
    int a = 111;
    {
        System.out.println("nsb: a "+a);
    }
    NSDemo(){
        System.out.println("constructor: a "+a);
    }
    void m1(){
        System.out.println("m1: a "+a);
    }
    public static void main(String[] s) {
        NSDemo nsd = new NSDemo();
//        System.out.println("by directly: "+a);
        nsd.m1();
        System.out.println("main: a "+nsd.a);
        System.out.println("main: a "+new NSDemo().a);
        C obj = new C();
        System.out.println("reference: "+ obj.b);
        System.out.println("anonymous: "+ obj.b);
    }
}
