package SET;

import java.util.Objects;

import static java.util.Objects.isNull;

public class User {

    private int id;

    private String nome;

    public User(int id, String nome) {}

    public User(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", nome=" + nome + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (isNull(obj) || !(obj instanceof User)) return false;
        return id == ((User)obj).id && nome.equals(((User)obj).nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.nome);
    }

}
