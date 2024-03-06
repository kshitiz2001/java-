public class Subarray {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5};
        for(int i = 0; i < arr.length; i++ ){
            for(int j = 1 ; j < arr.length; j++){
                int sum = 0;
                for(int k = i; k <= j; k++){
                    System.out.print(arr[k]+" ");
                    sum+=arr[k];
                }
                System.out.print(" = "+sum);
                System.out.println();
            }
        }
    }
}