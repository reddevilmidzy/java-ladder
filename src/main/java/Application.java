import model.Height;
import model.Ladder;
import model.Players;
import view.InputView;
import view.ResultView;

public class Application {

    public static void main(String[] args) {
        InputView inputView = new InputView();
        Players players = new Players(inputView.readPlayers());

        String value = inputView.readHeight();
        Height height = Height.from(value);
        System.out.println("height = " + height);

        Ladder ladder = new Ladder(height, players);

        ResultView resultView = new ResultView(ladder);
        resultView.printResult();
    }
}
