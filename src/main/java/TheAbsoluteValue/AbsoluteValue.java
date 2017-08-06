package TheAbsoluteValue;

import java.util.Scanner;

/**
 * Created by Mateusz on 2017-08-06.
 */
public class AbsoluteValue {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        absoluteValueMethod(number);
    }

    private static void absoluteValueMethod(int number) {
        if (number < 0) {
            System.out.println((-number));
        } else {
            System.out.println(number);
        }
    }
}
