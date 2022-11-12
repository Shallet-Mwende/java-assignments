package task_one;

//importing Scanner 
import java.util.Scanner;

public class Question_1 {

    // program starting point
    public static void main(String[] args) {

        // Creating scanner object
        Scanner input = new Scanner(System.in);
        
        //My variables that store string data 
        String userSirName, isOddorEven;
        //My variables that store integer data
        int userAge, userSirNameSize;
        
        

        //Getting inputs
        System.out.println("Please enter your sir name :");
        userSirName = input.nextLine();
        System.out.println("PLease enter your age :");
        userAge = input.nextInt();

        
        //first operation using the .length():
        //getting the number of letters in the sir name
        userSirNameSize = userSirName.length(); 
        //Second operation using modulus to determine
        //if userAge is even or odd
        if (userAge % 2 == 0) {
            isOddorEven = "even";
        } else {
            isOddorEven = "odd";
        }
        
        //Displaying output
        System.out.println("The number of characters in your sir name is : " + userSirNameSize);
        System.out.println("Your current userAge is an " + isOddorEven + " number.");
    }
}