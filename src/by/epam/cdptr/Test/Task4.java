package by.epam.cdptr.Test;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        boolean result;
        int place;
        int massiveValue;

        ReadInput read = new ReadInput();

        massiveValue = read.getInteger("Enter Massive value: ");

        int[] mas;
        mas = new int[massiveValue];

        for (int i = 0; i < massiveValue; i++) {
            Random random = new Random();
            mas[i] = random.nextInt();
            System.out.println(mas[i]);
        }



        for (int i = 0; i < massiveValue; i++) {
            PrimeNumber prime = new PrimeNumber();
            result = prime.IsPrimeNumber(mas[i]);
            if (result) {
                place = i+1;
                System.out.print(place + "; ");
            }
        }


    }
}
