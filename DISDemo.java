import java.io.*;
import java.sql.SQLOutput;

public class DISDemo {
    public static void main(String[] args) throws IOException {
//        System.out.println("Hello, World!");
//        DataInputStream dis = new DataInputStream(System.in);
//        System.out.println("enter any string");
//        String s = dis.readLine();
//        System.out.println("You entered: " + s);
//        System.out.println("enter some integer");
//        int s1 = dis.readInt();
//        int s1 = Integer.parseInt(dis.readInt(s1));
//        System.out.println("You entered: " + s1);
        FileOutputStream fos = new FileOutputStream("kit.text");
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeBoolean(true);
        dos.writeChar('a');
        dos.writeInt(120);
        dos.writeChars("hello");
        FileInputStream fis = new FileInputStream("kit.text");
        DataInputStream dis = new DataInputStream(fis);
        System.out.println(dis.readBoolean());
        System.out.println(dis.readChar());
        System.out.println(dis.readInt());
        System.out.println(dis.readLine());

    }
}