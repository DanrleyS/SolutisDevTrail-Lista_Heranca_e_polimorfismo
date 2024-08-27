class Zoologico {
    private Animal[] jaulas;

    public Zoologico() {
        jaulas = new Animal[10];

        jaulas[0] = new Cachorro("Dog", 5);
        jaulas[1] = new Cavalo("Horse", 7);
        jaulas[2] = new Preguica("Ziggs", 10);
        jaulas[3] = new Cachorro("Dog2", 3);
        jaulas[4] = new Cavalo("Horse2", 6);
        jaulas[5] = new Preguica("Ziggs2", 8);
        jaulas[6] = new Cachorro("Dog3", 2);
        jaulas[7] = new Cavalo("Horse3", 4);
        jaulas[8] = new Preguica("Ziggs3", 9);
        jaulas[9] = new Cachorro("Dog4", 1);
    }

    public void percorrerJaulas() {
        for (Animal animal : jaulas) {
            if (animal != null) {
                animal.emitirSom();
                if (animal instanceof Cachorro || animal instanceof Cavalo){
                    animal.moverse();
                }

            }
        }
    }
}