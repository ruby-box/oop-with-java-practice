import com.tdd.racing.util.RandomUtil;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class RandomUtilTest {

    @Test
    public void randomTest() {
        assertThat(RandomUtil.getRandomNumber(10)).isBetween(1, 10);
    }
}
