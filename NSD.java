public class NSD {
    int a = m1();{
        System.out.println(a);
        System.out.println("nsb2");
    }
    public static void main(String[] s) {
        System.out.println("main method");
        new NSD();
    }
    NSD(){
        System.out.println("NSD constructor");
    }
    int m1(){
        System.out.println("m1 method");
        System.out.println("a:" + a );
        return 111;
     }
     {
        System.out.println("nsb1");
    }
}
