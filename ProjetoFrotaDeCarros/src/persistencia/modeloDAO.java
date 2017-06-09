/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import codigus.cadastroModelo;
import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 *
 * @author Joao
 */
public class modeloDAO {
     private String arquivoDeModelo = "C:\\Users\\Joao\\Documents\\GitHub\\Projeto-Integrador-ADS2\\ProjetoFrotaDeCarros\\Modelo.txt";
    
    public void incluir (Object objeto)throws Exception{
        cadastroModelo objModelo = (cadastroModelo)(objeto);
        FileWriter fileModelo = null;
        BufferedWriter bufferModelo= null;
        String quebraLinha = System.getProperty("line.separator");
        try {
           fileModelo = new FileWriter(arquivoDeModelo);
           bufferModelo = new BufferedWriter(fileModelo);
           String aux1 = objModelo.getModelo()+ quebraLinha;
           bufferModelo.write(aux1);
           bufferModelo.close();
        } catch (Exception e) {
        }
    }
}
