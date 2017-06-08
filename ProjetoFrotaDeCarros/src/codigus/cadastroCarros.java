
package codigus;

import codigus.cadastroMarca;

public class cadastroCarros {
    private String marcaDoCarro = "";
    private String modeloDoCarro = "";
    private int anoDoCarro = 0;
    private String placaDoCarro = "";
    private float valorDoCarro = 0;
    
     public void cadastroCarros(String modeloDoCarro, String marcaDoCarro,  int anoDoCarro,String placaDoCarro, float valorDoCarro){
         this.marcaDoCarro = marcaDoCarro;
         this.modeloDoCarro = modeloDoCarro;
         this.anoDoCarro = anoDoCarro;
         this.placaDoCarro = placaDoCarro;
         this.valorDoCarro = valorDoCarro;
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
        return valorDoCarro;
    }

    public void setValorDoCarro(float valorDoCarro) {
        this.valorDoCarro = valorDoCarro;
    }

    

    public String getPlacaDoCarro() {
        return placaDoCarro;
    }

    public void setPlacaDoCarro(String placaDoCarro) {
        this.placaDoCarro = placaDoCarro;
    }
    
    
    
}
