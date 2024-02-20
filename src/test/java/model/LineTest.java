package model;

import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LineTest {

    @Test
    @DisplayName("가로줄 생성 생성")
    void createList() {

        Line line = new Line(5);

        Assertions.assertThatCode(() -> new Line(5))
                .doesNotThrowAnyException();
    }

    @Test
    @DisplayName("중복되지 않도록 생성")
    void createNonOverlapping() {
        Line line = new Line(5);

        List<Boolean> points = line.getPoints();

        boolean overlapping = false;

        for (int i = 0; i < points.size() - 1; i++) {
            if (points.get(i) == points.get(i + 1)) {
                overlapping = true;
                break;
            }
        }
        Assertions.assertThat(overlapping).isFalse();
    }
}
