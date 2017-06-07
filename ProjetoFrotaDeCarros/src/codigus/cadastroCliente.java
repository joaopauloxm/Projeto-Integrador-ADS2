
package codigus;


public class cadastroCliente {

   
    private String nomeDoCliente = "";
    private float CPF = 0;
    private String endereco = "";
    private String bairro = "";
    private float CNH = 0;
    private float telRes = 0;
    private float telCel = 0;
    
    public cadastroCliente(String nomeDoCliente, float CPF, String endereco,String bairro, float CNH, float telRes, float telCel){
        
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

    public float getCPF() {
        return CPF;
    }

    public void setCPF(float CPF) {
        this.CPF = CPF;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public float getCNH() {
        return CNH;
    }

    public void setCNH(float CNH) {
        this.CNH = CNH;
    }

    public float getTelRes() {
        return telRes;
    }

    public void setTelRes(float telRes) {
        this.telRes = telRes;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public float getTelCel() {
        return telCel;
    }

    public void setTelCel(float telCel) {
        this.telCel = telCel;
    }    
}
