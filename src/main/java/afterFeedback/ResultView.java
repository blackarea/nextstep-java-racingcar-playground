package afterFeedback;

import java.util.List;

public class ResultView {

    public void viewResult(List<Car> carList){
        carList.forEach(car -> {
            System.out.print(car.getName() + " : ");
            printHyphen(car.getPosition());
            System.out.println();
        });
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
