import java.util.Objects;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // this is how we override equal method
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        // this if statement below prevent comparing obj Point with
        // another System.out.println(point1.equals(new TextBox()))
        if (!(obj instanceof Point))
            return false;

        var other = (Point) obj;
        return other.x == x && other.y == y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
