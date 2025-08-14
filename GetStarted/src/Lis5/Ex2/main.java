package Lis5.Ex2;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Saude saude = new Saude();
        Alimentacao alimentacao = new Alimentacao();
        Vestiario vestiario = new Vestiario();
        Cultura cultura = new Cultura();

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        var valor = sc.nextDouble();

        System.out.println("Digite tipo do produto: ");
        var tipo = sc.next();

        switch (tipo) {
            case "Saude" ->  saude.imposto(valor);
            case "Alimentacao" ->  alimentacao.imposto(valor);
            case "Vestiario" ->  vestiario.imposto(valor);
            case "Cultura" ->  cultura.imposto(valor);
        }
    }
}
