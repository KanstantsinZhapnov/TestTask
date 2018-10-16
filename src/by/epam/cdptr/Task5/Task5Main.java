package by.epam.cdptr.Task5;

public class Task5Main {

    public static void main(String[] args) {
        Ball[] balls = addBalls();
        Basket basket = new Basket(balls);
        String color = "blue";

        double ballsWeight = getWeight(basket, color);
        System.out.println("Total weight of " + color + " balls in the basket is: " + ballsWeight);

    }

    public static Ball[] addBalls() {
        Ball ball1 = new Ball("green", 45);
        Ball ball2 = new Ball("blue", 2.2);
        Ball ball3 = new Ball("yellow", 32);
        Ball ball4 = new Ball("blue", 3);
        Ball ball5 = new Ball("blue", 44);
        Ball ball6 = new Ball("green", 13);
        Ball ball7 = new Ball("red", 2.33);
        Ball ball8 = new Ball("white", 546);

        Ball[] balls = new Ball[]{ball1, ball2, ball3, ball4, ball5, ball6, ball7, ball8};

        return balls;
    }

    private static double getWeight(Basket basket, String color) {
        Ball[] balls = basket.getBalls();
        double totalWeight = 0;

        for (int i = 0; i < balls.length; i++) {
            if (balls[i].getColor().equals(color)) {
                totalWeight += balls[i].getWeight();
            }
            System.out.println(totalWeight); //check total weight each step
        }

        return totalWeight;

    }


}
