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
        /*int opcion;*/

 /*System.out.println("1.-Crear bicicleta.");
        System.out.println("2.-Modificar bicicleta.");
        System.out.println("3.-Consultar bicicleta.");
        System.out.println("0.-Salir.");
        System.out.println("Introduzca opción");
        opcion = teclado.nextInt();
        teclado.nextLine();

        switch (opcion) {
            case 1:*/
        System.out.println("Introduzca talla de bicileta: ");
        String talla = teclado.nextLine();
        System.out.println("Introduzca tipo de bicileta: ");
        String tipo = teclado.nextLine();
        System.out.println("Introduzca pulgadas de rueda: ");
        int pulgadas = teclado.nextInt();
        teclado.nextLine();
        Bicicletas bicicleta = new Bicicletas(pulgadas, tipo, talla);
        bicicleta.setPulgadas(27);

        /* case 2:

            case 3:

            case 0:
                break;

        }*/
        if(tipo!=null){
            tipo=tipo;
        }else{
            tipo="recreativo";
        }
        System.out.println("Las características de la bicicleta son:" + bicicleta.toString());
        System.out.println("Las características de la bicicleta son:" + bicicleta);
    }

}
