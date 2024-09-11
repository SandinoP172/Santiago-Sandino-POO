/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosestructurasrepetitivas;

import java.util.Scanner;

/**
 *
 * @20241220028
 */
public class Ejercicio15 {

    /**
     * Una clínica de maternidad necesita un sistema para determinar cuántos bebés han nacido
recientemente. Dicho sistema solicita al usuario capturar la cantidad de nacimientos (N), el
nombre de cada bebé y su sexo (implemente un ciclo do-while para validar la captura, siendo M
para masculino y F para femenino). Al final, debe imprimir la cantidad de bebés de cada sexo.
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N;
        String Nombrebebe;
        int sexo;
        int totalm=0;
        int totalf=0;
        
        System.out.println(" Ingresa la cantidad de nacimientos ");
        N= scan.nextInt();
        
        int i=0;
        
        do {     System.out.println("Ingresa el nombre el bebé: "); 
        Nombrebebe=scan.next();
        
        do{
            System.out.println("ingresa el sexo del bebé");
            System.out.println("1.Masculino");
            System.out.println("2.Femenino");
            sexo= scan.nextInt();
            
            if  (sexo !=1 && sexo !=2)
           {
                System.out.println("Ingrese una opcion valida");
            }
        
        } while (sexo !=1 && sexo !=2);
        
            if (sexo==1) {
                totalm++;
            } else if (sexo==2) {
                totalf++;
            }
        i++;
    } while (i<N);
        System.out.println("total de bebes "+N);
        System.out.println("cantidad de bebes masculinos "+totalm);
        System.out.println("cantidad de bebes femeninos "+totalf);
}
}
