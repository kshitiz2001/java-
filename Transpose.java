public class Transpose {
    public static void main(String[] args) {
        int[][] arr = { {10,11,12,13},
                        { 20,21,22,23},
                        { 30,31,32,33},
                        { 40,41,42,43}};
        int [][] transpose = new int[4][4];
            for(int i = 0; i <arr.length;i++){
                for(int j = 0; j <arr[i].length;j++){
                    transpose[j][i] = arr[i][j];
                }
            }
            for(int i = 0;i<arr.length;i++){
                for(int j = 0;j<arr[i].length;j++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
            for(int i = 0;i<arr.length;i++){
                for(int j = 0;j<arr.length;j++){
                    System.out.println(transpose[i][j] + " ");
                }
            }
       
        }
}

