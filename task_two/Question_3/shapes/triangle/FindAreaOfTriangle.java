package Question_3.shapes.triangle;

// importing scanner
import java.util.Scanner;

public class FindAreaOfTriangle {

    static double base, height, area;

    // main method
    public static void main(String[] args) {

        // calling the non-static in a static main method
        FindAreaOfTriangle classObject = new FindAreaOfTriangle();
        classObject.getBaseAndHeight();
        classObject.findArea();
        classObject.outputResults();
    }

    // input the base and the height
    void getBaseAndHeight() {

        // scanner object
        Scanner input = new Scanner(System.in);

        // get inputs
        System.out.println("Enter the base measurement of the triangle: ");
        base = input.nextDouble(); // store the input in base
        System.out.println("Enter the height measurement of the triangle: ");
        height = input.nextDouble(); // store the input in height
    }

    // find the area of the rectangle
    void findArea() {
        area = 0.5 * base * height;
    }

    // method to output area
    void outputResults() {
        System.out.println("The area is: " + area);
    }

}
