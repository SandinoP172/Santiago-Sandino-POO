/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioenclaseparqueadero;

import java.util.Scanner;

/**
 *Elabore un programa en programa que ayude al portero del centro de abastos para calcular el
costo de parqueadero de todos los camiones que hacen uso de estos servicios durante una
jornada.
 * Santiago Sandino Palacios u20241220028
 */
public class EjercicioEnClaseParqueadero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double [][]datosCamion = new double [100][6];
        double tipoproducto=0, tipovehiculo=0, valorParqueadero=0,pesovehiculo=0,tiempo=0, largocamion=0 ;
        for (int nCamion = 0; nCamion < datosCamion.length; nCamion++) {
        System.out.println("Parqueadero");
        System.out.println("Ingresa elmotivo de entrada");
        System.out.println("1. Cargue ");
        System.out.println("2. Descargue ");
         tipovehiculo= scan.nextDouble();
       
        if (tipovehiculo==2) {
            System.out.println("Ingrese el tipo de producto que va a descargar ");
            System.out.println("1. Perecedero");
            System.out.println("2. No Perecedero");
            tipoproducto = scan.nextDouble();
           
            System.out.println("Ingresa el peso en toneladas del vehiculo");
                 pesovehiculo = scan.nextDouble();
                switch ((int)tipoproducto) {
                case 1:
                    if (pesovehiculo<8){
                         valorParqueadero = 15000*pesovehiculo;
                    } else { 
                         valorParqueadero = (9000*pesovehiculo);
                    }
                    break;
                case 2:
                         if (pesovehiculo<8){
                         valorParqueadero = 60000;
                    } else { 
                        valorParqueadero = 60000+(pesovehiculo-10)*7000;
                    }
                default:
                    throw new AssertionError();
            }
                } else { 
            System.out.println("Tiempo en el parqueadero ");
                    tiempo = scan.nextDouble();
                    System.out.println("Largo del camion ");
                    largocamion = scan.nextDouble();
                    
                    if (tiempo<=2) {
                valorParqueadero = 0;
            } else {  
                        if(largocamion<=4){
                            valorParqueadero=(tiempo-2)*4000;
                        } else 
                        { valorParqueadero=(tiempo-2)*4000*1.25;
                        
  }
                }

            }
            System.out.println("Valor a pagar: " + valorParqueadero);
            datosCamion[nCamion][0] = tipovehiculo;
            datosCamion[nCamion][1] = tipoproducto;
            datosCamion[nCamion][2] = pesovehiculo;
            datosCamion[nCamion][3] = tiempo;
            datosCamion[nCamion][4] = largocamion;
            datosCamion[nCamion][5] = valorParqueadero;
            // Falta programar la pregunta si desea continuar??

        }
        System.out.println("TipoS   TipoP   Peso    Tiempo  Largo   Valor");
        for (int nCamion = 0; nCamion < datosCamion.length; nCamion++) {
            System.out.println("");
            for (int nDato = 0; nDato < 6; nDato++) {
                System.out.print(datosCamion[nCamion][nDato] + "      ");

            }
        }
    }
}
                    
                    
                    
                    
                    
                    
                    
                    
                                       
            