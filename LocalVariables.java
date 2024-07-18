public class LocalVariables {
    static int a ;
    int b;
    public static void main(String[] args) {
        System.out.println("a: " + a);
        LocalVariables lv1 = new LocalVariables();
        System.out.println("b: " + lv1.b);

    }
}
