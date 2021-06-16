package tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {


    @Test
    public void test(){
        SoftAssert soft = new SoftAssert();

soft.assertEquals("","kh");
    }
}
