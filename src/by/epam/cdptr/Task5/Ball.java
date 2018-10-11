package by.epam.cdptr.Task5;

import java.util.Random;

public class Ball {

    public String getColor() {
        String color = "";

        return color;

    }

    public double getWeight() {

        double weight = 1.1;
        return weight;

    }

    public boolean isInBucket() {
        boolean isInBasket;

        Random random = new Random();

        isInBasket = random.nextBoolean();
    }
}
