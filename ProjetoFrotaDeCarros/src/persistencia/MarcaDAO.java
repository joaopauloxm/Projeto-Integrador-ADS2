
package persistencia;

import classededados.Marca;
import classededados.Modelo;
import interfaces.CRUD;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class MarcaDAO implements CRUD{
    private String arquivoDeMarca = "C:\\Users\\Joao\\Documents\\GitHub\\Projeto-Integrador-ADS2\\ProjetoFrotaDeCarros\\Marca.txt";
    
    public void incluir (Object objeto)throws Exception{
        Marca objMarca = (Marca)(objeto);
        FileWriter fileMarca = null;
        BufferedWriter bufferMarca = null;
        String quebraLinha = System.getProperty("line.separator");
        try {
           fileMarca = new FileWriter(arquivoDeMarca, true);
           bufferMarca = new BufferedWriter(fileMarca);
           String aux1 = objMarca.getIdentificador() + "," +objMarca.getMarca()+ quebraLinha;
           bufferMarca.write(aux1);
           bufferMarca.close();
        } catch (Exception e) {
        }

            
        }

    @Override
        public ArrayList<Marca> recuperarMarca() throws Exception {
            
            ArrayList<Marca> listaDeMarcas = new ArrayList<>();
            Marca objMarca = null;
            
            FileReader frMarca = new FileReader(arquivoDeMarca);
            BufferedReader br = new BufferedReader(frMarca);
            String linha="";
            
            while((linha=br.readLine()) != null){
                String vector[] = linha.split(",");
                
                objMarca = new Marca();
                objMarca.setIdentificador(Integer.parseInt(vector[0]));
                objMarca.setMarca(vector[1]);
                
                listaDeMarcas.add(objMarca);
            }
            br.close();
            return listaDeMarcas ;      
        }

    @Override
    public ArrayList<Modelo> recuperarModelo() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    

