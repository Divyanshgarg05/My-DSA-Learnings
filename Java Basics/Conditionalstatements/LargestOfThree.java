package Conditionalstatements;

import java.util.Scanner;

public class LargestOfThree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a > b){
            if(a > c){
                System.out.println("A is the largest number ");
            }else{
                System.out.println("C is the largest number");
            }
        }else if (b > c){
            System.out.println("B is the greatest number");
        }else{
            System.out.println("C is the greatest number");
        }
    }
}