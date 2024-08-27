public class FuncionarioGraduado extends  Funcionario{
    private String universidade;

    public FuncionarioGraduado(String nome, String codigoFuncional, String universidade) {
        super(nome, codigoFuncional);
        this.universidade = universidade;
    }

    public String getUniversidade() {
        return universidade;
    }

    @Override
    public String toString() {
        return super.toString() + ", Universidade (Graduação): " + universidade;
    }
}
