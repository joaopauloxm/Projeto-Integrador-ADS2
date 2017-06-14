
package persistencia;


import classededados.Carro;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class carroDAO  {
    private String arquivoDeCarros = "C:\\Users\\Joao\\Documents\\GitHub\\Projeto-Integrador-ADS2\\ProjetoFrotaDeCarros\\carro.txt";
    
    public void incluir(Object objeto)throws Exception{
        Carro objCarro =(Carro)(objeto);
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
        public ArrayList<Carro> listar ()throws Exception{
        FileReader carroFR = null;
        BufferedReader carroBR = null;
        ArrayList<Carro> carros = new ArrayList<>();
        
        try {
            if (new File (arquivoDeCarros).exists()){
                carroFR = new FileReader(arquivoDeCarros);
                carroBR = new BufferedReader(carroFR);
                String linha;
                while ((linha = carroBR.readLine())!= null){
                    String dados[] = linha.split(",");
                    Carro carro = new Carro();
                    carro.setIdentificador(Integer.parseInt(dados[0]));
                    carro.setMarcaDoCarro(dados [1]);
                    carro.setModeloDoCarro(dados[2]);
                    carro.setPlacaDoCarro(dados[3]);
                    carro.setAnoDoCarro(Integer.parseInt(dados[4]));
                    carro.setChassi(Integer.parseInt(dados[5]));
                    carro.setCor(dados[6]);
                    carro.setValorTrabalho(Float.parseFloat(dados[7]));
                    carro.setValorPessoal(Float.parseFloat(dados[8]));
                
                    
                  carros.add(carro);
                }
            }
        } catch (Exception e) {
            throw e;
            
        }
        finally{
            if (carroBR != null)
                carroBR.close();
            if (carroFR != null)
                carroFR.close();
        }
        return carros;
    }
}
