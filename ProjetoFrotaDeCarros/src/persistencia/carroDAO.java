
package persistencia;

import interfaces.CRUD;
import codigus.cadastroCarros;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class carroDAO  {
    private String arquivoDeCarros = "";
    
    public void incluir(Object objeto)throws Exception{
        cadastroCarros objCarro =(cadastroCarros)(objeto);
        FileWriter fileCarro = null;
        BufferedWriter bufferCarro = null;
        
        try {
            fileCarro = new FileWriter(arquivoDeCarros,true);
            String aux1 = objCarro.getNomeDoCarro()+","+ objCarro.getMarcaDoCarro()+","+ objCarro.getModeloDoCarro()+","+
                    objCarro.getAnoDoCarro()+","+ objCarro.getValorDoCarro();
                    bufferCarro.write(aux1);
        } catch (Exception e) {
        }
     }
}
