/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosswitch;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class Ejercicio13Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el genero de la persona");
        System.out.println("1. Hombre");
        System.out.println("2. Mujer");
        int genero = sc.nextInt();

        System.out.println("Ingresa el numero de la bolita (1-5");
        int numbola = sc.nextInt();

        switch (genero) {
            case 1:

                switch (numbola) {
                    case 1:
                        System.out.println("Premio: Desodorante");
                        break;
                    case 2:
                        System.out.println("Premio: Six-Pack de cerveza");
                        break;
                    case 3:
                        System.out.println("Premio: Camiseta");
                        break;
                    case 4:
                        System.out.println("Premio: Pantalonetas");
                        break;
                    case 5:
                        System.out.println("Premio: Sudadera");
                        break;
                    default:
                        System.out.println("Numero invalido");
                }
                break;
            case 2:
                switch (numbola) {
                    case 1:
                        System.out.println("Premio: Locion");
                        break;
                    case 2:
                        System.out.println("Premio: Bikini");
                        break;
                    case 3:
                        System.out.println("Premio: Crema facial");
                        break;
                    case 4:
                        System.out.println("Premio: Plancha de cabello");
                        break;
                    case 5:
                        System.out.println("Premio: Esmalte de uñas");
                        break;
                    default:
                        System.out.println("Numero invalido");
                }
                break;
            default:
                System.out.println("Género no válido.");

        }

    }
}
