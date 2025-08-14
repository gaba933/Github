package Lis4.Ex1;

public sealed class  Ingresso permits meiaEndrada, Familia {

    private double valor;
    private String nomeDoFilme;
    private boolean dublado;

    public Ingresso(double valor, String nomeDoFilme, boolean dublado) {
        this.valor = valor;
        this.nomeDoFilme = nomeDoFilme;
        this.dublado = dublado;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNomeDoFilme() {
        return nomeDoFilme;
    }

    public void setNomeDoFilme(String nomeDoFilme) {
        this.nomeDoFilme = nomeDoFilme;
    }

    public String getIdioma() {
        return dublado ? "Dublado" : "Legendado";
    }

    public void setDublado(boolean dublado) {
        this.dublado = dublado;
    }


}
