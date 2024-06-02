import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Multiplier multiplier = new Multiplier();
        Adder adder = new Adder();

        Address address = new Address();

        List<Integer> intList = new ArrayList<>();
        intList.add(5);
        intList.add(10);
        intList.add(15);

        List<BigDecimal> bigDecList = new ArrayList<>();
        bigDecList.add(BigDecimal.valueOf(5));
        bigDecList.add(BigDecimal.valueOf(10));
        bigDecList.add(BigDecimal.valueOf(15));

        System.out.println(multiplier.multiply(5,6));
        System.out.println(multiplier.multiply(5,6, 2, 3));
        System.out.println(multiplier.multiply(5d,6d));
        System.out.println(multiplier.multiply(BigDecimal.valueOf(6), BigDecimal.valueOf(5)));
        System.out.println(multiplier.multiply(intList));

        System.out.println( adder.add(5,6));
        System.out.println(adder.add(bigDecList));


        System.out.println(address.createAddress("Poland"));
        System.out.println(address.createAddress("Poland", "Warsaw"));
        System.out.println(address.createAddress("Poland", "Warsaw", 05-555));
        System.out.println(address.createAddress("Poland", "Warsaw", 05-555, "Koszykowa"));
        System.out.println(address.createAddress("Poland", "Warsaw", 05-555, "Koszykowa", 5));
    }
}