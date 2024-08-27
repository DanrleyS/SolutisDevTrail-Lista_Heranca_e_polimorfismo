public class FuncionarioEnsinoBasico extends  Funcionario{
    private String escola;


    public FuncionarioEnsinoBasico(String nome, String codigoFuncional, String escola) {
        super(nome, codigoFuncional);
        this.escola = escola;
    }

    public String getEscola() {
        return escola;
    }

    @Override
    public String toString() {
        return super.toString() + ", Escola (Ensino Básico): " + escola;
    }
}
