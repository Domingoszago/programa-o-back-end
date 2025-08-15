package com.mycompany.poo.avaliacao;

import java.util.ArrayList;
import java.util.List;

public class ContaBancaria {
    private int numeroConta;
    private String titular;
    private double saldo;
    private boolean contaAtiva;
    private List<String> extrato;

    public ContaBancaria(int numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0.0;
        this.contaAtiva = true;
        this.extrato = new ArrayList<>();
        this.extrato.add("Conta aberta com sucesso.");
    }

    // Métodos para acesso aos atributos (Getters)
    public int getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isContaAtiva() {
        return contaAtiva;
    }

    // Métodos de operações bancárias
    public boolean fecharConta() {
        if (this.saldo == 0) {
            this.contaAtiva = false;
            this.extrato.add("Conta fechada.");
            System.out.println("Conta " + this.numeroConta + " de " + this.titular + " foi fechada com sucesso.");
            return true;
        } else {
            System.out.println("Não é possível fechar a conta. O saldo deve ser zero.");
            return false;
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            this.extrato.add("Depósito de R$" + valor);
            System.out.println("Depósito de R$" + valor + " realizado. Novo saldo: R$" + this.saldo);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            this.extrato.add("Saque de R$" + valor);
            System.out.println("Saque de R$" + valor + " realizado. Novo saldo: R$" + this.saldo);
            return true;
        } else {
            System.out.println("Saque inválido. O valor deve ser maior que zero e menor ou igual ao saldo.");
            return false;
        }
    }

    public boolean transferir(ContaBancaria contaDestino, double valor) {
        if (this.sacar(valor)) {
            contaDestino.depositar(valor);
            this.extrato.add("Transferência de R$" + valor + " para a conta " + contaDestino.getNumeroConta());
            System.out.println("Transferência de R$" + valor + " para a conta " + contaDestino.getNumeroConta()
                    + " realizada com sucesso.");
            return true;
        }
        return false;
    }

    public void mostrarSaldo() {
        System.out.println("Saldo atual da conta " + this.numeroConta + ": R$" + this.saldo);
    }

    public void mostrarExtrato() {
        System.out.println("\n--- Extrato da Conta " + this.numeroConta + " ---");
        for (String operacao : extrato) {
            System.out.println("- " + operacao);
        }
    }

}