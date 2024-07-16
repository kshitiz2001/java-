public class BB implements Cloneable{
    int a = 111;
    int b = 222;
    public static void main(String[] s) throws CloneNotSupportedException{
        BB obj = new BB();
        System.out.println("obj: " +obj.a+ "... " +obj.b);
        obj.a = 888;
        obj.b = 999;
        System.out.println("obj: " +obj.a+ "... " +obj.b);
        BB obj1 = new BB();
        System.out.println("obj1: " +obj1.a+ "... " +obj1.b);
        Object o = obj.clone();
        BB obj2 = (BB)o;
        System.out.println("obj2: " +obj2.a+ "... " +obj2.b);
        System.out.println("obj: "+ obj.hashCode());
        System.out.println("obj1: "+ obj1.hashCode());
        System.out.println("obj2: "+ obj2.hashCode());





    }
}
