package paket;

import java.util.Scanner;

/**
* Klassen består av olika metoder som föränklar beräkningen av Ohms lag, som används i el lära eller fysiska beräkningar
*
* @arthur Karam Matar
* @version 1.0
* @sins 2023-09 29
*
* */

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello world!");
        System.out.println("ohms law code");

    }


    /**
    * beräknar Resistansen R genom att dela Volt V med I Ström
    *
    * @Parameter V      Volt
    * @Parameter I      Ström
    * @Return R     Resistance
     *  */

    public static double lawR (double V, double I){
    double R = 0;
        R = V/I;

        return R;
    }
    /**
     *
     * beräknar Ström I genom att dela Volt V med R resistans
     *
     * @Parameter V    Volt
     * @Parameter R Resistans
     * @Return I Strom
     *  */
    public static double lawI (double V, double R){
        double I = 0;
        I = V/R;

        return I;
    }
    /**
     *
     * beräknar volt V genom att multiplicera R resistans med I Ström
     *
     * @Parameter I Ström
     * @Parameter R Resistans
     * @Return V Volt
     *  */
    public static double lawV (double R, double I){
        double V = 0;
        V = R*I;

        return V;
    }





}