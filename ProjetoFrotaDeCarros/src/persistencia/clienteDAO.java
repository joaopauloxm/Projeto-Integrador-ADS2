
package persistencia;

import codigus.cadastroCliente;
import interfaces.CRUD;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class clienteDAO {
    private String arquivoDeCliente = "C:\\Users\\aluno\\Documents\\GitHub\\Projeto-Integrador-ADS2\\Cliente.txt";
    
    public void incluir(Object objeto) throws Exception {
        cadastroCliente objCliente = (cadastroCliente) (objeto);
        FileWriter fileCliente = null;
        BufferedWriter bufferCliente = null;
        String quebraLinha = System.getProperty("line.separator");
        try {
            fileCliente = new FileWriter(arquivoDeCliente,true);
            bufferCliente = new BufferedWriter(fileCliente);
            String aux1 = objCliente.getNomeDoCliente()+","+objCliente.getCPF()+","+ objCliente.getEndereco()+","+
            objCliente.getCNH()+","+ objCliente.getTelRes()+","+ objCliente.getTelCel()+quebraLinha;
            bufferCliente.write(aux1);
            bufferCliente.close();
            
        } catch (Exception e) {
        }
}
}