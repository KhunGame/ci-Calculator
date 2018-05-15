package tanapat.com.skilllane.calculator;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CalculatorMinusTest {

    @Test
    public void minus() {
        Calculator calculator = new Calculator();
        int actualResult = calculator.minus(1, 1);
        assertEquals(0, actualResult);
    }

}