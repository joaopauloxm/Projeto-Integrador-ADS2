/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classededados;

import java.util.ArrayList;

/**
 *
 * @author Joao
 */

public class Modelo {
    private int identificador = 0;
    private String modelo = "";
    
    public Modelo(int identificador, String modelo){
        this.identificador = identificador;
        this.modelo = modelo;
    }

    public Modelo() {
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
         
    
}
