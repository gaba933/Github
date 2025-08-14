package lis2;

import java.util.Scanner;

public class Ex2 {

//    Escreva um código onde o usuário entra com sua altura e peso, seja feito o calculo do
//    seu IMC(IMC = peso/(altura * altura)) e seja exibida a mensagem de acordo com o resultado:
//    Se for menor ou igual a 18,5 "Abaixo do peso";
//    se for entre 18,6 e 24,9 "Peso ideal";
//    Se for entre 25,0 e 29,9 "Levemente acima do peso";
//    Se for entre 30,0 e 34,9 "Obesidade Grau I";
//    Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
//    Se for maior ou igual a 40,0 "Obesidade III (Mórbida)";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite peso: ");
        double peso = sc.nextDouble();

        System.out.println("Digite altura: ");
        double altura = sc.nextDouble();

        double IMC = peso/(altura*altura);

        if(IMC <= 18.5){
            System.out.println("Abaixo do peso");
        } else if(IMC >= 18.5 && IMC <= 24.9){
            System.out.println("Peso ideal");
        } else if(IMC >= 25 && IMC <= 29.9){
            System.out.println("Levemente acima do peso");
        } else if(IMC >= 30 && IMC <= 34.9){
            System.out.println("Obesidade grau");
        } else if(IMC >= 35 && IMC <= 39.9){
            System.out.println("Obesidade Grau II (Severa)");
        } else if(IMC >= 40 && IMC <= 49.9){
            System.out.println("Obesidade III (Mórbida)");
        }
    }
}
