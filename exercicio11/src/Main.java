

public class Main {
    public static void main(String[] args) {

        Comissao comissaoVendedor = new ComissaoVendedor();
        Comissao comissaoSupervisor = new ComissaoSupervisor();
        Comissao comissaoGerente = new ComissaoGerente();

        Funcionario funcionario1 = new Funcionario("Marcos", "F01");
        Funcionario funcionario2 = new FuncionarioEnsinoBasico("Ana", "F02", "Escola Básica 1", comissaoVendedor);
        Funcionario funcionario3 = new FuncionarioEnsinoMedio("Pedro", "F03", "Escola Básica 2", comissaoSupervisor);
        Funcionario funcionario4 = new FuncionarioGraduado("Julia", "F04",  "Universidade C", comissaoGerente);

        System.out.println(funcionario1);
        System.out.println(funcionario2);
        System.out.println(funcionario3);
        System.out.println(funcionario4);

    }
}