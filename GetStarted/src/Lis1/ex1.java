package Lis1;

import java.time.Year;
import java.util.Scanner;

public class ex1 {

//    Escreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela a
//    seguinte mensagem: "Olá 'Fulano' você tem 'X' anos"

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ano = Year.now().getValue();

        System.out.println("Digite seu nome: ");
        var nome = sc.nextLine();

        System.out.println("Digite ano de nascimento: ");
        var nascimento = sc.nextInt();

        var idade = ano - nascimento;

        System.out.println("Ola" + nome + " nascimento: " +idade);


    }
}
