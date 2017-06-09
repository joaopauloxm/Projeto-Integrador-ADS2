
package codigus;

import java.util.ArrayList;


public class cadastroMarca {
   
    private ArrayList<cadastroMarca> marcas = new ArrayList<cadastroMarca>();    
    
    private String marca = "";

    
            
            
    
   
    
    public cadastroMarca(String marca){
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    
}
