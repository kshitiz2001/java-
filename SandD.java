import java.io.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;


class Student implements java.io.Serializable{
    int sid=101;
    String sname="Raj";
    int sage = 21;
    double sfee = 2500;
    String scourse = "java";
    String insName = "GLA";
}
public class SandD {
    public static void main(String[] ram) throws FileNotFoundException,IOException, ClassNotFoundException{
        FileOutputStream fos = new FileOutputStream("file");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Student s = new Student();
        oos.writeObject(s);
	FileInputStream fis = new FileInputStream("file");
	ObjectInputStream ois = new ObjectInputStream(fis);
	Object o = ois.readObject();
	Student s1 = (Student)o;
	System.out.println(s1.sid);
	System.out.println(s1.sname);
	System.out.println(s1.sage);
	System.out.println(s1.sfee);
	System.out.println(s1.scourse);
	System.out.println(s1.insName);


        }
    }
