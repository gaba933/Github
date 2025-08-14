package Lis5.Ex2;

public class Alimentacao implements Produto{

    @Override
    public void imposto(double valor) {

        valor = valor * 0.01;
        System.out.println("Valor do imposto: "  + valor);
    }

}
