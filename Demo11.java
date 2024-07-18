public class Demo11 {
    static int a = 111;
    int b = 222;
    void m1(){
        System.out.println("m1 method");
//        System.out.println("directly-c: " + c);
        System.out.println("directly-a: " + a);
        System.out.println("directly-b: " + b);
    }

    public static void main(String[] args) {
        int c = 222;
        System.out.println("main method");
        System.out.println("directly-c: " + c);
        System.out.println("directly-a: " + a);
//        System.out.println("directly-b: " + b);
    }
}
