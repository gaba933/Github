package Lis5.Ex2;

public class Saude implements Produto{

    @Override
    public void imposto(double valor) {

        valor = valor * 0.015;
        System.out.println("Valor do imposto: "  + valor);
    }

}
