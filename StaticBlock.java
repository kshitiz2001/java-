public class StaticBlock {
    static{
        System.out.println("sb3");
    }

    public static void main(String[] args) {
        System.out.println("main method");
    }
    static{
        System.out.println("sb1");
    }
    static{
        System.out.println("sb2");
    }
}
