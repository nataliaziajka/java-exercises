package String;

import java.util.Scanner;

public class Zadanie2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Twój wyraz to: ");
        String word = scanner.next();
        System.out.println("Długośc Twojego wyrazu to " + word.length() );
    }
}
