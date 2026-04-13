package br.inatel.poo.turmas;
import java.util.ArrayList;

public class Turma {

    private int quantidadeAlunos;
    private ArrayList<Aluno> alunos;

    public Turma() {
        alunos = new ArrayList<>();
        quantidadeAlunos = 0;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
        quantidadeAlunos++;
    }

    public void listarAlunos() {
        System.out.println("Lista de alunos:");
        for (Aluno aluno : alunos) {
            aluno.mostrarInfo();

        }
    }

    public Aluno buscarMelhorAluno() {
        if (alunos.isEmpty()) {
            return null;
        }

        Aluno melhor = alunos.get(0);

        for (Aluno aluno : alunos) {
            if (aluno.calculaMedia() > melhor.calculaMedia()) {
                melhor = aluno;
            }
        }

        return melhor;
    }
}
