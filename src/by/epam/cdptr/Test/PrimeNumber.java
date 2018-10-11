package by.epam.cdptr.Test;

public class PrimeNumber {

    public boolean IsPrimeNumber(int x){
        int z = 3;
        double c = 0.1;
        boolean flag = false;

        if ((x == 1) || (x == 2)){
            flag = true;
            return flag;
        }

        while ((x > z) & (!(c == 0))) {

            c = x % z;

            if (!(c == 0)) {
                z++;
            }
        }

        if (!(z == x)) {
            return flag;
        } else {
            flag = true;
            return flag;
        }
    }

}
