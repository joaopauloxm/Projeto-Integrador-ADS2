/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigus;

import java.util.ArrayList;

/**
 *
 * @author Joao
 */
public class cadastroModelo {
    private ArrayList<cadastroModelo> modelos = new ArrayList<cadastroModelo>();
    private int identificador = 0;
    private String modelo = "";
    
    public cadastroModelo ( String modelo){
        
        this.modelo = modelo;
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

    public void setModelo(String marca) {
        this.modelo = modelo;
    }
         
    
}
