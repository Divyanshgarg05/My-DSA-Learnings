package Arrays;

public class PrefixSumApproach {
    public static int prifixSum(int ar[]){
        int currSum =0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[ar.length];

        //Calculate prefix array
        prefix[0] = ar[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i] = prefix[i-1] + ar[i];
        }

        for(int i=0;i<ar.length ;i++){
            int start = i;
            for(int j=i;j<ar.length;j++){
                int end =j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                
                if(maxSum < currSum){
                    maxSum = currSum;
                }
               
            }
           
        }
        return maxSum;
    }
     public static void main(String[] args) {
        int ar[] = {2,4,-6,8,-2};
        int ans = prifixSum(ar);
        System.out.println("Maximum sum of subarray is : "+ans);
    }
}
