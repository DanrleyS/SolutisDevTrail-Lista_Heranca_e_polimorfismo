public class Cachorro extends Animal{

    public Cachorro( String nome, int idade) {
        super(nome, idade);
    }


    @Override
    public void emitirSom() {
        System.out.println("O cachorro " + getNome() + " faz: Au Au!");
    }

    @Override
    public void moverse() {
        System.out.println("O cachorro " + getNome() + " está correndo.");
    }
}
