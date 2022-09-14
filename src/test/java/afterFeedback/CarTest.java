package afterFeedback;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    void moveCar() {
        Car car = new Car("kali");
        Position position = car.move(3);
        Assertions.assertThat(position).isEqualTo(new Position(0));
        Position position2 = car.move(4);
        System.out.println(position2);
        Assertions.assertThat(position2).isEqualTo(new Position(1));
    }
}
