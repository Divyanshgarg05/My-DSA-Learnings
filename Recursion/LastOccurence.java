package Recursion;

public class LastOccurence {
    public static int lastOccurence(int[] arr, int index, int target){
        if(index < 0){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return lastOccurence(arr, index - 1, target);
    }
    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 5, 2, 1};
        int target = 2;
        int result = lastOccurence(arr, arr.length - 1, target);
        if(result != -1){
            System.out.println("Last occurrence of " + target + " is at index: " + result);
        } else {
            System.out.println(target + " not found in the array.");
        }
    }
}
