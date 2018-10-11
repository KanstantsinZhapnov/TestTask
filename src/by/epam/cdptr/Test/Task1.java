package by.epam.cdptr.Test;

public class Task1 {
    public static void main(String[] args) {
        double x = 0, y = 0, result;
        double temp1, temp2;
        ReadInput read = new ReadInput();

        x = read.getDouble("x");
        y = read.getDouble("y");

        temp1 = 1 + Math.pow((Math.sin(x + y)), 2);
        temp2 = 2 + Math.abs((x - (2*x / (1 + Math.pow(x,2)*Math.pow(y,2)))));

        result = temp1 / temp2 + x;

        System.out.println("Result = " + result);
    }
}
