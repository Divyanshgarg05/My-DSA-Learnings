package Sorting;

public class InsertionSort {
    public static void insertionSort(int ar[]){
        for(int i=1;i<ar.length;i++){
            int curr =ar[i];
            int prev = i-1;
            while(prev>=0 && ar[prev] > curr){
                ar[prev+1] = ar[prev];
                prev--;
            }
            ar[prev+1] = curr;
        }
    }
    public static void main(String[] args) {
        int ar[] = {3,2,6,4,9};
        insertionSort(ar);
        for(int i=0;i<ar.length;i++){
            System.out.println(ar[i]);
        }
    }
}
