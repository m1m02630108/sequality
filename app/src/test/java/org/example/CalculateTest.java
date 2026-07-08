package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
    @Test
    public void testSum() {
        Calculate calculate = new Calculate();
        int expected = 5;
        assertEquals(expected, calculate.sum(2, 3));
    }

    @Test
    public void testIndividualFee() {
        Calculate calc = new Calculate();
        assertEquals(1000, calc.getIndividualFee(10));
        assertEquals(2000, calc.getIndividualFee(25));
    }

    @Test
    public void testGetTotalFee() {
        Calculate calc = new Calculate();
        assertEquals(1000, calc.getTotalFee(10, 1));
        assertEquals(2000, calc.getTotalFee(25, 1));
        assertEquals(13500, calc.getTotalFee(10, 15));
        assertEquals(27000, calc.getTotalFee(25, 15));
    }
}
