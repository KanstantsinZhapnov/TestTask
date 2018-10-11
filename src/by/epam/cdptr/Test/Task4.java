package by.epam.cdptr.Test;

public class Task4 {
    public static void main(String[] args) {
        boolean result = false;
        int place = 0;

        int[] mas;
        mas = new int[5];
        mas[0] = 1;
        mas[1] = 2;
        mas[2] = 3;
        mas[3] = 4;
        mas[4] = 5;


        for (int i = 0; i < 5; i++) {
            PrimeNumber prime = new PrimeNumber();
            result = prime.IsPrimeNumber(mas[i]);
            if (result = true) {
                place = i+1;
                System.out.print(place + "; ");
            }
        }


    }
}
