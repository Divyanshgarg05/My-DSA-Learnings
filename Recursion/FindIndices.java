package Recursion;

public class FindIndices {

    public static void indices(int[] arr,int n,int key){
        if(n == arr.length){
            return;
        }
        if(key == arr[n]){
            System.out.print(n+" ");
        }
        indices(arr, n+1, key);
    }
    public static void main(String[] args) {
        int[] arr = {3,2,4,5,6,2,7,2,2};
        int key = 2;
        indices(arr, 0, key);
    }
}
