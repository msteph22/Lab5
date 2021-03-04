
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Created by: msteph22
 * 3/4/21
 * Lab 5 Q2Arrays
 * 
 */
public class Q2Arrays {
    public static void main(String[] args) {
        //Test Array
        int[] numbers = {10,20,30,40,50,60,70,80,90,100};
        
        
        //getTotal method
        double total = getTotal(numbers);
        System.out.println("Total: " + total);
        
        //getAverage method
        double average = getAverage(numbers);
        System.out.println("Average: " + average);
        
        //get Highest method
       double high = getHigh(numbers);
       System.out.println("High: " + high);
       
        //get Lowest method
        double low = getLow(numbers);
        System.out.println("Low: " + low);
        
    }
    //Method to add up the total of the array
    public static double getTotal(int[] numbers){
        double total = 0;
        for (int i = 0; i < numbers.length; i++){
            total = total + numbers[i];
        }
        return total;
    }
    //Method to generate the average of the array
    public static double getAverage(int[] numbers){
        double total = 0;
        double average = 0;
        for (int i = 0; i < numbers.length; i++){
            total = total + numbers[i];
        }
        average = total / numbers.length;
        return average;
    }
    //Method to generate the highest number in the array
    public static double getHigh(int[] numbers){
        double high = numbers[0];
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > high){
                high = numbers[i];
            }
        }
        return high;
    }
    //Method to generate the lowest number in the array
    public static double getLow(int[] numbers){
        double low = numbers[0];
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] < low){
                low = numbers[i];
            }
        }
        return low;
    }
}
