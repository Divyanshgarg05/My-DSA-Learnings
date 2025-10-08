package Arrays;

public class MaxSubarraySum {
    public static int maxSubarraySum(int ar[]){
        int currSum =0;
        int maxSum = Integer.MIN_VALUE;


        for(int i=0;i<ar.length ;i++){
            
            for(int j=i;j<ar.length;j++){
                currSum = 0;
                for(int k=i;k<=j;k++){
                    currSum += ar[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
               
            }
           
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int ar[] = {2,4,-6,8,-2};
        int ans = maxSubarraySum(ar);
        System.out.println("Maximum sum of subarray is : "+ans);
    }
}
