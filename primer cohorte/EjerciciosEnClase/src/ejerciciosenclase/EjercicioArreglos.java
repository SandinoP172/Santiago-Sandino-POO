/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosenclase;

import java.util.Scanner;

/**
 *
 * @author santi
 */
public class EjercicioArreglos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*declaracion de vectores
        */
        int [] vector1;
        vector1=new int[5];
        vector1[0]=10;
        vector1[4]=12;
        vector1[5]=25;
        //ejemplos de creación de vectores
      //  int vector2 [] = new int [6]; 
     // int vector3 []={34,21,56,78,99,12};
     
     //capturar los datos de 10 notas del curso
        System.out.println("Cuantos alumnos son ? :   ");
        int canalumnos = scan.nextInt();
     double [] notas = new double [canalumnos];
     //ciclo para llevar el vector notas 
     for(int i=0;i<notas.length;i++){
        System.out.println("ingrese la nota # "+(i+1)+":");
        notas[i]=scan.nextDouble();
    }
     //ciclo para mostar notas
     for (int i=0;i<notas.length;i++){
         System.out.println("nota # "+(i+1)+": "+notas[i]);
     }
}
}