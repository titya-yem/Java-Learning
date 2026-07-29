package generics;

public class User implements Comparable<User> {
    private int points;

    public User(int point) {
        this.points = point;
    }

    @Override
    public int compareTo(User other) {
        // this < other -> -1
        // this == other -> 0
        // this > other -> 1
        return points - other.points;
    }

    @Override
    public String toString() {
        return points + "";
    }
}
