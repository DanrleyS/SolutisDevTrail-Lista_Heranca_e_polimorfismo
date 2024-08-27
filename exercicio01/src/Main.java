

public class Main {
    public static void main(String[] args) {

    Animal cachorro1 = new Cachorro("dog", 5);
    Animal cavalo1 = new Cavalo("Horse", 10);
    Animal preguica1 = new Preguica("Ziggs", 7);

    cachorro1.emitirSom();
    cavalo1.emitirSom();
    preguica1.emitirSom();

    cachorro1.moverse();
    cavalo1.moverse();
    preguica1.moverse();


    }
}