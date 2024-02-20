package model;

import java.util.ArrayList;
import java.util.List;

public class Line {

    private final List<Boolean> points;

    public Line(final int personCount) {

        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < personCount; i++) {
            result.add(generate(i));
        }
        this.points = result;
    }

    private boolean generate(int i) {
        return i % 2 == 0;
    }

    public List<Boolean> getPoints() {
        return points;
    }
}
