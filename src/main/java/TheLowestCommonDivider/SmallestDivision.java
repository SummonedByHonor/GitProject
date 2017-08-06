package TheLowestCommonDivider;

import java.util.Scanner;

/**
 * Created by Mateusz on 2017-08-06.
 */
public class SmallestDivision {

    public static int smallestDivisionMethod() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę A");
        int numberA = scanner.nextInt();
        System.out.println("Podaj liczbę B");
        int numberB = scanner.nextInt();
        do {
            if (numberA == numberB) {
                return numberA;
            } else if (numberA > numberB) {
                numberA = numberA - numberB;
            } else if (numberB > numberA) {
                numberB = numberB - numberA;
            }
        } while (!(numberA == numberB));
        return numberA;
    }

    public static void main(String[] args) {
        System.out.println("Najmniejszy wspólny dzielnik: " + smallestDivisionMethod());
    }
}
