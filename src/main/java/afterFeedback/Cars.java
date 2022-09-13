package afterFeedback;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<Car> carList;

    public Cars(List<Car> carList) {
        this.carList = carList;
    }

    public List<Car> findWinner() {
        return getWinnerList(getMaxPosition());
    }

    private Position getMaxPosition() {
        Position position = new Position(0);
        for (Car car : carList) {
            if(!car.getMaxPosition(position).equals(position)){
                position = car.getMaxPosition(position);
            }
        }
        return position;
    }

    private List<Car> getWinnerList(Position position) {
        List<Car> winnerList = new ArrayList<>();
        carList.stream().filter(car -> car.isWinner(position)).forEach(winnerList::add);

        /*for (Car car : carList) {
            if(car.isWinner(position)){
                winnerList.add(car);
            }
        }*/

        return winnerList;
    }

}
