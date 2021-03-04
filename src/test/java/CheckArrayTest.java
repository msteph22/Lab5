/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *Created by: msteph22
 * 3/4/21
 * Lab5 CheckArrayTest
 * 
 */
public class CheckArrayTest {
    
    public CheckArrayTest() {
    }

    @Test
    public void testDisplayNumbers() {
        System.out.println("displayNumbers");
        int[] numbers = {10,20,30,40,50,60,70,80,90,100};
        int n = 120;
        String expResult = "Your number was greater than all numbers in the array.";
        String result = CheckArray.displayNumbers(numbers, n);
        assertEquals(expResult, result);
    }
    
}
