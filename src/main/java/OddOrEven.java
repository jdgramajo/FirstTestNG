import java.lang.Integer;

/**
 * Created by jgramajo on 10/14/14.
 */
public class OddOrEven {

    private Integer numberToCheck;

    public void setNumberToCheck(Integer numberToCheck) {
        this.numberToCheck = numberToCheck;
    }

    public Integer getNumberToCheck() {
        return this.numberToCheck;
    }

    public String oddOrEven() throws NullPointerException {
        return this.numberToCheck % 2 == 0 ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        OddOrEven ore = new OddOrEven();
        ore.setNumberToCheck(new Integer(5));
        System.out.println(ore.oddOrEven());
    }

}
