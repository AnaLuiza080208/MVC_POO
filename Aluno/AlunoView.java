package Aluno;

public class AlunoView {
    public void exibirDetalhesAluno(String nome, int idade, String matricula, double media, boolean aprovado) {
        System.out.println("====== Detalhes do Aluno ======");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Média: " + media);
        
        if (aprovado) {
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Reprovado");
        }
        System.out.println("================================\n");
    }
}
