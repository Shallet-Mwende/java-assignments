package task_one;

//These imports were automatically generaed by the IDE
import java.util.List;              
import java.util.stream.Collectors; 
import java.util.stream.IntStream;  

public class Question_4 {

    public static void main(String[] args) {
        
    
        //Creating my list
        List<Integer> myList; //this list will store numbers from 71 to 150
        myList = IntStream.range(71, 150).boxed().collect(Collectors.toList());
        
        myList.add(150); //adding 150 to the list to ensure we also check 150 if it's a multiple

        System.out.println("\n2 has the following multiples:");
        //Getting the multiples of 2:
        for (int i = 0; i <= myList.size(); i++) {
            if (myList.get(i) % 2 == 0) {
                System.out.println(myList.get(i));
            }
            
            if (i == 150-71) {
                break; //braek loop to prevent an exception
            } 
        }
        System.out.println("\n");

        System.out.println("3 has the following multiples:");
        //these are the multiples of 3
        for (int i = 0; i <= myList.size(); i++) {
            if (myList.get(i) % 3 == 0) {
                System.out.println(myList.get(i));
            }
            
            if (i == 150-71) {
                break; //braek loop to prevent an exception
            } 
        }
        System.out.println("\n"); //my empty line
        
        //Multiples of 7:
        System.out.println("7  has the following multiples:");
        //these are the multiples of 7
        for (int i = 0; i <= myList.size(); i++) {
            if (myList.get(i) % 7 == 0) {
                System.out.println(myList.get(i));
            }
            
            if (i == 150-71) {
                break; //braek loop to prevent an exception
            } 
        }
    }
}
