package model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class HeightTest {

    @ParameterizedTest
    @DisplayName("높이는 1이상 12 이하가 아닌 경우 예외가 발생한다.")
    @ValueSource(ints = {0, 13})
    void invalidHeight(int value) {

        Assertions.assertThatThrownBy(() -> new Height(value))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
