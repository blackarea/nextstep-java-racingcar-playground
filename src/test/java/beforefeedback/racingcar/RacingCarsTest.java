package beforefeedback.racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import beforefeedback.ui.InsertView;

import java.util.Arrays;
import java.util.List;

public class RacingCarsTest {
    private Cars cars;

    @BeforeEach
    void setup(){
        Car car1 = new Car("kali");
        Car car2 = new Car("pobi");
        Car car3 = new Car("yuta");
        List<Car> carList = Arrays.asList(car1, car2, car3);
        cars = new Cars(carList, 5);
    }

    @Test
    void findMaxNumber(){
        InsertView insertView = new InsertView();
        insertView.insertCars();
    }
}
