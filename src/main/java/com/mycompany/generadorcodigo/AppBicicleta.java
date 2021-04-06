/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.generadorcodigo;

import java.util.Scanner;

/**
 *
 * @author Ricardo
 */
public class AppBicicleta {

    public static void main(String[] args) {
       
       Scanner teclado = new Scanner(System.in);
       int pulgadas;
       String tipo;
       String talla;
       
        System.out.println("Introduzca talla de bicileta: ");
        pulgadas = teclado.nextInt();
        teclado.nextLine();
        
        System.out.println("Introduzca pulgadas de rueda: ");
        tipo = teclado.nextLine();
        
        System.out.println("Introduzca tipo de bicileta: ");
        talla = teclado.nextLine();
        
        Bicicletas bicicleta1 = new Bicicletas(pulgadas,tipo,talla);
        System.out.println("Las características de la bicicleta son:" + bicicleta1.toString());
    }
    
}

