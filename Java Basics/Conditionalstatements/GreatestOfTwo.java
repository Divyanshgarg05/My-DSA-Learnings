package Conditionalstatements;
import java.util.*;
public class GreatestOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>b){
            System.out.println("Print a is greatest");
        }
        else{
            System.out.println("Print b is greatest");
        }

    }
}
