import model.Height;
import model.Ladder;
import model.Players;
import view.InputView;
import view.OutputView;
import view.ResultView;

public class Application {

    public static void main(String[] args) {
        InputView inputView = new InputView();
        Players players = new Players(inputView.readPlayers());

        String value = inputView.readHeight();
        Height height = Height.from(value);

        Ladder ladder = new Ladder(height, players);

        OutputView outputView = new OutputView();
        outputView.printPlayers(players);

        ResultView resultView = new ResultView(ladder, players.getPlayers().get(0).length());
        resultView.printResult();
    }
}
