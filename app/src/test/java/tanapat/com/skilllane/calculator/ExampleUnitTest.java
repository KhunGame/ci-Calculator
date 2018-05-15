package tanapat.com.skilllane.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void บวกเลขได้อย่างถูกต้อง_ตัวอย่างเช่นหนึ่งบวกสองได้สาม() {
        Calculator calculator = new Calculator();
        int actualResult = calculator.plus(1, 2);
        assertEquals(3, actualResult);
    }

    @Test
    public void บวกเลขได้อย่างถูกต้อง_ตัวอย่างเช่นหนึ่งบวกสามได้สี่() {
        Calculator calculator = new Calculator();
        int actualResult = calculator.plus(1, 3);
        assertEquals(4, actualResult);
    }

    @Test
    public void บวกเลขได้อย่างถูกต้อง_ตัวอย่างเช่นศูนย์บวกลบสองได้ลบสอง() {
        Calculator calculator = new Calculator();
        int actualResult = calculator.plus(0, -2);
        assertEquals(-2, actualResult);
    }
}
