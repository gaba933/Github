package Lis5.Ex2;

public class Vestiario implements Produto {
    @Override
    public void imposto(double valor) {

        valor = valor * 0.025;
        System.out.println("Valor do imposto: "  + valor);
    }
}
