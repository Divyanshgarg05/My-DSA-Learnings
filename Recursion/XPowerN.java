package Recursion;

public class XPowerN {
    public static int xPowerN(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * xPowerN(x, n - 1);
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        int result = xPowerN(x, n);
        System.out.println(x + " raised to the power of " + n + " is: " + result);
    }
}
