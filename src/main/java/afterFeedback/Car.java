package afterFeedback;

public class Car {
    private static final int FORWARD_NUM = 4;

    private Name name;
    private Position position;

    public Car(String name) {
        this(name, 0);
    }

    public Car(String name, int position) {
        this.name = new Name(name);
        this.position = new Position(position);
    }

    public Position move(int randomNo) {
        if (randomNo >= FORWARD_NUM) {
            return position.increase();
        }

        return position;
    }

    public Position getMaxPosition(Position position) {
        if(this.position.lessThan(position)){
            return position;
        }
        return this.position;
    }

    public boolean isWinner(Position position) {
        return position.equals(position);
    }

}
