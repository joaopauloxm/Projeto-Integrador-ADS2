
package persistencia;


import interfaces.CRUD;
import classededados.Carros;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class carroDAO  {
    private String arquivoDeCarros = "C:\\Users\\Joao\\Documents\\GitHub\\Projeto-Integrador-ADS2\\ProjetoFrotaDeCarros\\carro.txt";
    
    public void incluir(Object objeto)throws Exception{
        Carros objCarro =(Carros)(objeto);
        FileWriter fileCarro = null;
        BufferedWriter bufferCarro = null;
        String quebraLinha = System.getProperty("line.separator");
        try {
            fileCarro = new FileWriter(arquivoDeCarros,true);
            bufferCarro = new BufferedWriter(fileCarro);
            String aux1 = 
                    objCarro.getIdentificador() + ","+
                    objCarro.getMarcaDoCarro()+","+
                    objCarro.getModeloDoCarro()+","+ 
                    objCarro.getPlacaDoCarro() + "," +
                    objCarro.getAnoDoCarro()+","+
                    objCarro.getChassi() + "," + 
                    objCarro.getCor()+ ","+ 
                    objCarro.getValorTrabalho()+ "," + 
                    objCarro.getValorPessoal()+quebraLinha;
                    bufferCarro.write(aux1);
                    bufferCarro.close();
        } catch (Exception e) {
        }
     }
}
