package ui;

import racingcar.Car;

import java.util.List;

public class ResultView {
    private List<Car> cars;

    public ResultView(List<Car> cars) {
        this.cars = cars;
    }

    public void viewResult(){
        cars.forEach(car -> {
            System.out.print(car.getName() + " : ");
            printHyphen(car.getCurrentPosition());
            System.out.println();
        });
        System.out.println();
    }

    private void printHyphen(int currentPosition) {
        for (int i = 0; i < currentPosition; i++) {
            System.out.print("-");
        }
    }

    public void viewWinners(List<Car> winners) {
        for (int i = 0; i < winners.size(); i++) {
            System.out.print(winners.get(i).getName());
            if(i != winners.size() - 1){
                System.out.print(", ");
            }
        }
        System.out.println("가 최종 우승했습니다.");
    }
}
