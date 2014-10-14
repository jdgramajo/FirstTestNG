import org.testng.annotations.BeforeMethod;

/**
 * Created by jgramajo on 10/14/14.
 */
public class ParamTestOddOrEven {

    private OddOrEven ore;

    @BeforeMethod
    public void initialize() {
        ore = new OddOrEven();
    }

}
