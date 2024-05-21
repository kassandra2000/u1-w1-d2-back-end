package esercizio_2;

import java.util.Scanner;

public class Exerciser2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("iserisci un numero ");
        System.out.println("il numero inserito è: " + number(sc.nextLine()));


    }

    public static String number(String num) {
        return switch (num) {
            case "0" -> "ZERO";
            case "1" -> "UNO";
            case "2" -> "DUE";
            case "3" -> "TRE";
            default -> num + " -NON E' VALIDO!-";
        };

    }
}
