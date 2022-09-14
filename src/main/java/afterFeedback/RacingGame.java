package afterFeedback;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {
    private final Cars cars;
    private final int carCount;

    public RacingGame(String[] carArray) {
        cars = createCars(carArray);
        this.carCount = carArray.length;
    }

    public List<Car> playGame(){
        return cars.play(createRandomNumbers(carCount));
    }

    public List<Car> findWinner(){
        return cars.findWinner();
    }

    private List<Integer> createRandomNumbers(int carCount){
        List<Integer> randomNumbers = new ArrayList<>();
        for (int i = 0; i < carCount; i++) {
            randomNumbers.add((int) (Math.random() * 10));
        }
        return randomNumbers;
    }

    private Cars createCars(String[] insertCars) {
        List<Car> carList = new ArrayList<>();
        for (String insertCar : insertCars) {
            carList.add(new Car(insertCar));
        }
        return new Cars(carList);
    }

}
