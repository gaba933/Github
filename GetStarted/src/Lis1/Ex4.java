package Lis1;

import java.util.Scanner;

public class Ex4 {

//    Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome1: ");
        var nome1 = sc.nextLine();

        System.out.println("Digite a idade da pessoa1: ");
        var idade1 = Integer.parseInt(sc.nextLine());

        System.out.println("Digite o nome2: ");
        var nome2 = sc.nextLine();

        System.out.println("Digite a idade da pessoa2: ");
        var idade2 = Integer.parseInt(sc.nextLine());

        int diferenca = 0;

        if(idade2 >= idade1){
            diferenca = idade2 - idade1;
        } else{
            diferenca = idade1 - idade2;
        }

        System.out.println("Diferenca de idade entre " + nome1 + " e " + nome2 + " é: " + diferenca);

    }
}
