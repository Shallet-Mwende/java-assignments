package task_one;

import java.util.Scanner; //importing Scanner

public class Question_2 {
    
    //main function
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //Scanner obj
            
        //my variables
        double unit1, unit2, unit3, unit4, unit5, average;
        
            System.out.println("This program helps you get average mark for five units.");
            System.out.println("Enter marks of the units you did on last semester");
            
            //get the user data
            System.out.println("\nUnit 1: ");
            unit1 = input.nextDouble();
            System.out.println("\nUnit 2: ");
            unit2 = input.nextDouble();
            System.out.println("\nUnit 3: ");
            unit3 = input.nextDouble();
            System.out.println("\nUnit 4: ");
            unit4 = input.nextDouble();
            System.out.println("\nUnit 5: ");
            unit5 = input.nextDouble();

            //getting average mark
            average = getAVG(unit1, unit2, unit3, unit4, unit5);

            //Outputting the average
            System.out.println("\nYou average mark is: " + average);
        }

        //this method returns the rounded average by taking 5 args
    static double getAVG(double num1, double num2, double num3, double num4, double num5) {
        //finding the average
        var averageNotRounded = (num1 + num2 + num3 + num4 + num5) / 5; 
        //rounding the average
        var roundedAVG = Math.round(averageNotRounded * 100.0) / 100.0; 
        //This is the return value 
        return roundedAVG; 
    }
}
