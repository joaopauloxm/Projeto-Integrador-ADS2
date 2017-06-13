
package persistencia;


import classededados.Cliente;
import interfaces.CRUD;
import java.io.BufferedWriter;
import java.io.FileWriter;

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
}