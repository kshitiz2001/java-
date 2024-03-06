public class bubble{
public static void bubbleSort(int[] arr) {

  int n = arr.length;
  for (int i = 0; i < n-1; i++) {
    for (int j = 0; j < n-i-1; j++) {
      if (arr[j] > arr[j+1]) {
        int temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp;
      }
    }
  }
}
public static void printArray(int[] arr) {
  for (int element : arr) {
    System.out.print(element + " ");
  }
  System.out.println();
}
public static void main(String[] args) {
  int[] arr = {64, 34, 25, 12, 22, 11, 90};
  bubbleSort(arr);
  printArray(arr);
}
}

