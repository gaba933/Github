package lis2;

import java.util.Scanner;

public class Ex1 {

//    Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero: ");
        var numero = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= 10; i++) {

            int res = i * numero;
            System.out.println(i +" * " + numero + " = " +res);

        }
    }
}
