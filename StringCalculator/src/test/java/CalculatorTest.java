import static org.assertj.core.api.Assertions.*;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void setup() {
        calculator = new Calculator();
    }

    @Test
    public void sum() {
        assertThat(calculator.sum(1,3)).isEqualTo(4);
    }

    @Test
    public void minus() {
        assertThat(calculator.minus(3, 2)).isEqualTo(1);
    }

    @Test
    public void multiple() {
        assertThat(calculator.multiple(3, 2)).isEqualTo(6);
    }

    @Test
    public void divide() {
        assertThat(calculator.divide(4, 2)).isEqualTo(2);
    }
}
