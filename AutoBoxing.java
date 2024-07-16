public class AutoBoxing {
    public static void main(String[] args) {
        int i = 100;
        Integer j = 100;
        System.out.println(i == j);
        int  a = new Integer(100);
        System.out.println(a == j);
    }
}
