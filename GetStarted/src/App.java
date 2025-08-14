import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

//    testando vetores: vetores tem que ter tamanho determinado e sao fixos
        int[] vetor = {11,111};
        System.out.println(vetor[0]);
        System.out.println(vetor[1]);
        System.out.println(vetor.length);

//        em array e o funcinamento de lista
        List<Integer> array = new ArrayList<Integer>();
        array.add(vetor[0]);
        array.add(vetor[1]);
        array.add(222);
        array.forEach(System.out::println);
        System.out.println(array.size());

//        geralmente melhor para muitas implementacoes
        List<Integer> arraylinked = new LinkedList<>();


    }
}
