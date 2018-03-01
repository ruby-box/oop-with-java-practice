import static org.assertj.core.api.Assertions.*;
import org.junit.Before;
import org.junit.Test;
import tdd.calculator.StringAddCalculator;

public class StringAddCalculatorTest {
    StringAddCalculator stringAddCalculator;

    @Before
    public void setup() {
        stringAddCalculator = new StringAddCalculator();
    }

    @Test
    public void splitStringToNumber() {
        //Scanner scan = new Scanner(System.in);
        //String str = scan.nextLine();
        assertThat(stringAddCalculator.splitStringNumber("1,2")).containsExactly("1","2");
        assertThat(stringAddCalculator.splitStringNumber("1,2,3")).containsExactly("1","2","3");
        assertThat(stringAddCalculator.splitStringNumber("1,2:3")).containsExactly("1","2","3");
    }

    @Test
    public void sumStringNumber() {
        assertThat(stringAddCalculator.sumStringNumber("1,2")).isEqualTo(3);
    }

    @Test
    public void splitStringToNumberByCustomSeparator() {
        assertThat(stringAddCalculator.splitStringToNumberByCustomSeparator("//;\n1;2;3")).containsExactly("1","2","3");
    }

    @Test
    public void getCustomSeparator() {
        assertThat(stringAddCalculator.getCustomSeparator("//;\n1;2;3")).isEqualTo(";");
        assertThat(stringAddCalculator.getCustomSeparator("//,\n1;2;3")).isEqualTo(",");
    }

    @Test
    public void sumStringNumberFromCustomSeparator() {
        assertThat(stringAddCalculator.sumStringNumberFromCustomSeparator("//;\n1;2;3")).isEqualTo(6);
    }

    @Test(expected = RuntimeException.class)
    public void sumStringNumberIncludeNagativeNumber() {
        assertThat(stringAddCalculator.sumStringNumberFromCustomSeparator("//;\n1;2;-3")).isEqualTo(0);
    }
}
