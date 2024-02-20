package model;

import java.util.ArrayList;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PlayersTest {

    @Test
    @DisplayName("중복된 사용자 입력시 예외")
    void createDuplicateName() {
        List<String> names = List.of("레디", "레디");

        Assertions.assertThatThrownBy(() -> new Players(names))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("올바른 사용자 입력")
    void createValidNames() {

        List<String> names = List.of("레디1", "레디2");
        Assertions.assertThatCode(() -> new Players(names))
                .doesNotThrowAnyException();
    }

    @Test
    @DisplayName("참여자 수가 2 미만이면 예외")
    void createOverRange() {
        List<String> onePlayer = List.of("레디");
        Assertions.assertThatThrownBy(() -> new Players(onePlayer))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("참여자 수가 12초과하면 예외")
    void methodName() {
        List<String> players = new ArrayList<>();
        for (int i = 0; i < 13; i++) {
            players.add(String.valueOf(i));
        }
        Assertions.assertThatThrownBy(() -> new Players(players))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
