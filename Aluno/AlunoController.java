package Aluno;

public class AlunoController {

    private AlunoModel model;
    private AlunoView view;

    public AlunoController(AlunoModel model, AlunoView view) {
        this.model = model;
        this.view = view;
    }

    public void atualizarView() {
        view.exibirDetalhesAluno(model.getNome(), model.getIdade(), model.getMatricula(), model.getMedia(), false);
    }

    public void setNome(String nome) {
        model.setNome(nome);
    }

    public void setIdade(int idade) {
        model.setIdade(idade);
    }

    public void setMedia(double media) {
        model.setMedia(media);
    }

    public void setMatricula(String matricula) {
        model.setMatricula(matricula);
    }

    public String getNome() {
        return model.getNome();
    }

    public double getMedia() {
        return model.getMedia();
    }

    public boolean verificarAprovacao() {
    return model.isAprovado();
}

}

