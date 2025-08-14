import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int op;
        do {
            telaCalculadora();
            op = sc.nextInt();
            switch (op) {
                case 1 -> Soma();
                case 2 -> Subtracao();
                case 3 -> Multiplicacao();
                case 4 -> Divisao();
                case 5 -> Potencia();
                default -> Erro();

            }
        } while (op != 6);
    }

    public static void telaCalculadora() {

        System.out.println("-------------------");
        System.out.println("1. Soma");
        System.out.println("2. Subtracao");
        System.out.println("3. Multiplicacao");
        System.out.println("4. Divisao");
        System.out.println("5. potencia");
        System.out.println("6. sair");
        System.out.println("------------------");

    }

    public static void Soma() {
        Scanner sc = new Scanner(System.in);

        double soma = 0;
        while (true) {
            System.out.println("Digite um numero: ");
            String valor = sc.nextLine();

            if (valor.isEmpty()) break;

            soma += Double.parseDouble(valor);

        }

        System.out.println("Resultado: " + soma);

    }

    public static void Subtracao() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        String valor = sc.nextLine();

        double subtracao = Double.parseDouble(valor);
        while (true) {
            System.out.println("Digite um numero: ");
            valor = sc.nextLine();

            if (valor.isEmpty()) break;

            subtracao -= Double.parseDouble(valor);

        }

        System.out.println("Resultado: " + subtracao);

    }

    public static void Multiplicacao() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        String valor = sc.nextLine();

        double multiplicacao = Double.parseDouble(valor);
        while (true) {
            System.out.println("Digite um numero: ");
             valor = sc.nextLine();

            if (valor.isEmpty()) break;

            multiplicacao *= Double.parseDouble(valor);
        }

        System.out.println("Resultado: " + multiplicacao);
    }

    public static void Divisao() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        String valor = sc.nextLine();

        double divisao = Double.parseDouble(valor);

        while (true) {
            System.out.println("Digite um numero: ");
            valor = sc.nextLine();

            if (valor.isEmpty()) break;

            divisao /= Double.parseDouble(valor);
        }

        System.out.println("Resultado: " + divisao);
    }

    public static void Potencia() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Digite um numero: ");
            String valor = sc.nextLine();

            double base = Double.parseDouble(valor);

            System.out.println("Difite expoente: ");
            valor = sc.nextLine();

            double expoente = Double.parseDouble(valor);

            double resultado = Math.pow(base, expoente);
            System.out.println("Resultado: " + resultado);

            if (valor.isEmpty()) break;

        }

    }

    public static void Erro(){
        System.out.println("ERRO");
    }


}