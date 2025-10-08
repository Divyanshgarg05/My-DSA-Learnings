package Arrays;

public class BinarySearch {
    public static int binarySearch(int ar[],int key){
        int l = 0;
        int h = ar.length - 1;
        int mid = 0;
        while(l<=h){
             mid = (l + h)/2;
             if(ar[mid] == key){
                return mid;
             }
             else if(ar[mid] < key){
                l = mid + 1;
             }else{
                h = mid - 1;
             }
        }
        return -1;
    }
    public static void main(String[] args) {
        int ar[] = {2,4,6,1,7,8,4,9,3};
        int key = 2;
        int idx = binarySearch(ar, key);
        System.out.println(idx);
    }
}
