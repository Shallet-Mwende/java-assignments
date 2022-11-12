package task_one;

import java.util.Scanner; //importing Scanner

public class Question_5 {
    public static void main(String[] args) {

        Scanner data = new Scanner(System.in); // Scanner object

        // request the first number from the user
        System.out.println("Enter the first number");
        Double num1;
        num1 = data.nextDouble();

        // request the the mathSign from the user
        System.out.println("Type one of these 4 signs (+, -, *, or /) as your operator: ");
        char mathSign;
        mathSign = data.next().charAt(0);

        // request the second number from the user
        System.out.println("Enter second number");
        Double num2;
        num2 = data.nextDouble();

        doSwitch(num1, num2, mathSign);
    }

    static void doSwitch(double num1, double num2, char mathSign) {
      
        // variable for my result
        Double result;


        switch (mathSign) {

            // perform subtraction
            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;

            // perform addition
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;

            // perform multiplication
            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;

            // perform division
            case '/':
                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
                break;

            default:
                System.out.println("Please try again.");
                break;
        }
    }
}