public class Preguica extends Animal{
    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("A preguiça " + getNome() + " faz: Zzz..");
    }

    @Override
    public void moverse() {
        System.out.println("A preguiça " + getNome() + " está subindo nas árvores.");
    }
}
