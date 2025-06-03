
public class PlanetaModel{

    private String nome;
    private double massa;          
    private boolean temVida;
    private int luas;  

    // public PlanetaModel(){
    //     this.nome = nome;
    //     this.massa = massa;
    //     this.temVida = temVida;
    //     this.luas = luas;
    // }

      public PlanetaModel(String nome, double massa, boolean temVida, int luas) {
        this.nome = nome;
        this.massa = massa;
        this.temVida = temVida;
        this.luas = luas;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public boolean isTemVida() {
        return temVida;
    }

    public void setTemVida(boolean temVida) {
        this.temVida = temVida;
    }

    public int getLuas() {
        return luas;
    }

    public void setLuas(int luas) {
        this.luas = luas;
    }
}