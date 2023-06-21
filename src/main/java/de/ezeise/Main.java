package de.ezeise;

import java.util.Scanner;

public class Main {
    public static int ackermann(int zahl1, int zahl2) {
        if (zahl1 == 0) {
            return zahl2 + 1;
        } else if (zahl1 > 0 && zahl2 == 0) {
            return ackermann(zahl1 - 1, 1);
        } else {
            return ackermann(zahl1 - 1, ackermann(zahl1, zahl2 - 1));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie die erste Zahl ein:");
        int zahl1 = scanner.nextInt();
        System.out.println("Geben Sie die zweite Zahl ein:");
        int zahl2 = scanner.nextInt();
        int result = ackermann(zahl1, zahl2);
        System.out.println("Ackermann(" + zahl1 + ", " + zahl2 + ") = " + result);
    }
}