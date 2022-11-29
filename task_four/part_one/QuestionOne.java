package part_one;

import java.util.Arrays; //importing Arrays
import java.util.Scanner; // importing Scanner

class QuestionOne {
   static Scanner input = new Scanner(System.in);

   private static void determine(int[] arr, int checkNumber) {

       // using iteration method
       boolean test = false;
       for (int num : arr) {

           // determine if the specified num is in the array
           if (num == checkNumber) {
               test = true;
               break;
           }

       }

       // Print the result
       if (test) {
           System.out.println(checkNumber + " is in the array.");
       } else {
           System.out.println(checkNumber + " is not in the array.");
       }

   }

   //main method
   public static void main(String[] args) {

       // creating an array with 15 values of zero.
       int[] mainArray = { 0, 0, 0,  0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

       // request the user to enter 15 numbers.
       System.out.println("\nEnter 15 numbers to the array: ");
       // input the 1st position
       mainArray[1] = input.nextInt(); 
       mainArray[2] = input.nextInt();
       mainArray[3] = input.nextInt();
       mainArray[4] = input.nextInt();
       mainArray[5] = input.nextInt();
       mainArray[6] = input.nextInt();
       mainArray[7] = input.nextInt();
       mainArray[8] = input.nextInt();
       mainArray[9] = input.nextInt();
       mainArray[10] = input.nextInt();
       mainArray[11] = input.nextInt();
       mainArray[12] = input.nextInt();
       mainArray[13] = input.nextInt();
       mainArray[14] = input.nextInt(); 

       // converting the array to a string list.
       var myList = Arrays.toString(mainArray);


       // display the array to the user as a list.
       System.out.println("The following are the values in the array: " + myList);
      

       System.out.println("Enter any number to determine if it is contained in the array: ");
       var numInput = input.nextInt();

       determine(mainArray, numInput);

   }
}