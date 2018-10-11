package by.epam.cdptr.Test;

public class Task2 {
    public static void main(String[] args) {
        double x1 = -10, x2 = -5, x3 = 5, x4 = 10, y1 = -4, y2 = 8;
        double x, y;
        boolean result = false;

        ReadInput read = new ReadInput();

        x = read.getDouble("x");
        y = read.getDouble("y");

        if ((y >= y1) & (y <= y2)) {
            if ((y >= 0) & (x >= x2) & (x <= x3)) {
                result = true;
            } else {
                if ((y <= 0) & (x >= x1) & (x <= x4)) {
                    result = true;
                }
            }
        }

        System.out.println("Значение входит в обозначенную область? - " + result);

    }
}
