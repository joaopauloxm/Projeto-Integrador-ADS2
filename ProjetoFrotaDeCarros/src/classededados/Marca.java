
package classededados;

import java.util.ArrayList;
public class Marca {
    private int identificador = 0;
    private ArrayList<Marca> marcas = new ArrayList<Marca>();    
    private String marca = "";

    
            
            
    
   
    
    public Marca(int identificador ,String marca){
        this.identificador = identificador;
        this.marca = marca;
    }

    public Marca() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public ArrayList<Marca> getMarcas() {
        return marcas;
    }

    public void setMarcas(ArrayList<Marca> marcas) {
        this.marcas = marcas;
    }
    

    
}
