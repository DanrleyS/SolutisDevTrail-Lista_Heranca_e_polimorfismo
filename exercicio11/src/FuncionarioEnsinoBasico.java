public class FuncionarioEnsinoBasico extends  Funcionario{
    private String escola;


    public FuncionarioEnsinoBasico(String nome, String codigoFuncional, String escola, Comissao comissao) {
        super(nome, codigoFuncional, comissao);
        this.escola = escola;
    }

    @Override
    public double calcularRenda() {
        return super.calcularRenda() * 1.10;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
