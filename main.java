import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.printf("Enter %d integers:\n", size);
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        int maxDiff = findMaxDifference(arr);
        System.out.printf("The maximum difference between any two elements is %d", maxDiff);
        scanner.close();
    }
    private static int findMaxDifference(int[] arr) {
        int maxDiff = 0;
        int minElement = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int currentDiff = arr[i] - minElement;
            maxDiff = Math.max(maxDiff, currentDiff);
            minElement = Math.min(minElement, arr[i]);
        }
        return maxDiff;
    }
}