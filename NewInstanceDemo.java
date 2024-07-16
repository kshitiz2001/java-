import java.lang.*;
public class NewInstanceDemo {
    public static void main(String[] s) throws ClassNotFoundException, InstantiationException, IllegalAccessException, ArrayIndexOutOfBoundsException{
        Class cls = Class.forName(s[0]);
        Object o = cls.newInstance();
        if(o instanceof A){
            System.out.println("A class object");
            A obj1 = (A)o;
            System.out.println(obj1.a);
        }
        else if(o instanceof B){
            System.out.println("B class object");
            B obj1 = (B)o;
            System.out.println(obj1.b);
        }
    }
}