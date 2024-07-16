import java.io.*;
import java.util.StringTokenizer;

public class BRDemo {
    public static void main(String[] args) throws IOException {
/*
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("enter some string data");
        String s = br.readLine();
        System.out.println("you entered: " + s);
        System.out.println("enter some integer data");
        int i = Integer.parseInt(s);
        System.out.println("you entered: " + i);



        using file reader/writer
        */

//        FileWriter fw = new FileWriter("file.txt");
//        fw.write(new char[]{'a', 'b', 'c', 'd', 'e'});
//        fw.flush();
        FileReader fr = new FileReader("file.txt");
        BufferedReader br = new BufferedReader(fr);
        String s = br.readLine();
        System.out.println(s);
        int count=0;
        StringTokenizer st = new StringTokenizer(s, "  ");
        while(st.hasMoreTokens()) {
//            System.out.println(st.nextToken());
            count = count + Integer.parseInt(st.nextToken());

        }
        System.out.println(count);


    }
}