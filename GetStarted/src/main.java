import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class main {
    public static void main(String[] args) {

//        List<User> users = new ArrayList<>();
//
//        var user = new User(1, "Gabriel");
//        users.add(user);
////        verificar sem um elemento esta na lista
//        System.out.println(users.contains(user));
//
//        System.out.println(users.size());
////        verifica se a lista esta vazio
//        System.out.println(users.isEmpty());

//        Set<User> users = new HashSet<>();
//
//        users.add(new User(1, "Gabriel"));
//        users.add(new User(2, "laura"));
//        users.add(new User(3, "Julia"));
//        users.add(new User(4, "Plinio"));
//        users.add(new User(5, "Vini"));
//
//        System.out.println(users.contains(new User(1, "Gabriel")));
////        O Valor q o hash retorna e o valor da tabela hash nao pelo nunero de memoria
//        System.out.println(new User(1, "Gabriel").hashCode());
//
////        o remoAll e para remover mais de uma valo de uma vez
//        System.out.println(users.removeAll(List.of(new User(1, "Gabriel"), new User(2, "laura"))));
//        // remove um por vez
//        System.out.println(users.remove(new User(3, "Julia")));
////        remove segunda a condicao
//        System.out.println(users.removeIf(user -> user.getNome() == "Plinio"));
//        users.forEach(System.out::println);

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "one");

        map.forEach((s, e) -> System.out.println(s + " " + e));

        System.out.println(map.get(2));
        System.out.println(map.hashCode());
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("two"));


    }
}
