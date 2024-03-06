public class maxSubArray {
    public static void main(String[] args){
        int[] arr = {1,2,-10,4,5};
        int ans = Integer.MIN_VALUE;
        int sum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(sum<0)
                sum = 0;
            
            sum = sum+ arr[i];
            ans = Math.max(ans,sum);
        }
        System.out.println(ans);
    }
    
}
