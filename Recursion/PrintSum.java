package Recursion;

public class PrintSum {
    public static int printSum(int n){
        if(n == 0){
            return 0;
        }
        System.out.println(n);
        return n + printSum(n - 1);
    }
    public static void main(String[] args) {
        int n = 5;
        int result = printSum(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + result);
    }
}
