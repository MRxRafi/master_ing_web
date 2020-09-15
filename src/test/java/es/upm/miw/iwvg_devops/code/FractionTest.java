package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FractionTest {
    Fraction testFraction;

    @BeforeEach
    void before(){
        testFraction = new Fraction(4,3);
    }

    @Test
    void testAttributes(){
        assertEquals(4, testFraction.getNumerator());
        assertEquals(3, testFraction.getDenominator());

        testFraction.setNumerator(5);
        testFraction.setDenominator(4);

        assertEquals(5, testFraction.getNumerator());
        assertEquals(4, testFraction.getDenominator());
    }

    @Test
    void testConstructor(){
        Fraction fraction = new Fraction();
        assertEquals(1, fraction.getNumerator());
        assertEquals(1, fraction.getDenominator());
    }

    @Test
    void testOperations(){
        assertEquals(false, testFraction.isProper());

        Fraction operateWithFraction = new Fraction(5, 3);
        Fraction multiplyFraction = testFraction.multiply(operateWithFraction);
        Fraction divideFraction = testFraction.division(operateWithFraction);
        assertEquals(20, multiplyFraction.getNumerator());
        assertEquals(9, multiplyFraction.getDenominator());

        assertEquals(12, divideFraction.getNumerator());
        assertEquals(15, divideFraction.getDenominator());

        assertEquals(1.33333, testFraction.decimal(), 10e-5);
    }
}
