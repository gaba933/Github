package Lis3.Ex1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Conta conta = Conta.criar();
        int op;

        do {
            System.out.println("======Qual operacao=====");
            System.out.println("1. Consultar saldo");
            System.out.println("2. consultar cheque especial ");
            System.out.println("3. Sacar ");
            System.out.println("4. Consultar cheque");
            System.out.println("5. Depositar");
            System.out.println("0. Sair");
            op = sc.nextInt();

            switch (op) {
                case 1 -> System.out.println("Saldo: R$ " + conta.getSaldo());
                case 2 -> conta.consultarChequeEspecial();
                case 3 -> conta.sacar();
                case 4 -> conta.verificarUsoChequeEspecial();
                case 5 -> conta.depositar();
                case 0 -> System.out.println("saindo");
                default -> System.out.println("invalido");
            };

        } while (op != 0);

    }



}
