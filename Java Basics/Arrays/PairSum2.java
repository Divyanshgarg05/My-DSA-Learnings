//Find if any pair in a Sorted and rotated ArrayList has a target sum



package Arrays;

public class PairSum2 {
    public static void main(String[] args) {
        int arr[] = {11,15,6,8,9,10};
        int target = 16;
        System.out.println(pairSum2(arr,target));
    }
    public static boolean pairSum2(int[] arr , int target){
        int bp = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > arr[i+1]){
                bp = i;
                break;
            }
        }
        int n = arr.length;
        int lp = bp+1;
        int rp = bp;
        while(lp!=rp){
            if(arr[lp]+arr[rp] == target){
                return true;
            }
            else if(arr[lp]+arr[rp] <= target){
                lp =(lp+1)%n;
            }else{
                rp = (n+rp-1)%n;
            }
        }
        return false;
    }
}
