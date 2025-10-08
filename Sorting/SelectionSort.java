package Sorting;

public class SelectionSort {
    public static void selectionSort(int []ar){
        for(int i=0;i<ar.length-1;i++){
            int min = i;
            for(int j=i+1;j<ar.length;j++){
                if(ar[min]>ar[j]){
                    min = j;
                }
            }
            int temp = ar[i];
            ar[i] = ar[min];
            ar[min] = temp; 
        }
    }
    public static void main(String[] args) {
        int ar[] = {8,3,5,9,1,2};
        selectionSort(ar);
        for(int i=0;i<ar.length;i++){
            System.out.println(ar[i]);
        }
    }
}
