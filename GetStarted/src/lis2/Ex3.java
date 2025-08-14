package lis2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex3 {

//    Escreva um código que o usuário entre com um primeiro número,
//    um segundo número maior que o primeiro e escolhe entre a opção par e impar,
//    com isso o código deve informar todos os números pares ou ímpares (de acordo com a seleção inicial)
//    no intervalo de números informados, incluindo os números informados e em ordem decrescente;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite numero 1: ");
        var n1 = Integer.parseInt(sc.nextLine());

        System.out.println("Digite numero 2: ");
        var n2 = Integer.parseInt(sc.nextLine());

        System.out.println("Digite impar/par: ");
        String pi = sc.nextLine().toLowerCase();

        if (pi.equals("par")){
            List<Integer> lista = new ArrayList<>();

            for(int i = 0; i<(n2-n1); i++){
                if((n1+i)%2==0){
                    lista.add(n1+i);
                }
            }

            System.out.println(lista);
        } else if(pi.equals("impar")){
            List<Integer> lista = new ArrayList<>();

            for(int i = 0; i<(n2-n1); i++){
                if((n1+i)%2==1){
                    lista.add(n1+i);
                }
            }

            System.out.println(lista);
        } else {
            System.out.println("Invalid input: ");
        }


    }

}
