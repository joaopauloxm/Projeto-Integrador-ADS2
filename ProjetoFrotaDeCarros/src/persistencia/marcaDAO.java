
package persistencia;

import codigus.cadastroMarca;
import interfaces.CRUD;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class marcaDAO {
    private String arquivoDeMarca = "C:\\Users\\aluno\\Documents\\GitHub\\Projeto-Integrador-ADS2\\Marca.txt";
    
    public void incluir (Object objeto)throws Exception{
        cadastroMarca objMarca = (cadastroMarca)(objeto);
        FileWriter fileMarca = null;
        BufferedWriter bufferMarca = null;
        String quebraLinha = System.getProperty("line.separator");
        try {
           fileMarca = new FileWriter(arquivoDeMarca);
           bufferMarca = new BufferedWriter(fileMarca);
           String aux1 = objMarca.getMarca()+quebraLinha;
           bufferMarca.write(aux1);
           bufferMarca.close();
        } catch (Exception e) {
        }
{
            
        }
    }
    
}
