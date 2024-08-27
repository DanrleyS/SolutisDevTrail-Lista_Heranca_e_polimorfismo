public class FuncionarioGraduado extends  Funcionario{
    private String universidade;

    public FuncionarioGraduado(String nome, String codigoFuncional, String universidade, Comissao comissao) {
        super(nome, codigoFuncional, comissao);
        this.universidade = universidade;
    }

    public String getUniversidade() {
        return universidade;
    }

    @Override
    public double calcularRenda() {
        return super.calcularRenda() * 2.00;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
