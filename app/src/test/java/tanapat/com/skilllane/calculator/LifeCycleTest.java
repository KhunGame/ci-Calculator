package tanapat.com.skilllane.calculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LifeCycleTest {

    @Before
    public void start() {
        System.out.println("start");
    }

    @After
    public void end() {
        System.out.println("finish");
    }

    @BeforeClass
    public static void startOnce() {
        System.out.println("init once!");
    }

    @AfterClass
    public static void endOnce() {
        System.out.println("end once!");
    }

    @Test
    public void test01() {
        System.out.println("test 01");
    }

    @Test
    public void test02() {
        System.out.println("test 02");
    }

}
