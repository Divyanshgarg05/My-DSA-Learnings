package Methods;
import java.util.*;

public class PrimeInRange {
    public static boolean isPrime(int n){
        for(int i=2 ; i<Math.sqrt(n);i++){
        if(n%i== 0){
            return false;
        }
    }
    return true;
    }
    public static void PrimeInRange(int n){
        for(int i=2;i<n;i++){
            if(isPrime(i)){
                   System.out.println(i); 
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any value");
        int n = sc.nextInt();
        PrimeInRange(n);
    }
}
