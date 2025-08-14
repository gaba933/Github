package Lis4.Ex1;

public final class meiaEndrada extends Ingresso {

    public meiaEndrada(int valor, String nomeDoFilme, boolean dublado) {
        super(valor, nomeDoFilme, dublado);
    }

    @Override
    public double getValor() {

        return super.getValor()/2;
    }
}
