package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateJUnit {

    @Test
    public void evaluateExpression() {
        Calculate calculator=new Calculate();
        int sum=calculator.evaluate("1+2+3");
        assertEquals(6,sum);
    }
}