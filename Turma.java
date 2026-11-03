import java.util.ArrayList;

public class Turma {
    private String nome;
    private Professor professorResponsavel;
    private ArrayList<Aluno> alunos;

    public Turma(String nome, Professor professorResponsavel, ArrayList<Aluno> alunos) {
        this.nome = nome;
        this.professorResponsavel = professorResponsavel;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno a) {
        alunos.add(a);
    }

    public void listarAlunos() {
        for (Aluno a : alunos) {
            System.out.println("nome do aluno: " +a.getNome());
            System.out.println("matricula: "+ a.getMatricula());
            System.out.println("nota final: "+ a.getNotaFinal());
            System.out.println("situacao final: "+ a.verificarSituacao());
            System.out.println("---------------------");
        }
    }

    public double calcularMedia() {
        if (alunos.isEmpty()) {
            return 0;
        }

        double soma = 0;

        for (Aluno a : alunos) {
            soma = soma + a.getNotaFinal();
        }

        return soma/alunos.size();
    }

    public void apresentarDados() {
        System.out.println("turma: " + nome);
        System.out.println("professor responsavel: " + professorResponsavel.getNome());
    }
}
