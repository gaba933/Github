package Lis4.Ex2;

public class Gerente {

    private String nome;
    private String email;
    private String senha;
    private boolean adm=true;

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

    public boolean isAdm() {
        return adm;
    }

    public void setAdm(boolean adm) {
        this.adm = adm;
    }

    public String Relatorio (){
        return "relatorio";
    }

    public String consultarVendas(){

        return  "consultar vendas";
    }
}
