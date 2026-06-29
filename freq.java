import java.util.*;
public class freq{
    public static void main(String[] args) {
        int[] arr = {3,2,3,2,5,6,8,5,2,1,3,5,6,8,7,9,5,3,5,3};
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i : arr){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        System.out.println(mp);

        freqArr(arr);
    }

    public static void freqArr(int[] arr){
        int freq[] = new int[10];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        for(int i=0;i<freq.length;i++){
            System.out.print(freq[i] + " ");
        }
    }
}