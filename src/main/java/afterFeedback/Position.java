package afterFeedback;

import java.util.Objects;

public class Position {
    private final int position;

    public Position(int position) {
        if(position < 0){
            throw new IllegalArgumentException("위치는 0보다 작을 수 없습니다.");
        }
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public Position increase() {
        return new Position(position + 1);
    }

    public boolean lessThan(Position position) {
        return this.position < position.getPosition();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position1 = (Position) o;
        return position == position1.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }

}
