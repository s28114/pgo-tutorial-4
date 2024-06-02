import java.math.BigDecimal;
import java.util.List;

public class Multiplier {

    public int multiply(int a, int b) {
        return a * b;
    }

    public int multiply(int a, int b, int x, int y) {
        return multiply(a, b) * multiply(x, y);
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public BigDecimal multiply(BigDecimal a, BigDecimal b) {
        return a.multiply(b);
    }

    public int multiply(List<Integer> list) {
        int result = 1;

        for(int i = 0; i < list.size(); i++) {
            result *= list.get(i);
        }

        return result;
    }
}