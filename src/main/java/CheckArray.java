
import java.util.Scanner;


/**
 * Created by: msteph22
 * 3/2/21
 * Lab 5 CheckArray
 * 
 */
public class CheckArray {
    public static void main(String[] args) {
        //Initialize array
        int[] numbers = new int[]{10,20,30,40,50,60,70,80,90,100};
        
        //Input n from user
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter number to be evaluated: ");
        int n = keyboard.nextInt();
        
        //Send array/n to method
        String displayOutput = displayNumbers(numbers, n);
        
        System.out.println(displayOutput);
    }
    public static String displayNumbers(int[] numbers, int n){
        //Flag that shows if there is any greter than
        boolean flagGreater = true;
        
        String output = "These numbers are greater than yours: "; 
        
        //Display all numbers in array greater than n
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > n){
                if (flagGreater == true){ //Uses flag to put no comma on the first loop
                    output = output + numbers[i];
                }else{
                    output = output + ", " + numbers[i];
                }
                flagGreater = false; //Sets flag to false since the there is a number greater
            }
        }
        //If there was no number greater the flag stays true
        if (flagGreater == true){
            output = "Your number was greater than all numbers in the array.";
        }
        return output;
    }
}
