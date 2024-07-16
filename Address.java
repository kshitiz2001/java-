public class Address {
    String cityName="Hyderabad";
    String stateName="Telangana";
}
class Student1 implements Cloneable{
    int sid=101;
    String sname="Ravi";
    int sage = 20;
    Address addr = new Address();
    public static void main(String[] r) throws CloneNotSupportedException{
        Student1 s1 = new Student1();
        System.out.println(s1.sid);
        System.out.println(s1.sname);
        System.out.println(s1.sage);
        System.out.println(s1.addr.cityName);
        System.out.println(s1.addr.stateName);
        System.out.println("---------------------------------");
        s1.sid = 111;
        s1.sname = "Rajesh";
        s1.sage = 22;
        s1.addr.cityName = "Bangalore";
        s1.addr.stateName = "Karnataka";
        System.out.println(s1.sid);
        System.out.println(s1.sname);
        System.out.println(s1.sage);
        System.out.println(s1.addr.cityName);
        System.out.println(s1.addr.stateName);
        System.out.println("---------------------------------");
        Student1 s2 = (Student1)s1.clone();
        System.out.println(s2.sid);
        System.out.println(s2.sname);
        System.out.println(s2.sage);
        System.out.println(s2.addr.cityName);
        System.out.println(s2.addr.stateName);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1.addr.hashCode());
        System.out.println(s2.addr.hashCode());
        s1.addr.cityName = "Chennai";
        System.out.println(s1.addr.cityName);
        System.out.println(s2.addr.cityName);


    }
}
