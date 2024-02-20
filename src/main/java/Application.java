import java.util.List;
import view.InputView;

public class Application {

    public static void main(String[] args) {
        InputView inputView = new InputView();
        List<String> players = inputView.readPlayers();

        System.out.println("players = " + players);
    }
}
