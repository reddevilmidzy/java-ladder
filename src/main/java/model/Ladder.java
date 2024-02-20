package model;

import java.util.ArrayList;
import java.util.List;

public class Ladder {

    private final List<Line> ladder;

    public Ladder(Height height, Players players) {
        List<Line> result = new ArrayList<>();
        for (int i = 0; i < height.getValue(); i++) {
            result.add(new Line(players.getPlayersSize()));
        }
        this.ladder = result;
    }
}
