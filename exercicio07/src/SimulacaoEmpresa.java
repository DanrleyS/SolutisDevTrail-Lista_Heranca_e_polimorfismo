public class SimulacaoEmpresa {
    public static void main(String[] args) {
        int numFuncionarios = 10;
        Funcionario[] funcionarios = new Funcionario[numFuncionarios];

        String[] nomes = {"Carla", "Mariana", "Leandro", "Maria", "Pedro",
                "Julio", "João", "Thiago", "Matheus", "Julia"};

        for (int i = 0; i < numFuncionarios; i++) {
            String nome = nomes[i];
            String codigoFuncional = "F" + String.format("%03d", (i + 1));

            if (i < numFuncionarios * 0.4) {
                funcionarios[i] = new FuncionarioEnsinoBasico(nome, codigoFuncional, "Escola Básica " + (i + 1));
            } else if (i < numFuncionarios * 0.8) {
                funcionarios[i] = new FuncionarioEnsinoMedio(nome, codigoFuncional, "Escola Média " + (i + 1));
            } else {
                funcionarios[i] = new FuncionarioGraduado(nome, codigoFuncional, "Universidade " + (i + 1));
            }
        }

        double custoTotal = 0;
        double custoEnsinoBasico = 0;
        double custoEnsinoMedio = 0;
        double custoGraduacao = 0;

        for (Funcionario funcionario : funcionarios) {
            double renda = funcionario.calcularRenda();
            custoTotal += renda;

            if (funcionario instanceof FuncionarioEnsinoBasico && !(funcionario instanceof FuncionarioEnsinoMedio)) {
                custoEnsinoBasico += renda;
            }
            if (funcionario instanceof FuncionarioEnsinoMedio && !(funcionario instanceof FuncionarioGraduado)) {
                custoEnsinoMedio += renda;
            }
            if (funcionario instanceof FuncionarioGraduado) {
                custoGraduacao += renda;
            }

            System.out.println(funcionario);
        }

        System.out.println("\nCustos da Empresa:");
        System.out.println("Custo Total: R$ " + String.format("%.2f", custoTotal));
        System.out.println("Custo Ensino Básico: R$ " + String.format("%.2f", custoEnsinoBasico));
        System.out.println("Custo Ensino Médio: R$ " + String.format("%.2f", custoEnsinoMedio));
        System.out.println("Custo Graduação: R$ " + String.format("%.2f", custoGraduacao));
    }
}