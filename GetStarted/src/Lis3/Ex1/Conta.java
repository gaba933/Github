package Lis3.Ex1;

import java.util.Scanner;

public class Conta {

    public String titular;
    public double saldo;
    public double credito;
    public double divida;

    public Conta(String titular, Double saldo) {
        this.saldo = saldo;
        this.titular = titular;
        definirCredito(saldo);
        this.divida = 0;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getCredito() {
        return credito;
    }

    public void setCredito(Double credito) {
        this.credito = credito;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getDivida() {
        return divida;
    }

    public void setDivida(double divida) {
        this.divida = divida;
    }

    public static Conta criar(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do titular: ");
        String titular = sc.nextLine();

        System.out.println("Digite o saldo do titular: ");
        double saldo = sc.nextDouble();


        return new Conta(titular, saldo);

    }

    public void definirCredito(double saldo){

        if (saldo <= 500){
            setCredito(50.0);
        } else if (saldo > 500) {
            setCredito(saldo*0.5);
        }
    }

    public void depositar(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor a ser depositado");
        var valor = sc.nextDouble();

        if (getDivida() > 0){

            var valorDivida = getDivida() + (getDivida() * 0.2);

            if( valor >= valorDivida ){
                valor -= valorDivida;
                System.out.println("valor descontado da divida"+ valorDivida);
                setDivida(0);
            } else {
                var valorDescontado = valor / 1.2;
                setCredito(getCredito() - valorDescontado);
                System.out.println("Valor usado para pagar divida");
                System.out.println("divida atual: " + getCredito());
                valor = 0;
            }

            setSaldo(getSaldo() + valor);
            System.out.printf("Depósito realizado. Saldo atual: R$ %.2f\n", getSaldo());


        } else {
            setSaldo(getSaldo() + valor);
            System.out.println("Saldo atual: " + getSaldo());
        }

    }

    public void sacar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor a ser sacado");
        var valor = sc.nextDouble();

        if (this.saldo < valor){
            System.out.println("Saldo insuficiente entrada em credito");
            var creditoAtual = getCredito() - getDivida();
            if((this.saldo + creditoAtual) < valor){
                System.out.println("credito insuficiente ");
            } else {
                setDivida(valor - this.saldo);
                setSaldo(0.0);
                System.out.println("Saldo atual: " + getSaldo());
                System.out.println("divida atual: " + getDivida());
            }
        } else  {
            setSaldo(getSaldo() - valor);
            System.out.println("Saldo atual: " + getSaldo());
        }
    }

    public void verificarUsoChequeEspecial() {
        if (this.divida > 0) {
            System.out.printf("A conta está usando R$ %.2f do cheque especial.\n", this.divida);
        } else {
            System.out.println("A conta não está usando cheque especial.");
        }
    }

    public void consultarChequeEspecial() {
        System.out.printf("Limite do cheque especial: R$ %.2f\n", this.credito);
        System.out.printf("Cheque especial usado: R$ %.2f\n", this.divida);
    }
}
