package Sorting;

public class CountingSort {
    public static void countingSort(int []ar){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++){
            largest = Math.max(largest,ar[i]);
        }

        int count[] = new int[largest+1];
        for(int i=0;i<ar.length;i++){
            count[ar[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                ar[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int ar[] = {3,2,6,4,9};
        countingSort(ar);
        for(int i=0;i<ar.length;i++){
            System.out.println(ar[i]);
        }
    }
}
