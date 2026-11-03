public class Aluno extends Pessoa {
    private String matricula;
    private double notaFinal;
    
    public Aluno(String nome, int idade, String matricula, double notaFinal) {
        super(nome, idade);
        this.matricula = matricula;
        this.notaFinal = notaFinal;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public String verificarSituacao() {
        if (notaFinal >= 7) {
            return "aprovado";
        }
        else{
            return "reprovado";
        }
    }
}
