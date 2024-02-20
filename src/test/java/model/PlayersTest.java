package model;

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
}
