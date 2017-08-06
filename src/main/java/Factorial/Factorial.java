package Factorial;

import java.util.Scanner;

/**
 * Created by Mateusz on 2017-08-06.
 */
public class Factorial {

    public static void main(String[] args) {
        int wynik = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj N:");
        wynik = scanner.nextInt();
        System.out.println(factorialMethod(wynik));
    }

    private static int factorialMethod(int wynik) {

        int n = wynik;
        if (wynik > 1) {
                wynik = wynik * factorialMethod(wynik - 1);
        } else if (wynik <= 0) {
            wynik = 1;
        }
        return wynik;
    }

}
