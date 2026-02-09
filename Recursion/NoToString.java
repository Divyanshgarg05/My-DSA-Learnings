package Recursion;

public class NoToString {

    public static void noToString(String[] arr, int n) {
        if (n == 0) {
            return;
        }

        noToString(arr, n / 10);           // pehle recursion
        System.out.print(arr[n % 10] + " "); // baad me print
    }

    public static void main(String[] args) {
        String[] arr = {
            "Zero", "One", "Two", "Three", "Four",
            "Five", "Six", "Seven", "Eight", "Nine"
        };

        int n = 1947;
        noToString(arr, n);
    }
}
