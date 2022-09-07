package beforefeedback.racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class RacingCarTest {

    private Car car;

    @BeforeEach
    void setup(){
        car = new Car("kali");
    }

    @Test
    @DisplayName("전진")
    void carForward(){
        car.moveForward();
        assertThat(car.getCurrentPosition()).isEqualTo(2);
    }

    @Test
    void randomTest(){
        assertThat(car.createRandomNumber()).isGreaterThan(0).isLessThan(10);
        assertThat(car.createRandomNumber()).isGreaterThan(0).isLessThan(10);
        assertThat(car.createRandomNumber()).isGreaterThan(0).isLessThan(10);
    }

}
