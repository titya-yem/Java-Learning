package com.titya;

import java.util.Objects;

public class Point {
    private int x;
    private int y;

    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof Point))
            return false;

        var other = (Point) obj; // down casting
        return x == other.x && y == other.y; // comparing

    }

    @Override
    public int hashCode() {
        return Objects.hash(x,y);
    }
}
