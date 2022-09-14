package afterFeedback;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        InsertView insertView = new InsertView();
        String[] carArray = insertView.insertCars();
        int playCount = insertView.insertCount();

        RacingGame racingGame = new RacingGame(carArray);
        ResultView resultView = new ResultView();
        List<Car> carList;

        for (int i = 0; i < playCount; i++) {
            carList = racingGame.playGame();
            resultView.viewResult(carList);
        }

        resultView.viewWinners(racingGame.findWinner());

    }
}
