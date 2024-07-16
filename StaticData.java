public class StaticData {
    static int a = m1();
    static {
        System.out.println("static block1");
    }
    public static void main(String[] args) {
        System.out.println("main method");
    }
    static int m1(){
        System.out.println("m1 method");
        System.out.println("a: "+a);
        return 111;
    }
    static {
        System.out.println("static block2");
    }
}
