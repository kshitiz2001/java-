public class AA {
    int a = 111;
    int b = 222;

    public static void main(String[] clone) {
        AA obj = new AA();
        System.out.println("obj: "+ obj.a + " " + obj.b);
        AA obj1 = obj;
        System.out.println("obj1: " + obj1.a + " " + obj1.b);
        System.out.println("obj: " + obj.hashCode());
        System.out.println("obj1: " + obj1.hashCode());
    }
}
