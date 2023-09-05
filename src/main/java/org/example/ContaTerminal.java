package org.example;

import java.util.Scanner;
/*
* @author: Ranelho
* */
public class ContaTerminal {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.print("Por favor, digite o número da conta: ");
        numero = scanner.nextInt();
        System.out.print("Por favor, digite o número da agência: ");
        agencia = scanner.next();
        System.out.print("Por favor, digite o nome do cliente: ");
        nomeCliente = scanner.next();
        System.out.print("Por favor, digite o saldo da conta: ");
        saldo = scanner.nextDouble();

        System.out.println(
                "Olá, " + nomeCliente + ". Obrigado por criar uma conta em nosso banco. Sua agência é " + agencia +
                        ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque."
        );
    }
}