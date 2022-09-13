package afterFeedback;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {

    @Test
    void findWinner() {
        Car car1 = new Car("kali", 3);
        Car car2 = new Car("pobi", 3);
        Car car3 = new Car("yuta", 2);

        List<Car> carList = Arrays.asList(car1, car2, car3);
        Cars cars = new Cars(carList);

        List<Car> winnerList = cars.findWinner();
        assertThat(winnerList).contains(car1, car2);
    }
}
