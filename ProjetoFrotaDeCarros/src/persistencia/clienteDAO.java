
package persistencia;

import codigus.cadastroCliente;
import interfaces.CRUD;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class clienteDAO {
    private String arquivoDeCliente = "C:\\Users\\aluno\\Desktop\\Cliente.csv";
    
    public void incluir(Object objeto) throws Exception {
        cadastroCliente objCliente = (cadastroCliente) (objeto);
        FileWriter fileCliente = null;
        BufferedWriter bufferCliente = null;
        
        try {
            fileCliente = new FileWriter(arquivoDeCliente,true);
            String aux1 = objCliente.getNomeDoCliente()+","+objCliente.getCPF()+","+ objCliente.getEndereco()+","+
                    objCliente.getCNH()+","+ objCliente.getTelRes()+","+ objCliente.getTelCel();
            bufferCliente.write(aux1);
            bufferCliente.close();
        } catch (Exception e) {
        }
}
}