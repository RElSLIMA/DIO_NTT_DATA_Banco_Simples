package br.com.projeto.banco;

import br.com.projeto.banco.model.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cliente cliente1 = new Cliente("Gabriel Reis", "12345678900");
        Conta conta1 = new ContaCorrente(cliente1);

        Cliente cliente2 = new Cliente("Maria Silva", "98765432100");
        Conta conta2 = new ContaCorrente(cliente2);

        conta1.depositar(500);
        conta1.transferencia(conta2, 200);

        conta1.mostrarExtrato();
        conta2.mostrarExtrato();

        scanner.close();
    }
}