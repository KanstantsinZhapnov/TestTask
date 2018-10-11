package by.epam.cdptr.Test;

public class PrimeNumber {

    public boolean IsPrimeNumber(int x){
        int z = 2;
        double c = 0.1;
        boolean flag = false;

        if (x > 1) {
            if (!(x == 2) & !(x == 3)) {
                while (!(c == 0)) {
                    c = x % z;
                    z++;
                }
                if ((z-1) == x) {
                    flag = true;
                }
            } else {
                flag = true;

            }
        }

        return flag;

//        if ((x == 1) || (x == 2)){
//            flag = true;
//            return flag;
//        } else {
//            while ((x > z) & (!(c == 0))) {
//
//                c = x % z;
//
//                if (!(c == 0)) {
//                    z++;
//                }
//            }
//
//            if (!(z == x)) {
//                return flag;
//            } else {
//                flag = true;
//                return flag;
//            }
//        }


    }

}
