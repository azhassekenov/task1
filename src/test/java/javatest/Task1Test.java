package javatest;

import org.junit.*;

import static org.junit.Assert.*;
/**
 * Created by A.ZHASEKENOV on 10.10.2018.
 */
public class Task1Test {
    private Task1 task;

    @BeforeClass
    public static void beforeClass() {
        System.out.println(" Before Task1.class");
    }

    @AfterClass
    public  static void afterClass() {
        System.out.println(" After Task1.class");
    }

    @Before
    public void initTest() {
        task = new Task1();
    }

    @After
    public void afterTest() {
        task = null;
    }
    @Test
    public void testSumma() throws Exception {
        assertEquals("6863631259944440400542142424042254245055555555555555555557254099058570022074827809090709215645646025725436332772552385152123080914545444905564013648308", task.summa("06863631259944440400542142424042254245055555555555555555544654654654564564546545666666666666666666177877456457897654897897878040457272722452782006824154","000012599444404005457528282142424042548978979847847979874874897487254245040457272722452782006824154"));
    }

}