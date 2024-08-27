public class FuncionarioEnsinoMedio extends  Funcionario{
    private String escola;

    public FuncionarioEnsinoMedio(String nome, String codigoFuncional, String escola, Comissao comissao) {
        super(nome, codigoFuncional, comissao);
        this.escola = escola;
    }

    @Override
    public double calcularRenda() {
        return super.calcularRenda() * 1.50;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
