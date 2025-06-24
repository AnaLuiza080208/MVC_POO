package Aluno;

public class Main {
    public static void main(String[] args) {

        AlunoModel aluno1 = new AlunoModel("Lucas Silva", 17, "20231045", 8.5);
        AlunoView view = new AlunoView();
        AlunoController controller = new AlunoController(aluno1, view);

        controller.atualizarView();
        controller.setMedia(6.3);
        controller.setNome("Lucas A. Silva");
        controller.atualizarView();
    }
}
