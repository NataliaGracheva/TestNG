package FirstPackage;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class UnitTest {
    Unit unit;

    @BeforeSuite
    public void SetUp() {
        unit = new Unit();
    }

    @Test(priority = 5,
            description = "Проверка метода countSum")
    public void countSumShouldReturnCorrectNumber() {
        int sum = unit.countSum(2, 3);
        Assert.assertEquals(sum, 5);
    }

    @Test(priority = 4,
            description = "Проверка метода countSum")
    public void countSumShouldNotReturnIncorrectNumber() {
        int sum = unit.countSum(2, 3);
        Assert.assertNotEquals(sum, 6);
    }

    @Test(priority = 3,
            enabled = false)
    public void sayHelloShouldReturnCorrectString() {
        String s = unit.sayHello();
        Assert.assertEquals(s, "Hello world!");
    }

    @Test(priority = 2,
            timeOut = 500)
    public void sayHelloShouldNotReturnIncorrectString() {
        String s = unit.sayHello();
        Assert.assertNotEquals(s, "Goodbye world!");
    }

    @Test(priority = 1,
            invocationCount = 3)
    public void isPositiveShouldReturnTrue() {
        boolean bul = unit.isPositive(0);
        Assert.assertTrue(bul);
    }

    @Test
    public void isPositiveShouldReturnFalse() {
        boolean bul = unit.isPositive(-1);
        Assert.assertFalse(bul);
    }
}
