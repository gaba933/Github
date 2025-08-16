package SET;

import java.util.HashSet;
import java.util.Set;

public class main {
    public static void main(String[] args) {

        Set<User> users = new HashSet<>();

        users.add(new User(1, "Juan"));
        users.add(new User(2, "Pedro"));
        users.add(new User(3, "Maria"));


    }
}
