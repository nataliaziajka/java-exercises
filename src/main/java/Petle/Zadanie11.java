package Petle;

import java.util.Scanner;

public class Zadanie11 {

    public static void main(String[] args) {

        System.out.println("Podaj wyraz lub zdanie");
        Scanner scanner = new Scanner(System.in);
        String zdanie;

        zdanie = scanner.nextLine();
        for (int i = 0; i < zdanie.length(); i++) {
            if (Character.isDigit(zdanie.charAt(i))) {
                System.out.println(zdanie.charAt(i));
            }

        }
    }
}
