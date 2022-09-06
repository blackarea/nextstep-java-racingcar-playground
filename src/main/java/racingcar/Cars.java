package racingcar;

import ui.InsertView;
import ui.ResultView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {
    private List<Car> cars;
    private int count;

    public Cars(List<Car> cars, int count) {
        this.cars = cars;
        this.count = count;
    }

    public void insertCars(){
        InsertView insertView = new InsertView();
        this.cars = Arrays.stream(insertView.insertCars()).map(Car::new).collect(Collectors.toList());
        this.count = insertView.insertCount();
    }

    public void tryMove() {
        cars.forEach(Car::tryMove);
    }

    public void play(){
        ResultView resultView = new ResultView(cars);
        resultView.viewResult();
        for (int i = 0; i < count; i++) {
            tryMove();
            resultView.viewResult();
        }
        resultView.viewWinners(findWinners(cars));
    }

    public List<Car> findWinners(List<Car> cars){
        int maxNumber = cars.stream().map(Car::getCurrentPosition).max(Integer::compare).orElse(-1);
        return createWinnerList(cars, maxNumber);
    }

    private List<Car> createWinnerList(List<Car> cars, int maxNumber) {
        List<Car> winnerList = new ArrayList<>();
        for (Car car : cars) {
            if(maxNumber == car.getCurrentPosition()){
                winnerList.add(car);
            }
        }
        return winnerList;
    }

}

