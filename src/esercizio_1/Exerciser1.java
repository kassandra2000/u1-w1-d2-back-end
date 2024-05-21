package esercizio_1;

import java.util.Scanner;

public class Exerciser1 {
    public static void main(String[] args) {
        //---------------------------------num1-----------------------------------------
        System.out.println("la stringa è pari? " + evenOrOdd("ciaon"));


        //---------------------------------num2-----------------------------------------
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci un anno: ");
        System.out.println("l'anno è bisestile? " + years(Integer.parseInt(sc.nextLine())));
        sc.close();
    }

    public static boolean evenOrOdd(String str) {
        return str.length() % 2 == 0;
    }

    public static boolean years(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

}
