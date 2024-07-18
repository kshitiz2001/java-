public class Demo121 {
    static Demo121 d1 = new Demo121();

    public static void main(String[] args) {
        Demo121 d = new Demo121();
        System.out.println(d.hashCode());
        System.out.println(d1.hashCode());
    }
}
