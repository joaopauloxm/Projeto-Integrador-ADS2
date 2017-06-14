
package persistencia;


import classededados.Cliente;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import jdk.jfr.events.FileReadEvent;

public class clienteDAO {
    private String arquivoDeCliente = "C:\\Users\\Joao\\Documents\\GitHub\\Projeto-Integrador-ADS2\\ProjetoFrotaDeCarros\\Cliente.txt";
    
    public void incluir(Object objeto) throws Exception {
        Cliente objCliente = (Cliente) (objeto);
        FileWriter fileCliente = null;
        BufferedWriter bufferCliente = null;
        String quebraLinha = System.getProperty("line.separator");
        try {
            fileCliente = new FileWriter(arquivoDeCliente,true);
            bufferCliente = new BufferedWriter(fileCliente);
            String aux1 = 
                    objCliente.getIdentificador() + "," +
                    objCliente.getCPF()+","+ 
                    objCliente.getNomeDoCliente()+","+
                    objCliente.getEndereco()+","+
                    objCliente.getCNH()+","+
                    objCliente.getTelRes()+","+
                    objCliente.getTelCel()+quebraLinha;
            bufferCliente.write(aux1);
            bufferCliente.close();
            
        } catch (Exception e) {
        }
    }
    
    public ArrayList<Cliente> listar ()throws Exception{
        FileReader clienteFR = null;
        BufferedReader clienteBR = null;
        ArrayList<Cliente> clientes = new ArrayList<>();
        
        try {
            if (new File (arquivoDeCliente).exists()){
                clienteFR = new FileReader(arquivoDeCliente);
                clienteBR = new BufferedReader(clienteFR);
                String linha;
                while ((linha = clienteBR.readLine())!= null){
                    String dados[] = linha.split(",");
                    Cliente cliente = new Cliente();
                    cliente.setIdentificador(Integer.parseInt(dados[0]));
                    cliente.setNomeDoCliente(dados[1]);
                    cliente.setCPF(dados[2]);
                    cliente.setEndereco(dados[3]);
                    cliente.setCNH(dados[4]);
                    cliente.setTelRes(dados[5]);
                    cliente.setTelCel(dados[6]);
                    clientes.add(cliente);
                }
            }
        } catch (Exception e) {
            throw e;
            
        }
        finally{
            if (clienteBR != null)
                clienteBR.close();
            if (clienteFR != null)
                clienteFR.close();
        }
        return clientes;
    }
}