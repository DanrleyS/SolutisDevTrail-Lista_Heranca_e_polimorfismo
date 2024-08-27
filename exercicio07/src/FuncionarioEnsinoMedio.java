public class FuncionarioEnsinoMedio extends  Funcionario{
    private String escola;

    public FuncionarioEnsinoMedio(String nome, String codigoFuncional, String escola) {
        super(nome, codigoFuncional);
        this.escola = escola;
    }

    @Override
    public double calcularRenda() {
        return super.calcularRenda() * 1.50;
    }

    @Override
    public String toString() {
        return super.toString() + ", Escola (Ensino Médio): " + escola;
    }
}
