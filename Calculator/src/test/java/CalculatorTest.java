import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.assertj.core.api.Assertions.*;

public class CalculatorTest{

    Calculator calculator;

    @Before
    public void setup() {
        calculator = new Calculator();
        System.out.println("before : " + calculator);
    }

    @After
    public void after() {
        System.out.println("after");
    }

    @Test
    public void sum() {
        assertThat(calculator.sum(2,4)).isEqualTo(6);
    }

    @Test
    public void minus() {
        assertThat(calculator.minus(4,2)).isEqualTo(2);
    }

    @Test
    public void divide() {
    }

    @Test
    public void multifly() {

    }
}
