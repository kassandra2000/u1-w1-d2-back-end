package esercizioi_4;

import java.util.Scanner;

public class Exerciser4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("inserisci un numero");
        count(Integer.parseInt(sc.nextLine()));
    }

    public static void count(int numb) {
        System.out.println("conto alla rovescia");
        for (int i = numb; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
