import static java.util.Objects.hash;
import static java.util.Objects.isNull;

public class User {

    private int id;
    private String nome;

    public User() {
    }

    public User(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

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
        return String.format("{'id': %s, 'nome': %s", id, nome);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (isNull(obj) || !(obj instanceof User user)) return false;
        return id == user.getId() && nome.equals(user.getNome());
    }

    @Override
    public int hashCode() {
        return hash(this.id, this.nome);
    }
}
