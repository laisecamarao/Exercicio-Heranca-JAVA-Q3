public class Professor extends Pessoa {
    private String disciplina;
    private double valorHora;

    public Professor(String nome, int idade, String disciplina, double valorHora) {
        super(nome, idade);
        this.disciplina = disciplina;
        this.valorHora = valorHora;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public double getValorHora() {
        return valorHora;
    }

    public double calcularPagamento(int horasTrabalhadas) {
        return horasTrabalhadas*valorHora;
    }
}
