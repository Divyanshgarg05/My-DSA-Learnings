package Conditionalstatements;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Income : ");
        int inc = sc.nextInt();
        int tax;
        if(inc < 500000){
            tax = 0;
        }else if(inc >= 500000 && inc < 1000000){
            tax = (int)(inc * 0.2);
        }else{
            tax = (int)(inc * 0.3);
        }
        System.out.println("Your tax is : " + tax);
    }
}
