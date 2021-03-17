/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.generadorcodigo;

import java.util.Scanner;

/**
 *
 * @author daw1
 */
public class AppBicicleta {

    public static void main(String[] args) {
       Bicicletas bicicleta1 = new Bicicletas();
       Scanner reader = new Scanner(System.in);
       
        System.out.println("Introduzca talla de bicileta: ");
        bicicleta1.setTalla(reader.nextLine());
        
        System.out.println("Introduzca pulgadas de rueda: ");
        bicicleta1.setPulgadas (reader.nextInt());
        
        System.out.println("Introduzca tipo de bicileta: ");
        bicicleta1.setTipo(reader.nextLine());

        System.out.println("Las características de la bicicleta son:" + bicicleta1.getTalla());
    }
    
}
