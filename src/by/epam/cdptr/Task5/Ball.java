package by.epam.cdptr.Task5;


import java.util.Objects;

public class Ball {

    private String color;
    private double weight;

    public Ball() {

    }

    public Ball(String _color, double _weight) {
        this.color = _color;
        this.weight = _weight;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return Double.compare(ball.weight, weight) == 0 &&
                Objects.equals(color, ball.color);
    }

    @Override
    public int hashCode() {

        return Objects.hash(color, weight);
    }
}
