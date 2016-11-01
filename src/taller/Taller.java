/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author STEBAN
 */
public class Taller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String ip;
        String[] validar = new String[4];
        int a;
        double correcto;
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese una dirección IP: ");
        ip = leer.next();
        validar = ip.split("\\.");
        System.out.printf("Elementos de la Ip: %s\n", Arrays.toString(validar));
        for (int i = 0; i < validar.length; i++) {
            a = Integer.parseInt(validar[0].trim());
            if (validar.length == 4 && a<256) {
                System.out.println("La IP es correcta");
            } else {
                   System.out.println("La Dirección IP es invalida.");              
            }
        }
        a = Integer.parseInt(validar[0]);
        if (a < 127 && a > 0) {
            System.out.println("La IP es clase A");
        } else if (a > 126 && a < 192) {
            System.out.println("La IP es clase B");
        } else if (a > 191 && a < 224) {
            System.out.println("La IP es clase C");
        } else if (a > 223 && a < 240) {
            System.out.println("La IP es clase D");
        } else if (a > 239 && a < 256) {
            System.out.println("La IP es clase E");
        }

    }
}
