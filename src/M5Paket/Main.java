package M5Paket;

import java.util.Scanner;

/**
 * Klassen består av olika metoder som föränklar beräkningen av Ohms lag, som används i el lära eller fysiska beräkningar
 *
 * @arthur Karam Matar
 * @version 1.0
 * @sins 2023-09 29
 *
 */

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello world!");
        System.out.println("ohms law code");

        System.out.println(Physics.lawR(3,6));
        System.out.println(Physics.lawI(5,5));
        System.out.println(Physics.lawV(3,3));

    }



}