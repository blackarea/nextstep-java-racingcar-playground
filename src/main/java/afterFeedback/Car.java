package afterFeedback;

public class Car {
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
        if (randomNo >= 4) {
            return position.increase();
        }

        return position;
    }
}
