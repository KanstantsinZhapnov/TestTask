package by.epam.cdptr.Test;

public class Task3 {
    public static void main(String[] args) {
        double x, a, b, h, F;

        ReadInput read = new ReadInput();

        a = read.getDouble("a");
        b = read.getDouble("b");
        h = read.getDouble("h");

        x = a;

        while (x < b) {
            F = Math.tan(x);

            x = x + h;
            System.out.println("| " + x + "  |  " + F + "  |");

        }

        if (x == b) {
            F = Math.tan(x);
            System.out.println("| " + x + "  |  " + F + "  |");
        }

    }
}
