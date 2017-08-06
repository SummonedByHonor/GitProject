package TheHighestElementInArray;

import java.util.Scanner;

/**
 * Created by Mateusz on 2017-08-06.
 */
public class HEAMain {

    public static int highestElementMethod(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę elementów tablicy:");
        int arrayElements = scanner.nextInt();
        int[] array = new int[arrayElements];
        int wynik = 0;
        for (int i = 0; i < array.length; i++){
            System.out.println("Podaj liczbę w komórce " + (i+1) + ": ");
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++){
            if (wynik < array[i]){
                wynik = array[i];
            }
        }
        return wynik;
    }

    public static int lowestElementMethod(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę elementów tablicy:");
        int arrayElements = scanner.nextInt();
        int[] array = new int[arrayElements];
        for (int i = 0; i < array.length; i++){
            System.out.println("Podaj liczbę w komórce " + (i+1) + ": ");
            array[i] = scanner.nextInt();
        }
        int wynik = array[0];
        for (int i : array){
            if (wynik > i){
                wynik = i;
            }
        }
        return wynik;
    }

    public static void main(String[] args) {
        System.out.println("Największy element w tablicy: " + lowestElementMethod());
    }
}
