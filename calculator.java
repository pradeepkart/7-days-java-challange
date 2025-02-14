import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();



        if (operator == '+') {
            System.out.println(num1+num2);
        } else if (operator == '-') {
            System.out.println(num1-num2);
        } else if (operator == '*') {
            System.out.println(num1*num2);
        } else if (operator == '/') {
            if (num2 != 0) {
                System.out.println(num1/num2);
            } else {
                System.out.println("Error: Division by zero");
                return;
            }
        } else {
            System.out.println("Invalid operator");
            return;
        }


        scanner.close();
    }
}
