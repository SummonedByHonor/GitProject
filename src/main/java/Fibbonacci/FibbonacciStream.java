package Fibbonacci;

/**
 * Created by Mateusz on 2017-08-06.
 */
public class FibbonacciStream {

    private int fibbonacci(int x) {
        if (x <= 2) {
            return x = 1;
        } else
            return fibbonacci(x - 2) + fibbonacci(x - 1);
    }
}
