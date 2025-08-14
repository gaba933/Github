package Lis1;

import java.util.Scanner;

public class Ex2 {

//    Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela
//    fórmula: área=lado X lado

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o lado do quadrado: ");
        var lado = sc.nextDouble();

        double area = Math.pow(lado, 2);

        System.out.println("Area do quadrado: " + area);

    }
}
