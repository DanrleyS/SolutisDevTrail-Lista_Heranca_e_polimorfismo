public class Funcionario {
    private String nome;
    private String codigoFuncional;
    public static final double renda_base = 1000.00;

    public Funcionario(String nome, String codigoFuncional) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
    }


    public double calcularRenda(){ return  renda_base;}

    @Override
    public String toString() {
        return "Nome: " + nome + ", Código Funcional: " + codigoFuncional + ", Renda: R$"+ calcularRenda();
    }
}
