package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Players {

    private final List<Player> players;


    public Players(List<String> names) {
        List<Player> result = new ArrayList<>();
        for (String name : names) {
            result.add(new Player(name));
        }
        validateDuplicate(result);
        validateSize(result);
        this.players = result;
    }

    private void validateSize(List<Player> result) {
        if (result.size() < 2 || result.size() > 12) {
            throw new IllegalArgumentException(); // TODO: 예외 메시지
        }
    }

    private void validateDuplicate(List<Player> result) {
        if (result.size() != Set.copyOf(result).size()) {
            throw new IllegalArgumentException(); // TODO: 예외 메시지
        }
    }

    public List<Player> getPlayers() {
        return players;
    }

    public int getPlayersSize() {
        return players.size();
    }
}
