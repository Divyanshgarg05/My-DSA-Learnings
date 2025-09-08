import java.util.Scanner;

public class SumOfN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();
        int i = 0;
        int sum = 0;
        while(i<=n){
            sum +=i;
            i++;
        }
        System.out.println(sum);
    }
}
