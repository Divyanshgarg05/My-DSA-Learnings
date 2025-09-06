package Conditionalstatements;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter Operator");
        char operator = sc.next().charAt(0);

        switch(operator){
            case '+' : System.out.println(a + b);
                        break ;
            case '-' : System.out.println(a - b);
                        break;

            case '*' : System.out.println(a * b);
                        break;
            case '/' : System.out.println(a / b);
                        break;
            case '%' : System.out.println(a % b);
                        break;

            default : System.out.println("You have entered wrong input");
        }
    }
}
