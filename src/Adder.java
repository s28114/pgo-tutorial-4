import java.math.BigDecimal;
import java.util.List;

public class Adder {

    public int add(int a, int b) {
        return a + b;
    }

    public BigDecimal add(List<BigDecimal> list) {
        BigDecimal sum = BigDecimal.ZERO;

        for (BigDecimal num : list) {
            sum = sum.add(num);
        }

        return sum;
    }
}