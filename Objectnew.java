import java.util.Scanner;
public class Objectnew {
    int sid;
    String sname;
    Objectnew(int id, String name){
        sid = id;
        sname = name;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id");
        int a = sc.nextInt();
        System.out.println("Enter the name");
        String b = sc.next();
        Objectnew obj = new Objectnew(a,b);
        System.out.println(obj.sid+" "+obj.sname);


    }
}

