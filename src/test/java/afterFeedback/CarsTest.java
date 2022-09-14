package afterFeedback;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
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
        assertThat(winnerList).containsOnly(car1, car2);
    }

    @Test
    void playAndFindWinner(){
        Car car1 = new Car("kali");
        Car car2 = new Car("pobi");
        Car car3 = new Car("yuta");

        List<Car> carList = Arrays.asList(car1, car2, car3);
        Cars cars = new Cars(carList);

        List<Car> list = cars.play(Arrays.asList(3, 4, 4));
        cars.play(Arrays.asList(3, 4, 4));
        cars.play(Arrays.asList(3, 4, 4));

        List<Car> winner = cars.findWinner();

        assertThat(list).contains(car1, car2, car3);
        assertThat(winner).containsOnly(car2, car3);

    }
}
