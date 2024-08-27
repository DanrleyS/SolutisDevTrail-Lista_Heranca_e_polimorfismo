public class Cavalo extends Animal{
    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O cavalo " + getNome() + " faz: Hiii!");
    }

    @Override
    public void moverse() {
        System.out.println("O cavalo " + getNome() + " está correndo.");
    }
}
