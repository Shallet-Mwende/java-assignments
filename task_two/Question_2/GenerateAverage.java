package Question_2;

import java.util.Scanner;

public class GenerateAverage {

    public static void main(String[] args) {

        // scanner object
        Scanner input = new Scanner(System.in);

        double marksForJava, marksForNetworking, marksForMath, average; // my variables

        // input marks
        System.out.println("Enter marks for Java Programming: ");
        marksForJava = input.nextInt(); // get marksForJava marks
        System.out.println("Enter marks for marksForNetworking: ");
        marksForNetworking = input.nextInt(); // get marksForNetworking marks
        System.out.println("Enter marks for Maths: ");
        marksForMath = input.nextInt(); // get maths marks

        // output your data
        System.out.println("\nMarks for Java Programming is: " + marksForJava);
        System.out.println("Marks for marksForNetworking: " + marksForNetworking);
        System.out.println("Marks for Maths: " + marksForMath);

        // Getting the average
        average = (marksForJava + marksForNetworking + marksForMath) / 3;

        // output the average
        System.out.println("\nThe average is: " + average);
    }

}
