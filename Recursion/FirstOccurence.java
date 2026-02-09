package Recursion;

public class FirstOccurence {
    public static int firstOccurence(int[] arr, int index, int target){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return firstOccurence(arr, index + 1, target);
    }
    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 5, 2, 1};
        int target = 2;
        int result = firstOccurence(arr, 0, target);
        if(result != -1){
            System.out.println("First occurrence of " + target + " is at index: " + result);
        } else {
            System.out.println(target + " not found in the array.");
        }
    }
}
