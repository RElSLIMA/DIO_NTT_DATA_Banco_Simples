package br.com.projeto.banco.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Conta {
    protected Cliente cliente;
    protected double saldo;
    protected List<String> historico = new ArrayList<>();

    public Conta(Cliente cliente) {
        this.cliente = cliente;
        this.saldo = 0;
    }

    public void depositar(double valor) {
        saldo += valor;
        historico.add("Depósito: " + valor);
    }

    public boolean sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            historico.add("Saque: " + valor);
            return true;
        }
        return false;
    }

    public void mostrarExtrato() {
        System.out.println("Extrato da conta de " + cliente.getNome());
        historico.forEach(System.out::println);
        System.out.println("Saldo atual: " + saldo);
    }

    public abstract void transferencia(Conta destino, double valor);
}