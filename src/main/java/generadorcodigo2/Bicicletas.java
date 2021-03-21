/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generadorcodigo2;

/**
 *
 * @author Ricardo
 */
public class Bicicletas {
     private int pulgadas;
     private String tipo;
     private String talla;

    public Bicicletas(int pulgadas, String tipo, String talla) {
        this.pulgadas = pulgadas;
        this.tipo = tipo;
        this.talla = talla;
    }

    public Bicicletas() {
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }
    
}
