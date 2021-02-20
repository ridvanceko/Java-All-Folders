package test.java.selenium.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {



    @Test
    public void test1() {

        System.out.println("code before assertion");
        Assert.assertEquals(2, 5);
        System.out.println("code after assertion");


    }

    @Test
    public void test2() {
        System.out.println("code before soft assertion");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(2, 5);
        softAssert.assertEquals("Ashley", "John");
        System.out.println("code after soft assertion");

        softAssert.assertAll(); //getting result of all assertions
    }


}
