package Lis1;

import java.util.Scanner;

public class Ex3 {

//    Escreva um código que receba a base e a alturade um retângulo, calcule sua área e exiba na tela
//    fórmula: área=base X altura

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Base: ");
        var base = sc.nextDouble();

        System.out.println("Altura: ");
        var altura = sc.nextDouble();

        double area = base*altura;

        System.out.println("Area do quadrado: " + area);
    }
}
