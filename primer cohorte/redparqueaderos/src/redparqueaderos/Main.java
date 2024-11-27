/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package redparqueaderos;

import redparqueaderos.garajes.*;
import redparqueaderos.vehiculos.*;
import redparqueaderos.excepciones.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RedGarajes red = new RedGarajes();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú de Gestión de Parqueaderos ---");
            System.out.println("1. Crear un nuevo garaje");
            System.out.println("2. Agregar un vehículo a un garaje");
            System.out.println("3. Mostrar ocupación de todos los garajes");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    crearGaraje(red, scanner);
                    break;
                case 2:
                    agregarVehiculo(red, scanner);
                    break;
                case 3:
                    red.mostrarOcupacion();
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);
    }

    public static void crearGaraje(RedGarajes red, Scanner scanner) {
        System.out.print("Nombre del garaje: ");
        String nombre = scanner.nextLine();

        System.out.print("Departamento: ");
        String departamento = scanner.nextLine();

        System.out.print("Ciudad: ");
        String ciudad = scanner.nextLine();

        System.out.print("Dirección: ");
        String direccion = scanner.nextLine();

        System.out.print("Teléfono: ");
        String telefono = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Nombre del administrador: ");
        String administrador = scanner.nextLine();

        System.out.print("Número de espacios del garaje: ");
        int espaciosTotales = scanner.nextInt();

        Garaje nuevoGaraje = new Garaje(nombre, departamento, ciudad, direccion, telefono, email, administrador, espaciosTotales) {
            @Override
            public String getEspaciosTotales() {
                return "";
            }

            @Override
            public String retirarVehiculo() {
                return "";
            }
        };
        red.agregarGaraje(nuevoGaraje);

        System.out.println("Garaje creado exitosamente.");
    }

    public static void agregarVehiculo(RedGarajes red, Scanner scanner) {
        System.out.print("Ingrese el nombre del garaje: ");
        String nombreGaraje = scanner.nextLine();

        Garaje garaje = red.buscarGaraje(nombreGaraje);
        if (garaje == null) {
            System.out.println("Garaje no encontrado.");
            return;
        }

        System.out.print("Placa del vehículo: ");
        String placa = scanner.nextLine();

        System.out.print("Propietario del vehículo: ");
        String propietario = scanner.nextLine();

        System.out.println("Seleccione el tipo de vehículo:");
        System.out.println("1. Automóvil");
        System.out.println("2. Camión");
        System.out.println("3. Motocicleta");
        int tipoVehiculo = scanner.nextInt();

        Vehiculo vehiculo;
        switch (tipoVehiculo) {
            case 1:
                vehiculo = new Automovil(placa, propietario);
                break;
            case 2:
                vehiculo = new Camion(placa, propietario);
                break;
            case 3:
                vehiculo = new Motocicleta(placa, propietario);
                break;
            default:
                System.out.println("Tipo de vehículo no válido.");
                return;
        }

        try {
            garaje.agregarVehiculo(vehiculo);
            System.out.println("Vehículo agregado exitosamente.");
        } catch (Exception e) {
            System.out.println("Error al agregar el vehículo: " + e.getMessage());
        }
    }
}
