package br.com.projeto.banco.model;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void transferencia(Conta destino, double valor) {
        if (sacar(valor)) {
            destino.depositar(valor);
            historico.add("Transferência enviada: " + valor);
            destino.getHistorico().add("Transferência recebida: " + valor);
        } else {
            System.out.println("Saldo insuficiente para transferência!");
        }
    }
}