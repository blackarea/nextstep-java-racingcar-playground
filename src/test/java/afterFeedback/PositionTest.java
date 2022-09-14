package afterFeedback;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class PositionTest {

    @Test
    void createPosition() {
        Position position = new Position(2);
        assertThat(position).isEqualTo(new Position(2));
    }

    @Test
    void validPosition(){
        assertThatThrownBy(() -> new Position(-1))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
