/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.paroimpar;
import java.util.Scanner;

/**
 *
 * @author PC23
 */
public class ParoImpar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();
        
        if (esPar(numero)) {
            System.out.println(numero + " es un número par.");
        } else {
           if (esPar(numero)) {
            System.out.println(numero + " es un número impar.");
        }        
           }
           public static boolean esPar(int numero){
               return numero % 2 == 0;      
    }
}
