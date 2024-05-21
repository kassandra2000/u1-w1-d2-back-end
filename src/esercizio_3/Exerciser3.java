package esercizio_3;

import java.util.Objects;
import java.util.Scanner;

public class Exerciser3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("inserisci una stringa ");
        String str = sc.nextLine();

        splitString(str);
        sc.close();
    }


    public static void splitString(String str) {
        Scanner sc = new Scanner(System.in);
        System.out.println("inserisci la key");
        while (!Objects.equals(sc.nextLine(), ":g")) {
            for (int i = 0; i < str.split("").length; i++) {
                System.out.println(str.split("")[i]);
            }
            System.out.println("inserisci la key");
        }

        // while (sc.nextLine() != ":g") {
        //   for (int i = 0; i < str.split("").length; i++) {
        //      System.out.println(str.split("")[i]);
        // }
        // }
    }
}



