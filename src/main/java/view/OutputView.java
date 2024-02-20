package view;

import java.util.List;
import model.Player;
import model.Players;

public class OutputView {

    public void printPlayers(Players players) {
        List<Player> result = players.getPlayers();
        int n = result.size();
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(result.get(0).getName()).append(" ");
//                .append(" ".repeat(5 - result.get(0).length())); // TODO: 뭐가 맞는지 확인하기

        for (Player player : result.subList(1, n - 1)) {
            stringBuilder.append(padding(player));
        }
        stringBuilder.append(" ".repeat(5 - result.get(n - 1).length())).append(result.get(n - 1).getName());

        System.out.println(stringBuilder);
    }

    private String padding(Player player) {
        return " ".repeat(6 - player.length()) + player.getName();
    }
}
