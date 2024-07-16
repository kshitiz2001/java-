import java.util.Scanner;

public class new1 {
    static int a = 10;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int userInput = scanner.nextInt();
        String binaryString = Integer.toBinaryString(userInput);
        System.out.println("Binary representation: " + binaryString);
        System.out.println("Value of a: " + a);
    }

}