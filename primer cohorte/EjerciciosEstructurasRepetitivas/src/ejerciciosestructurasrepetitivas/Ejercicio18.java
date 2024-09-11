/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosestructurasrepetitivas;

import java.util.Scanner;

/**
 * La casa del adulto mayor tiene 37 personas registradas y requiere un reporte
 * de los adultos con más de 85 años. Para ello implementa un sistema en el que
 * se capturan el nombre y la edad de cada persona e imprime los datos de
 * quienes cumplen con la condición solicitada.
 *
 * @20241220028
 */
public class Ejercicio18 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int TotalPersonas = 37;
        String nombre;
        int edad;
        String personasMayores85 = "";
        System.out.println(" Bienvenido a Casa Mayor ");
        System.out.println(" ingresa los datos de las 37 personas del lugar ");
        for (int i = 1; i <= TotalPersonas; i++) {

            System.out.println("Ingrese el nombre de la persona " + i);
            nombre = scan.next();

            System.out.println("Ingresa la edad de la persona ");
            edad = scan.nextInt();

            if (edad > 85) {
                personasMayores85 += ("Nombre  " + nombre + "  edad:  " +  edad );
            }

        }
        System.out.println("Lista de personas mayores de 85 años:");
        System.out.println(personasMayores85);
    }

}
