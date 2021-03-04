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
 * Lab 5 Q2ArraysTest
 * 
 */
public class Q2ArraysTest {
    
    public Q2ArraysTest() {
    }

    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        int[] numbers = {10,20,30,40,50,60,70,80,90,100};
        double expResult = 550.0;
        double result = Q2Arrays.getTotal(numbers);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetAverage() {
        System.out.println("getAverage");
        int[] numbers = {10,20,30,40,50,60,70,80,90,100};
        double expResult = 55.0;
        double result = Q2Arrays.getAverage(numbers);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetHigh() {
        System.out.println("getHigh");
        int[] numbers = {10,20,30,40,50,60,70,80,90,100};
        double expResult = 100.0;
        double result = Q2Arrays.getHigh(numbers);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetLow() {
        System.out.println("getLow");
        int[] numbers = {10,20,30,40,50,60,70,80,90,100};
        double expResult = 10.0;
        double result = Q2Arrays.getLow(numbers);
        assertEquals(expResult, result);
    }
    
}
