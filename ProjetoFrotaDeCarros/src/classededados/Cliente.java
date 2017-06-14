
package classededados;


public class Cliente {

    private int identificador = 0;
    private String CPF = "";
    private String nomeDoCliente = "";
    private String endereco = "";
    private String bairro = "";
    private String CNH = "";
    private String telRes = "";
    private String telCel = "";
    
    
    public Cliente(){
    }
    
    public Cliente(int identificador, String CPF, String nomeDoCliente, String endereco,String bairro, String CNH, String telRes, String telCel){
        this.identificador = identificador;
        this.CPF = CPF;
        this.nomeDoCliente = nomeDoCliente;
        this.endereco = endereco;
        this.bairro = bairro;
        this.CNH = CNH;
        this.telRes = telRes;
        this.telCel = telCel;
    }

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCNH() {
        return CNH;
    }

    public void setCNH(String CNH) {
        this.CNH = CNH;
    }

    public String getTelRes() {
        return telRes;
    }

    public void setTelRes(String telRes) {
        this.telRes = telRes;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getTelCel() {
        return telCel;
    }

    public void setTelCel(String telCel) {
        this.telCel = telCel;
    } 

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    
}
