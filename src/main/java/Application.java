import java.util.List;
import model.Height;
import view.InputView;

public class Application {

    public static void main(String[] args) {
        InputView inputView = new InputView();
        List<String> players = inputView.readPlayers();

        System.out.println("players = " + players);

        String value = inputView.readHeight();
        Height height = Height.from(value);
        System.out.println("height = " + height);
    }
}
