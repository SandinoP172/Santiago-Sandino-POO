/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosenclase;

import java.util.Scanner;

/**
 *
 * @u20241220028
 */
public class ejercicioBucle {

    /**
     **Realizar un programa que pida al usuario un número, que debe estar entre
     * 0 y 10. Si el usuario indica un número erróneo, vuelve a pedir el número.
     * Cuando se indica un número válido, se muestra la tabla de multiplicar de
     * dicho número.
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean correcto = true;
        while (correcto == true) {
            System.out.println("Ingresa un numero del 1 al 10 ");
            int num = scan.nextInt();
            if ((num > 0) && (num <= 10)) {
                correcto = false;
                System.out.println("Tabla del " + num);
                for (int i = 1; i <= 10; i++) {
                    System.out.println(+num + "*" + i + "=" + (num * i));
                }
            } else {

                System.out.println(" ERROR numero no valido :c");
            }

        }
    }
}
