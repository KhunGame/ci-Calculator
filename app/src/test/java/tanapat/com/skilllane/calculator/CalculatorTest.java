package tanapat.com.skilllane.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CalculatorTest {
    private int first;
    private int second;
    private int expectedResult;

    public CalculatorTest(int first, int second, int expectedResult) {
        this.first = first;
        this.second = second;
        this.expectedResult = expectedResult;
    }

    @Parameters(name = "เทส {index}: เอา {0} บวก {1} ได้ {2}")
    public static List<Object[]> init() {
        return Arrays.asList(new Object[][]{
                {1, 1, 2},
                {2, 2, 4},
                {2, 3, 5},
                {-2, -3, -5},
        });
    }

    @Test
//    @Ignore
    public void บวกเลขได้อย่างถูกต้อง() {
        Calculator calculator = new Calculator();
        int actualResult = calculator.plus(first, second);
        assertEquals(expectedResult, actualResult);
    }

}
