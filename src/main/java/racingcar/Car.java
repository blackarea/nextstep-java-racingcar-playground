package racingcar;

public class Car {
    private String name;
    private int currentPosition = 1;

    public Car(String name) {
        validateName(name);
        this.name = name;
    }

    private void validateName(String name) {
        if(name.length() > 5){
            throw new IllegalArgumentException();
        }
    }

    public void moveForward() {
        currentPosition++;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public String getName() {
        return name;
    }

    public void tryMove() {
        if(createRandomNumber() > 3) {
            moveForward();
        }
    }

    public int createRandomNumber(){
        return (int) (Math.random() * 10);
    }

}
