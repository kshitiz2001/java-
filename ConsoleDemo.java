import java.io.Console;
import java.io.FileWriter;
import java.io.IOException;


class ConsoleDemo{
    public static void main(String[] args) throws IOException{
        Console con = System.console();
        System.out.println("enter the data");
        String s1 = con.readLine();
        System.out.println("data is: "+s1);
        System.out.println("enter the password");
        char c[] = con.readPassword();
        FileWriter fw = new FileWriter("file.txt");
        fw.write(c);
        fw.flush();
    }
}

//for checking purpose