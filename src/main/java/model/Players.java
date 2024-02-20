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
        validate(result);
        this.players = result;
    }

    private void validate(List<Player> result) {
        if (result.size() != Set.copyOf(result).size()) {
            throw new IllegalArgumentException(); // TODO: 예외 메시지
        }
    }
}
