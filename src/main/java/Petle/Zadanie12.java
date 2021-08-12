package Petle;

import java.util.Scanner;

public class Zadanie12 {

    public static void main(String[] args) {

        System.out.println("Podaj zdanie");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        String reversedSentence = new StringBuilder(sentence)
                        .reverse().toString();
        if(reversedSentence.equals(sentence)){
            System.out.println("Jest palindromem");
        }else System.out.println("Nie jest palindromem");
    }
}
