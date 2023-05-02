package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyCalculatorTest {

    @Test
    public void add() {
        assertEquals(4,MyCalculator.add(2,2));
        assertEquals(0,MyCalculator.add(-2,2));
    }
    @Test
    public void subtract() {
        assertEquals(0,MyCalculator.subtract(2,2));
        assertEquals(-4,MyCalculator.subtract(-2,2));
    }
    @Test
    public void multiply() {
        assertEquals(4,MyCalculator.multiply(2,2));
        assertEquals(-4,MyCalculator.multiply(-2,2));
    }

    @Test
    public void divide() {
        assertEquals(2,MyCalculator.divide(4,2));
        assertEquals(-2,MyCalculator.divide(-4,2));
        try{
            MyCalculator.divide(4,0);
            fail("Expected IllegalArgumentException to be thrown");
        }catch (IllegalArgumentException ie){
            assertEquals("cannot divide by Zero",ie.getMessage());
        }
    }
}