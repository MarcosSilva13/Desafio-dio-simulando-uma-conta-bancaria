package com.desafio;

import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta: ");
        int number = scanner.nextInt();

        System.out.println("\nPor favor, digite o número da Agência: ");
        scanner.nextLine();
        String agency = scanner.nextLine();

        System.out.println("\nPor favor, digite o nome do Cliente: ");
        String clientName = scanner.nextLine();

        System.out.println("\nPor favor, digite o valor do Saldo: ");
        BigDecimal balance = scanner.nextBigDecimal();

        System.out.println("\nOlá " + clientName + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                agency + ", conta " + number + " e seu saldo " + balance + " já está disponível para saque.");

    }
}
