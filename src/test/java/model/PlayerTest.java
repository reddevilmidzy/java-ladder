package model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PlayerTest {

    @Test
    @DisplayName("사용자 이름이 5를 초과하면 예외 발생")
    void methodName() {

        Assertions.assertThatThrownBy(() -> new Player("여섯글자초과"))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
