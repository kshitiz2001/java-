import java.util.Scanner;

public class StoB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text to convert to byte code and binary:");
        String inputText = scanner.nextLine();
        byte[] byteCode = inputText.getBytes();
        System.out.println("Byte code representation:");
        for (byte b : byteCode) {
            System.out.print(b + " ");
        }
        System.out.println("\nBinary representation:");
        for (char c : inputText.toCharArray()) {
            System.out.print(Integer.toBinaryString(c) + " ");
        }
    }
}