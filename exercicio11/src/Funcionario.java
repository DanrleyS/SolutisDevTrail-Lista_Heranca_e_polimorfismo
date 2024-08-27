public class Funcionario {
    private String nome;
    private String codigoFuncional;
    private Comissao comissao;
    public static final double renda_base = 1000.00;

    public Funcionario(String nome, String codigoFuncional, Comissao comissao) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.comissao = comissao;
    }

    public Funcionario(String nome, String codigoFuncional) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
    }


    public double calcularRenda(){
        double rendaTotal = renda_base;
        if (comissao != null) {
            rendaTotal += comissao.obterAdicional();
        }
        return rendaTotal;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                ", Salario Total: R$ " + String.format("%.2f", calcularRenda()) +
                (comissao != null ? ", Comissão: R$ " + String.format("%.2f", comissao.obterAdicional()) : "");
    }
}
