/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14switch;

import java.util.Scanner;

/**
 * Una empresa automotriz necesita un sistema para seleccionar el tipo de carro
 * (auto, SUV o camioneta) lo cual debe de aparecer en un menú, y el color
 * (negro, blanco o rojo) en otro menú. Al final se necesita que despliegue la
 * selección realizada. Nota. Debe de anidarse una estructura de selección
 * múltiple dentro de otra.
 *
 * @u20241220028
 */
public class Ejercicio14Switch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvendio a Autocars");
        System.out.println("selecciona el tipo de carro que deseas");
        System.out.println("Auto");
        System.out.println("SUV");
        System.out.println("Camioneta");
        String tipodecarro = sc.nextLine();
        String color = "";
        switch (tipodecarro) {
            case "Auto" -> {
                System.out.println("selecciona el color de carro que deseas");
                System.out.println("Negro");
                System.out.println("Blanco");
                System.out.println("Rojo");
                color = sc.nextLine();
            }
            case "SUV" -> {
                System.out.println("selecciona el color de SUV que deseas");
                System.out.println("Negro");
                System.out.println("Blanco");
                System.out.println("Rojo");
                color = sc.nextLine();
            }
            case "Camioneta" -> {
                System.out.println("selecciona el color de SUV que deseas");
                System.out.println("Negro");
                System.out.println("Blanco");
                System.out.println("Rojo");
                color = sc.nextLine();
            }
            default ->
                System.out.println("no hay carro de ese tipo");
        }
        System.out.println("Escogiste " + tipodecarro + " de color " + color);
    }

}
