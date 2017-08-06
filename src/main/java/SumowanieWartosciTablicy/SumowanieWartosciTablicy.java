package SumowanieWartosciTablicy;

import java.util.List;
import java.util.Scanner;

/**
 * Created by Mateusz on 2017-08-06.
 */
public class SumowanieWartosciTablicy {

    public static int sumowanieWartosciTablicyMethod(){
        System.out.println("Podaj liczbę elementów tablicy:");
        Scanner scanner = new Scanner(System.in);
        int numberOfArrayElements = scanner.nextInt();
        int[] tablica = new int[numberOfArrayElements];
        int wynik = 0;
        for (int i = 0; i < tablica.length; i++)
        {
            System.out.println("Podaj liczbę w komórce " + (i + 1) + ":");
            tablica[i] = scanner.nextInt();
        }

        for (int i = 0; i< tablica.length; i++){
            wynik = wynik + tablica[i];
        }
        return wynik;
    }

    public static void main(String[] args) {
        System.out.println("Suma elementów tablicy: " + sumowanieWartosciTablicyMethod());
    }
}
