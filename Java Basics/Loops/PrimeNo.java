import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.print("Enter any number to check prime number : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i== 0){
                count +=1;
            }
        }
        if(count > 2){
            System.out.println("Given number is not prime");
        }else{
            System.out.println("Given number is prime");
        }
    }
}
