package racinggame;

import java.util.Objects;

public class Position {
    private int position;

    public Position(int position) {
        this.position = position = position;
    }

    public void move() {
        this.position++;
    }

    public int getPosition() {
        return this.position;
    }

    public boolean isGreaterThan(Position maxPosition) {
        return this.position > maxPosition.position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Position position1 = (Position) o;
        return position == position1.position;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(position);
    }
}
