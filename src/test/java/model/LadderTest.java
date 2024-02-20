package model;

import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LadderTest {

    @Test
    @DisplayName("사다리를 생성한다")
    void methodName() {

        Height height = new Height(5);
        Players players = new Players(List.of("레디1", "레디2", "레디3"));
        Assertions.assertThatCode(() -> new Ladder(height, players))
                .doesNotThrowAnyException();
    }
}
