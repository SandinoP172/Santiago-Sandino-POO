/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1condicional;

/**
 *En una tienda de computadoras se planea ofrecer a los clientes un descuento que dependerá
del número de equipos que compre. Si las computadoras son menos de cinco se les dará un
10% de descuento sobre el total de la compra; si el número de computadoras es mayor o igual
a cinco pero menos de diez se le otorga un 20% de descuento; y si son 10 o más se les da un
40% de descuento. El precio de cada computadora es de U$500.
* 
 * @u20241220028
 */
import java.util.Scanner;
public class Ejercicio1Condicional {
    public static void main(String[] args) {
        // Precio de cada computadora
        double preciopc = 500;
       
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingresa el numero de computadoras que deseas comprar: ");
        int ncomputadoras = scan.nextInt();
        double totalc = ncomputadoras* preciopc;
     double descuento = 0.0;
        if (ncomputadoras < 5) {
            descuento = 0.10;
        } else if (ncomputadoras >= 5 && ncomputadoras < 10) {
            descuento = 0.20;
        } else if (ncomputadoras >= 10) {
            descuento = 0.40;
        }
        double vdescuento = totalc * descuento;
        double totaltodo = totalc - vdescuento;
        System.out.println("Numero de computadoras compradas: " + ncomputadoras);
        System.out.println("Precio sin descuento: $" + totalc);
        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Valor del descuento: $" + vdescuento);
        System.out.println("Total a pagar despues del descuento: $" + totaltodo);
        
       
    }
}