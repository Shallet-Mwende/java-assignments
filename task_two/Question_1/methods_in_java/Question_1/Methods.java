package Question_1.methods_in_java.Question_1;

import java.util.Scanner; //Scanner import

public class Methods {
    
    // this static method will find the smallest num
    static double determineSmallNumber(double firstNumber, double secondNumber, double thirdNumber) {

        // get smallest number
        if (firstNumber < secondNumber) {
            // if true, is firstNumber > thirdNumber
            if (firstNumber < thirdNumber) {
                // if true, return firstNumber
                return firstNumber;
            } else {
                // else false, return thirdNumber
                return thirdNumber;
            }
        } else {
            // else false, is secondNumber < thirdNumber
            if (secondNumber < thirdNumber) {
                // if true, return secondNumber
                return secondNumber;
            } else {
                // else false, return thirdNumber
                return thirdNumber;
            }
        }
    }

    // this static method will find the largest num
    static double determineLargeNumber(double firstNumber, double secondNumber, double thirdNumber) {

        // get largest number
        if (firstNumber > secondNumber) {
            if (firstNumber > thirdNumber) {
                // if true, return firstNumber
                return firstNumber;
            } else {
                // else false, return thirdNumber
                return thirdNumber;
            }
        } else {
            if (secondNumber > thirdNumber) {
                // if true, return secondNumber
                return secondNumber;
            } else {
                // else false, return thirdNumber
                return thirdNumber;
            }
        }
    }

    //main method
    public static void main(String[] args) {

        // my variables
        double numberOne, numberTwo, numberThree, smallNumber, largeNumber;

        // scanner object
        Scanner input = new Scanner(System.in);

        
        System.out.println("\nEnter the first number: ");
        numberOne = input.nextInt(); // input first number
        System.out.println("Enter the second number: ");
        numberTwo = input.nextInt(); // input second number
        System.out.println("Enter the third number: ");
        numberThree = input.nextInt(); // input third number

        //get return values fom the methods
        smallNumber = determineSmallNumber(numberOne, numberTwo, numberThree);
        largeNumber = determineLargeNumber(numberOne, numberTwo, numberThree);

        // output 
        System.out.println("\nThe smallest number: " + smallNumber);
        System.out.println("The largest number: " + largeNumber);
        System.out.println(largeNumber + " is your largest and " + smallNumber + " is the smallest number.");
    }

}
