/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;


import classededados.Marca;
import classededados.Modelo;
import java.io.BufferedWriter;
import java.io.FileWriter;
import interfaces.CRUD;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
/**
 *
 * @author Joao
 */
public class modeloDAO implements CRUD{
     private String arquivoDeModelo = "C:\\Users\\Joao\\Documents\\GitHub\\Projeto-Integrador-ADS2\\ProjetoFrotaDeCarros\\Modelo.txt";
    
    public void incluir (Object objeto)throws Exception{
        Modelo objModelo = (Modelo)(objeto);
        FileWriter fileModelo = null;
        BufferedWriter bufferModelo= null;
        String quebraLinha = System.getProperty("line.separator");
        try {
           fileModelo = new FileWriter(arquivoDeModelo, true);
           bufferModelo = new BufferedWriter(fileModelo);
           String aux1 = objModelo.getIdentificador() + "," + objModelo.getModelo() + quebraLinha;
           bufferModelo.write(aux1);
           bufferModelo.close();
        } catch (Exception e) {
        }
    }
    public ArrayList<Modelo> recuperarModelo() throws Exception {
         ArrayList<Modelo> listaDeModelo = new ArrayList<>();
            Modelo objModelo = null;
            
            FileReader frModelo = new FileReader(arquivoDeModelo);
            BufferedReader br = new BufferedReader(frModelo);
            String linha="";
            
            while((linha=br.readLine()) != null){
                String vector[] = linha.split(",");
                
                objModelo = new Modelo();
                objModelo.setIdentificador(Integer.parseInt(vector[0]));
                objModelo.setModelo(vector[1]);
                
                listaDeModelo.add(objModelo);
            }
            br.close();
            return listaDeModelo ;      
        }

    @Override
    public ArrayList<Marca> recuperarMarca() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

