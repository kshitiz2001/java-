import java.lang.*;
class Address1 extends java.lang.Object implements Cloneable{
    String cityName = "hyderabad";
    String stateName = "Telangana";
    public Address1 clone() throws CloneNotSupportedException{
        return (Address1)super.clone();
    }

}
class Student2 extends java.lang.Object implements Cloneable {
    int sid = 101;
    String sname = "ram";
    Address1 add = new Address1();

    public Student2 clone() throws CloneNotSupportedException {
        Student2 s3 = (Student2) super.clone();
        s3.add = this.add.clone();
        return s3;
    }

    public static void main(String[] s) throws CloneNotSupportedException {
        Student2 s1 = new Student2();
        Student2 s2 = s1.clone();
        System.out.println(s1.sid);
        s2.add.cityName = "Mumbai";
        s2.add.stateName = "Maharashtra";
        System.out.println("s1: "+s1.add.cityName);
        System.out.println("s1: "+s1.add.stateName);
        System.out.println("s2: "+s2.add.stateName);
        System.out.println("s2: "+s2.add.stateName);
    }
}

