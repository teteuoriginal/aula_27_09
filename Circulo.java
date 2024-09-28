public class Circulo implements Figura {
    @Override
    public void desenha() {
        System.out.println("Círculo");
    }

    @Override
    public void mudaCorDeFundo(Cor cor) {
        System.out.println("Mudando cor para " + cor);
    }
}
