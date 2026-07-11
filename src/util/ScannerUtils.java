package util;

import java.util.Scanner;

public class ScannerUtils {
    public static Scanner scanner = new Scanner(System.in);

    public static String capturarText(String message) {
        System.out.println(message + ": ");
        return scanner.nextLine();
    }

    public static int capturarNumero(String message) {
        System.out.println(message + ": ");

        int number = scanner.nextInt();
        scanner.nextLine();
        return number;
    }

    public static double capturarDecimal(String message) {
        System.out.println(message + ": ");
        double decimal = scanner.nextDouble();
        scanner.nextLine();
        return decimal;
    }
}
