public class one{
    public static void main(String[] args){
        String s1 = " kshitiz,kumar,singh .net php oracle ...... ";
        String s2[] = s1.split(",");
        System.out.println(s2.length);
        for(String s3 : s2){
            System.out.println(s3);
        }
        String s3 = " kshitiz kumar singh php .net oracle .......";
        String s4[] = s3.split(" ",0);
        System.out.println(s4.length);
        for(String s5 : s4){
            System.out.println(s5);
        }
    }
}