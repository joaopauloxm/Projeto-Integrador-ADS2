
package codigus;


public class cadastroCliente {
    private String nomeDoCliente = "";
    private int CPF = 0;
    private String endereco = "";
    private String bairro = "";
    private int CNH = 0;
    private int telRes = 0;
    private int telCel = 0;
    
    public cadastroCliente(String nomeDoCliente, int CPF, String endereco,String bairro, int CNH, int telRes, int telCel){
        this.nomeDoCliente = nomeDoCliente;
        this.CPF = CPF;
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

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCNH() {
        return CNH;
    }

    public void setCNH(int CNH) {
        this.CNH = CNH;
    }

    public int getTelRes() {
        return telRes;
    }

    public void setTelRes(int telRes) {
        this.telRes = telRes;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getTelCel() {
        return telCel;
    }

    public void setTelCel(int telCel) {
        this.telCel = telCel;
    }
    
}
