import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class StringCalculatorTest {
    StringCalculator stringCalculator;

    @Before
    public void setup() {
        stringCalculator = new StringCalculator();
    }

    @Test
    public void removeSpaceFromInputString() {
        assertThat(stringCalculator.removeSpaceFromInputString(" 2 + 3 * 2")).isEqualTo("2+3*2");
    }

    @Test
    public void computeArithmeticOperation() {
        assertThat(stringCalculator.computeArithmeticOperation("2 + 3 * 2")).isEqualTo(10);
    }

    public void splitStringByCharacter() {
        assertThat(stringCalculator.splitStringByCharacter("2 + 3 * 2")).containsExactly();
    }

    public void convertStringToNumber() {

    }
}
