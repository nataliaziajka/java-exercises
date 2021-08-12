package String;

import java.util.Scanner;

public class Zadanie5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraz: ");
        String wyraz = scanner.next();
        int dlugosc = wyraz.length();
        char literka = wyraz.charAt(dlugosc-2);
        System.out.println("Przedostatnia cyfra Twojego wyrazu to: " + literka );
    }
}
