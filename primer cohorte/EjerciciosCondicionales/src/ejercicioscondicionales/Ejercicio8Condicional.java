/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioscondicionales;

/**
 * El Seguro Social requiere clasificar a las personas que se jubilaran en el
 * año 2004. Existen tres tipos de jubilaciones: por edad, por antigüedad joven
 * y por antigüedad adulta. Las personas adscritas a la jubilación por edad
 * deben tener 60 años o más y una antigüedad en su empleo de menos de 25 años.
 * Las personas adscritas a la jubilación por antigüedad joven deben tener menos
 * de 60 años y una antigüedad en su empleo de 25 años o más. Las personas
 * adscritas a la jubilación por antigüedad adulta deben tener 60 años o más y
 * una antigüedad en su empleo de 25 años o más.
 *
 * u20241220028
 */
import java.util.Scanner;

public class Ejercicio8Condicional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa la edad");
        int edadpersona = sc.nextInt();
        System.out.println("ingresa la antiguedad del trabajador ");
        int antiguedadpersona = sc.nextInt();

        if (edadpersona >= 60 && antiguedadpersona < 25) {
            System.out.println("La persona esta adscrita a la jubilacion por edad ");
        } else if (edadpersona < 60 && antiguedadpersona >= 25) {
            System.out.println("La persona esta adscrita a la jubilacion por antiguedad joven");
        } else if (edadpersona >= 60 && antiguedadpersona >= 25) {
            System.out.println("la persona esta adscrita a la jubilacion por antiguedad adulta ");
        } else {
            System.out.println("la persona no califica para ningun tipo de las jubilaciones disponibles ");
        }

    }
}
