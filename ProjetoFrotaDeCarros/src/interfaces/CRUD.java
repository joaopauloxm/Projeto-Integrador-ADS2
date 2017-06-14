
package interfaces;

import classededados.Marca;
import java.util.ArrayList;
import classededados.Modelo;


public interface CRUD {
    void incluir(Object objeto)throws Exception;
    public ArrayList<Marca> recuperarMarca()throws Exception;
    public ArrayList<Modelo> recuperarModelo()throws Exception;
}
