package Arrays;
import java.util.*;
public class LargestNumber {
    public static int largestNumber(int ar[]){
        int lar = Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++){
            if(lar<ar[i]){
                lar = ar[i];
            }
        }
        return lar;
    }
    public static void main(String[] args) {
        int ar[] = {2,4,5,6,7,8,12,6};
        int lar = largestNumber(ar);
        System.out.println(lar);
    }
}
