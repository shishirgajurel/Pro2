package dk.via.pro2.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    void add_test() {
        //create CUT/OUT - object under test - an instance of calculator class
        Calculator calculator = new Calculator();
        //execute test by calling the method to test
        double result = calculator.add(1, 2);
        //check the result of the test s
        assertEquals(3, result);
    }
}
