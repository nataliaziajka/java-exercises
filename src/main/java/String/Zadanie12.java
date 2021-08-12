package String;

import java.util.Scanner;

public class Zadanie12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Oto oryginalny wyraz z gwiazdką: ");
        String wyraz = scanner.next();
        System.out.println("Wyraz po usunieciu gwiazki i zamianie na pusty ciag:" + wyraz.replace("*",""));

    }

}
