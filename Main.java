class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        Circulo c1 = new Circulo();
        cliente.foo(c1); // chama foo com figura simples

        Triangulo t1 = new Triangulo();
        Triangulo t2 = new Triangulo();

        FiguraAgrupada grupo = new FiguraAgrupada();
        grupo.adicionar(c1);
        grupo.adicionar(t1);
        grupo.adicionar(t2);

        cliente.foo(grupo); // chama foo com figura agrupada

        Cor cor = new Cor("vermelho");
        grupo.mudaCorDeFundo(cor); // muda a cor de fundo de todas as figuras no grupo
    }
}
