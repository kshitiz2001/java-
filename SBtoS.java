import java.lang.*;
public class SBtoS {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("GLA University");
        String s1 = sb1.toString();
        System.out.println("sb1: " + sb1);
        System.out.println("s1: " + s1);
        String s2 = sb1.substring(7);
        String s3 = sb1.substring(7, 11);
        System.out.println("s2: " + s2);
        System.out.println("s3: " + s3);
    }
}
