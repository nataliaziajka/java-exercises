package String;

import java.util.Scanner;

public class Zadanie9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraz: ");
        String wyraz = scanner.next();
        System.out.println("Czy wyraz zawiera w sobie słowo Kot: " + wyraz.contains("kot"));

    }
}
