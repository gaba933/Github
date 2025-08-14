package Lis5.Ex2;

public class Cultura implements Produto {
    @Override
    public void imposto(double valor) {

        valor = valor * 0.04;
        System.out.println("Valor do imposto: "  + valor);
    }
}
