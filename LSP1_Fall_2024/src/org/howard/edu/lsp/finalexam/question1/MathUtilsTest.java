package org.howard.edu.lsp.finalexam.question1;

import static org.junit.Assert.*;
import org.junit.Test;

public class MathUtilsTest {
    @Test
    public void testFactorial() {
        MathUtils math = new MathUtils();
        assertEquals(120, math.factorial(5)); // 5! = 120
        assertEquals(1, math.factorial(0));   // 0! = 1
    }

    @Test
    public void testIsPrime() {
        MathUtils math = new MathUtils();
        assertTrue(math.isPrime(7)); // 7 is prime
        assertFalse(math.isPrime(10)); // 10 is not prime
    }

    @Test
    public void testGCD() {
        MathUtils math = new MathUtils();
        assertEquals(6, math.gcd(18, 24)); // GCD of 18 and 24 is 6
        assertEquals(10, math.gcd(0, 10)); // GCD of 0 and 10 is 10
    }
}
