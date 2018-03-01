import org.junit.Before;
import org.junit.Test;
import tdd.calculator.StringCalculator;

import static org.assertj.core.api.Assertions.*;

public class StringCalculatorTest {
    @Before
    public void setup() {
    }

    @Test
    public void calculate() {
        assertThat(new StringCalculator("2 + 3 * 2").calculate()).isEqualTo(10);
        assertThat(new StringCalculator("3 / 2 + 1").calculate()).isEqualTo(2);
    }

    @Test
    public void calculate2() {
        assertThat(new StringCalculator("2 + 13 * 2 - 10 / 4").calculate()).isEqualTo(5);
    }

    public void convertStringToNumber() {

    }
}
