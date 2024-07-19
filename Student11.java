public class Student11 {
    int sid;
    String sname;
    double sfee;
    Student11(){
        System.out.println("Default Constructor");
    }
    Student11(int id){
        sid = id;
        System.out.println("Parameterized Constructor");
    }
    Student11(String name){
        sname = name;
        System.out.println("Parameterized Constructor");
    }
    Student11(double fee){
        sfee = fee;
        System.out.println("Parameterized Constructor");
    }
    Student11(int id, String name, double fee){
        sid = id;
        sname = name;
        sfee = fee;
//        System.out.println("Parameterized Constructor");
    }
    public static void main(String[] args) {
        Student11 s = new Student11();
        System.out.println("s: "+ s.sid+"s.sname: "+s.sname+"s.sfee: "+s.sfee);
        Student11 s1 = new Student11(101);
        System.out.println("s1: "+ s1.sid+" s1.sname: "+s1.sname+" s1.sfee: "+s1.sfee);
        Student11 s2 = new Student11("Raj");
        System.out.println("s2: "+ s2.sid+" s2.sname: "+s2.sname+" s2.sfee: "+s2.sfee);
        Student11 s3 = new Student11(1000.0);
        System.out.println("s3: "+ s3.sid+" s3.sname: "+s3.sname+" s3.sfee: "+s3.sfee);
        Student11 s4 = new Student11(102,"varun",4500);
        System.out.println("s4: "+ s4.sid+" s4.sname: "+s4.sname+" s4.sfee: "+s4.sfee);
        Student11 s5 = new Student11(103,"kshitiz",5000);
        System.out.println("s5: "+ s5.sid+" s5.sname: "+s5.sname+" s5.sfee: "+s5.sfee);
    }
}
