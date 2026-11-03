public class App {
    public static void main(String[] args) throws Exception {
        Professor p = new Professor("Isaac", 32, "POO", 120);

        // Criando a turma
        Turma t = new Turma("Minions da Ale", p, null);

        // Criando três alunos
        Aluno a1 = new Aluno("isabella", 19, "26070058", 9.0);
        Aluno a2 = new Aluno("pedro alan", 18, "26070048", 5.5);
        Aluno a3 = new Aluno("kali", 18, "26070016", 7.0);

        t.adicionarAluno(a1);
        t.adicionarAluno(a2);
        t.adicionarAluno(a3);

        t.apresentarDados();

        System.out.println("\n=+= ALUNOS =+=");
        t.listarAlunos();

        System.out.println("media da turma: " + t.calcularMedia());

        System.out.println("pagamento: " + p.calcularPagamento(20));
        
        // testando turma vazia
        Turma t2 = new Turma("BenjaminS", p, null);
        System.out.println("media da turma vazia: " + t2.calcularMedia());

        // métodos herdados
        System.out.println("\n=+= DADOS DO PROFESSOR =+=");
        System.out.println("mome: " + p.getNome());
        System.out.println("idade: " + p.getIdade());

        System.out.println("\n=+= DADOS DO ALUNO =+=");
        System.out.println("nome: " + a1.getNome());
        System.out.println("idade: " + a1.getIdade());
    }
}
