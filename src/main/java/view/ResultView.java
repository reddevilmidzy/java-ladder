package view;

import java.util.ArrayList;
import java.util.List;
import model.Ladder;
import model.Line;

public class ResultView {

    private final List<String> result;

    public ResultView(Ladder ladder) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < ladder.size(); i++) {
            Line line = ladder.get(i);
            result.add(convert(line));
        }
        this.result = result;
    }

    private String convert(Line line) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < line.size(); i++) {
            if (line.hasBride(i)) {
                stringBuilder.append("|-----");
            } else if (!line.hasBride(i)) {
                stringBuilder.append("|     ");
            }
        }
        stringBuilder.append("|");
        return stringBuilder.toString();
    }

    public void printResult() {
        for (String ans : result) {
            System.out.println(ans);
        }
    }
}
