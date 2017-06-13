
package classededados;

import java.util.ArrayList;


<<<<<<< HEAD:ProjetoFrotaDeCarros/src/classededados/Marca.java
public class Marca {
    private int identificador = 0;
=======
public class cadastroMarca {
   
    private ArrayList<cadastroMarca> marcas = new ArrayList<cadastroMarca>();    
    
>>>>>>> 0aae76b945a7a28cc8fd28c7246a5570da6c599d:ProjetoFrotaDeCarros/src/codigus/cadastroMarca.java
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

    
}
