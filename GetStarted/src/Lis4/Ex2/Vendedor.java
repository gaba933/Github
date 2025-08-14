package Lis4.Ex2;

public class Vendedor {

    private String nome;
    private String email;
    private String senha;
    private int quantidadeVendas;
    private boolean adm=false;

    public Vendedor(String nome, String email, int quantidadeVendas) {
        this.nome = nome;
        this.email = email;
        this.quantidadeVendas = quantidadeVendas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getQuantidadeVendas() {
        return quantidadeVendas;
    }

    public void setQuantidadeVendas(int quantidadeVendas) {
        this.quantidadeVendas = quantidadeVendas;
    }

    public boolean isAdm() {
        return adm;
    }

    public void setAdm(boolean adm) {
        this.adm = adm;
    }
}
