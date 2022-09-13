package afterFeedback;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class NameTest {

    @Test
    void createName() {
        Name name = new Name("kali");
        assertThat(name).isEqualTo(new Name("kali"));
    }

    @Test
    void validName() {
        assertThatThrownBy(() -> new Name("12345")).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> new Name("")).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> new Name(" ")).isInstanceOf(IllegalArgumentException.class);
    }
}
