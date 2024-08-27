public class FuncionarioEnsinoMedio extends  FuncionarioEnsinoBasico{
    public FuncionarioEnsinoMedio(String nome, String codigoFuncional, String escola) {
        super(nome, codigoFuncional, escola);
    }

    @Override
    public String toString() {
        return super.toString() + ", Escola (Ensino Médio): " + getEscola();
    }
}
