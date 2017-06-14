
package classededados;
import classededados.Marca;
import java.util.ArrayList;
public class Carro {
    private ArrayList<Carro> carro = new ArrayList<Carro>();
    private int identificador = 0;
    private String marcaDoCarro = "";
    private String modeloDoCarro = "";
    private int anoDoCarro = 0;
    private String placaDoCarro = "";
    private int chassi = 0;
    private String cor = "";
    private float valorTrabalho = 0;
    private float valorPessoal = 0;
            
     public Carro (){
     
     }
     public Carro(int identificador, String placaDoCarro, String modeloDoCarro, String marcaDoCarro,  int anoDoCarro, float valorTrabalho, float valorPessoal, int chassi, String cor){
         this.identificador = identificador;
         this.placaDoCarro = placaDoCarro;
         this.marcaDoCarro = marcaDoCarro;
         this.modeloDoCarro = modeloDoCarro;
         this.anoDoCarro = anoDoCarro;
         this.valorTrabalho = valorTrabalho;
         this.valorPessoal = valorPessoal;
         this.chassi = chassi;
         this.cor = cor;
                 
     }

    public String getMarcaDoCarro() {
        return marcaDoCarro;
    }

    public void setMarcaDoCarro(String marcaDoCarro) {
        this.marcaDoCarro = marcaDoCarro;
    }

    public String getModeloDoCarro() {
        return modeloDoCarro;
    }

    public void setModeloDoCarro(String modeloDoCarro) {
        this.modeloDoCarro = modeloDoCarro;
    }

    public int getAnoDoCarro() {
        return anoDoCarro;
    }

    public void setAnoDoCarro(int anoDoCarro) {
        this.anoDoCarro = anoDoCarro;
    }

    public float getValorDoCarro() {
        return valorTrabalho;
    }

    public void setValorDoCarro(float valorTrabalho) {
        this.valorTrabalho = valorTrabalho;
    }

    

    public String getPlacaDoCarro() {
        return placaDoCarro;
    }

    public void setPlacaDoCarro(String placaDoCarro) {
        this.placaDoCarro = placaDoCarro;
    }

    /**
     * @return the chassi
     */
    public int getChassi() {
        return chassi;
    }

    /**
     * @param chassi the chassi to set
     */
    public void setChassi(int chassi) {
        this.chassi = chassi;
    }

    /**
     * @return the Cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param Cor the Cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getValorTrabalho() {
        return valorTrabalho;
    }

    public void setValorTrabalho(float valorTrabalho) {
        this.valorTrabalho = valorTrabalho;
    }

    public float getValorPessoal() {
        return valorPessoal;
    }

    public void setValorPessoal(float valorPessoal) {
        this.valorPessoal = valorPessoal;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    
    
    
}
