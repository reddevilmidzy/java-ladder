package view;

import java.util.ArrayList;
import java.util.List;
import model.Ladder;
import model.Line;

public class ResultView {

    private final List<String> result;

    public ResultView(Ladder ladder, int pre) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < ladder.size(); i++) {
            Line line = ladder.get(i);
            result.add(convert(line, pre));
        }
        this.result = result;
    }

    private String convert(Line line, int pre) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" ".repeat(pre));
        for (int i = 0; i < line.size() - 1; i++) {
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
