package Question_3.leap_year;

import java.util.Scanner;

public class GetLeapYear {

    // main method
    public static void main(String[] args) {

        // call the method in main method
        findLeapYear();
    }

    // the method to find leap year
    static void findLeapYear() {

        // variable to store year
        int year;
        // scanner object
        Scanner input = new Scanner(System.in);

        // input the year
        System.out.println("Enter year :");
        year = input.nextInt();

        // determine if it is leap
        if ((year % 4) == 0) {
            // it is a leap year
            System.out.println(year + " is a leap year");
        } else {
            // it is not a leap year
            System.out.println(year + " is not a leap year");
        }

    }

    
}
