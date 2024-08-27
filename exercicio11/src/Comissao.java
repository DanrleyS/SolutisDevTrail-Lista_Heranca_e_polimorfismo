abstract class Comissao {
    public abstract double obterAdicional();
}

class ComissaoGerente extends Comissao {
    @Override
    public double obterAdicional() {
        return 1500.00;
    }
}

class ComissaoSupervisor extends Comissao {
    @Override
    public double obterAdicional() {
        return 600.00;
    }
}

class ComissaoVendedor extends Comissao {
    @Override
    public double obterAdicional() {
        return 250.00;
    }
}