package tn.example.projetjenkins;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    public void testAddWithZero() {
        Calculator calc = new Calculator();
        assertEquals(2, calc.add(2, 0));
    }
}
