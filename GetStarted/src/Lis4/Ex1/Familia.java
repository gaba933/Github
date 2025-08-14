package Lis4.Ex1;

public final class Familia extends Ingresso {

    private int quantidade;

    public Familia(double valor, String nomeDoFilme, boolean dublado) {
        super(valor, nomeDoFilme, dublado);
    }

    @Override
    public double getValor() {

        if (quantidade >= 3){
            var valorTotal = quantidade * super.getValor();
            double desconto = valorTotal * 0.05;

            return valorTotal-desconto;
        }
        return super.getValor();
    }
}
