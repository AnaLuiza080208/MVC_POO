package Aluno;

public class AlunoModel {
    private String nome;
    private int idade;
    private String matricula;
    private double media;

    public AlunoModel(String nome, int idade, String matricula, double media) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

      public boolean isAprovado() {
        return this.media >= 7.0;
    }

}
