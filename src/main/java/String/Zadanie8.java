package String;

import java.util.Scanner;

public class Zadanie8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraz:");;
        String wyraz = scanner.next();
        int dlugosc = wyraz.length();
        char ostatniaLiterka = wyraz.charAt(dlugosc-1);
        char przedostatniaLiterka = wyraz.charAt(dlugosc-2);

        System.out.println("Ostatnia literka to: " + ostatniaLiterka + ", a przedostatnia to:" +przedostatniaLiterka);
    }
}
