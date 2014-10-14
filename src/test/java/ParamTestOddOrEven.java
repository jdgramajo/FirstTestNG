import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by jgramajo on 10/14/14.
 */
public class ParamTestOddOrEven {

    private OddOrEven ore;

    @BeforeMethod
    public void initialize() {
        ore = new OddOrEven();
    }

    @DataProvider(name = "numberTypePairs")
    public static Object[][] numberTypePairs() {
        return new Object[][] {
                {2, "Even"}, {3, "Odd"}, {4, "Even"},
                {5, "Odd"}, {6, "Even"}, {7, "Odd"}
        };
    }

    @Test(dataProvider = "numberTypePairs")
    public void testOddOrEven(Integer numberToTest, String numberType) {
        System.out.println(numberToTest + " " + numberType);
        ore.setNumberToCheck(numberToTest);
        Assert.assertEquals(numberType, ore.oddOrEven());
    }

}

