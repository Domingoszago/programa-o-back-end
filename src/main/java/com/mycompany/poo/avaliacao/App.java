package Avaliacao.backend;

public class App {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.numero = 768909;
        conta.titular = "joao";
        conta.depositar(valor:90);

        ContaBancaria conta2 = new ContaBancaria();
        conta2.numero = 76563;
        conta2.titular = "maria";
        conta2.depositar(valor:30);

        conta.transferencia(conta2, valor:140);

        conta.exibirSaldo();
        conta2.exibirSaldo();
    }
}