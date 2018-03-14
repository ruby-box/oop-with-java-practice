import com.tdd.racing.service.impl.RacingGame;
import com.tdd.racing.view.output.RacingGameOutput;
import org.junit.Test;

public class RacingGameTest {

    @Test
    public void startGame() {
        RacingGame game = new RacingGame(3, 5);
        game.start();
        RacingGameOutput.printRacingGameResult(game);
    }
}
