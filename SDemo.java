import java.io.FileInputStream;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SDemo {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("file.txt");
        Scanner sc = new Scanner(fis);
        String str = sc.nextLine();
        System.out.println(str);

    }
}
