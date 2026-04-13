package br.inatel.poo;

import br.inatel.poo.turmas.Aluno;
import br.inatel.poo.turmas.Turma;
public class Main {
    public static void main(String[] args) {
        Turma turma = new Turma();

        Aluno a1 = new Aluno("José Matheus Gonçalves Rodrigues", "2171", new double[]{10, 10, 10});
        Aluno a2 = new Aluno("Daniel Granato", "666", new double[]{0.0, 0.0, 0.0});
        Aluno a3 = new Aluno("David Fernandes Bourbon", "582", new double[]{8.5, 6.0, 7.0});

        turma.adicionarAluno(a1);
        turma.adicionarAluno(a2);
        turma.adicionarAluno(a3);

        turma.listarAlunos();

        Aluno melhor = turma.buscarMelhorAluno();

        if (melhor != null) {
            System.out.println("Melhor aluno:");
            System.out.println("Nome: " + melhor.getNome());
            System.out.println("Média: " + melhor.calculaMedia());
        }
    }
}