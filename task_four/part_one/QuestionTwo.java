package part_one;

import java.util.Scanner; //importing Scanner

public class QuestionTwo {
   
    // static Scanner object
   static Scanner input = new Scanner(System.in);

   //check if a number is prime
   static void isPrime() {

       System.out.println("Enter an integer number to check if it is prime or not: ");
       var numberToTest = input.nextInt();

       boolean indicator = false;
       for (int i = 2; i <= numberToTest / 2; ++i) {
           // condition for nonprime number
           if (numberToTest % i == 0) {
               indicator = true;
               break;
           }
       }

       if (!indicator)
           System.out.println(numberToTest + " is a prime number.");
       else
           System.out.println(numberToTest + " is not a prime number.");

   }

   // the main method will show prime numbers between 1 to 500.
   public static void main(String[] args) {

       int i = 0;
       int myNumber = 0;
       // Empty String
       String primeNumbers = "";

       for (i = 1; i <= 500; i++) {
           int counter = 0;
           for (myNumber = i; myNumber >= 1; myNumber--) {
               if (i % myNumber == 0) {
                   counter = counter + 1;
               }
           }
           if (counter == 2) {
               // added the Prime number to the String
               primeNumbers = primeNumbers + i + " ";
           }
       }
       System.out.println("\n\nThe prime numbers from 1 to 500 are :");
       System.out.println(primeNumbers);

       // calling the isPrime method
       isPrime();
   }
}