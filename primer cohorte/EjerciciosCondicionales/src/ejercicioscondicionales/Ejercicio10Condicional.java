/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioscondicionales;

/**
 * Un obrero necesita calcular su salario semanal, el cual se obtiene de la sig.
 * manera: • Si trabaja 40 horas o menos se le paga $5000 por hora • Si trabaja
 * más de 40 horas se le paga $5000 por cada una de las primeras 40 horas y un
 * aumento del 20% por cada hora extra.
 *
 * @u20241220028
 */
import java.util.Scanner;

public class Ejercicio10Condicional {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de horas trabajadas del obrero");
        int horastrabajadas = scan.nextInt();

        if (horastrabajadas < 40) {
            int paga = horastrabajadas * 5000;
            System.out.println("se le pagara de salario la suma de" + paga);
        } else {
            int horasextras = (horastrabajadas - 40);
            double valorhextra = (horasextras * 5000) * 0.2;
            int paga = horastrabajadas * 5000;
            double suma = valorhextra + paga;
            System.out.println("se le pagara de salario la suma de " + suma );

        }
    }
}
