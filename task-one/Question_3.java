package task_one;

import java.util.Scanner; //Sannner import

public class Question_3 {

    //This is a list of my tests in form of methods
    
    //test div 0
    static void checkBy0(int numToCheck) {
        System.out.println(numToCheck + " can't be divisible by 0.");
    }

    //test div 1
    static void checkBy1(int numToCheck) {
        System.out.println(numToCheck + " is divisible by 1.");
    }

    //test div 2
    static void checkBy2(int numToCheck) {
        if (numToCheck % 2 == 0) {
            System.out.println(numToCheck + " is divisible by 2.");
        } else {
            System.out.println(numToCheck + " is not divisible by 2.");
        }
    }

    //test div 3
    static void checkBy3(int numToCheck) {
        if ((numToCheck % 3) == 0) {
            System.out.println(numToCheck + " is divisible by 3");
        } else {
            System.out.println(numToCheck + " is not divisible by 3");
        }
    }

    //test div 4
    static void checkBy4(int numToCheck) {
        if ((numToCheck % 4) == 0) {
            System.out.println(numToCheck + " is divisible by 4");
        } else {
            System.out.println(numToCheck + " is not divisible by 4");
        }
    }

    //test div 5
    static void checkBy5(int numToCheck) {
    if ((numToCheck % 5) == 0) {
            System.out.println(numToCheck + " is divisible by 5");
        } else {
            System.out.println(numToCheck + " is not divisible by 5");
        }
    }

    //test div 6
    static void checkBy6(int numToCheck) {
        if ((numToCheck % 6) == 0) {
            System.out.println(numToCheck + " is divisible by 6");
        } else {
            System.out.println(numToCheck + " is not divisible by 6");
        }
    }

    //test div 7
    static void checkBy7(int numToCheck) {
        if ((numToCheck % 7) == 0) {
            System.out.println(numToCheck + " is divisible by 7");
        } else {
            System.out.println(numToCheck + " is not divisible by 7");
        }
    }

    //test div 8
    static void checkBy8(int numToCheck) {
        if ((numToCheck % 8) == 0) {
            System.out.println(numToCheck + " is divisible by 8");
        } else {
            System.out.println(numToCheck + " is not divisible by 8");
        }
    }

    //test div 9
    static void checkBy9(int numToCheck) {
        if ((numToCheck % 9) == 0) {
            System.out.println(numToCheck + " is divisible by 9");
        } else {
            System.out.println(numToCheck + " is not divisible by 9");
        }
    }


    //the main method
    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        //getting input from the console
        System.out.println("This program checks if numbers are divisibile by zero to 9. Enter any number :");
        int num;
        num = input.nextInt();

        //using methods in main activity
        checkBy0(num);
        checkBy1(num);
        checkBy2(num);
        checkBy3(num);
        checkBy4(num);
        checkBy5(num);
        checkBy6(num);
        checkBy7(num);
        checkBy8(num);
        checkBy9(num);
    }

}
