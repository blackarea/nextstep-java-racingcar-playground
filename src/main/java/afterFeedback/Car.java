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

    public String getName() {
        return name.getName();
    }

    public int getPosition(){
        return position.getPosition();
    }

    public Position move(int randomNo) {
        if (randomNo >= FORWARD_NUM) {
            position = position.increase();
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
        return this.position.equals(position);
    }
}
