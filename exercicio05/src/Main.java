

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Marcos", "F01");
        FuncionarioEnsinoBasico funcionario2 = new FuncionarioEnsinoBasico("Ana", "F02", "Escola Básica 1");
        FuncionarioEnsinoMedio funcionario3 = new FuncionarioEnsinoMedio("Pedro", "F03", "Escola Básica 2");
        FuncionarioGraduado funcionario4 = new FuncionarioGraduado("Julia", "F04", "Universidade C");

        System.out.println(funcionario1);
        System.out.println(funcionario2);
        System.out.println(funcionario3);
        System.out.println(funcionario4);

    }
}