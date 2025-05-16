package com.mycompany;

import java.util.Scanner;

public class Aula06Condicional {
    public static void main(String[] args) {
        /**
         * Estrutura condicional simples (if, else)
         *
         * pode ser lida como: SE, SENÃO
         *
         * a condição verdadeira é executada dentro do if
         */
        int num = 3;

        // % é o resto da divisão
        // comparando com 0, significa que o número é par
        if (num % 2 == 0) {
            System.out.println(num + " é par !!");
        } else {
            System.out.println(num + " é ímpar !!");
        }

        /**
         * Estrutura condicional composta (if, else if, else)
         *
         * nesse tipo de estrutura podemos ter mais de uma
         * verificação caso o primeiro if não seja satisfeito
         *
         * um exemplo prático pode ser a verificação do IMC
         */

        double imc = 24.0;

        if (imc < 18.5) {
            System.out.println("Está abaixo do peso");
        } else if (imc >= 18.5 && imc < 24.5) {
            System.out.println("Está com peso ideal");
        } else {
            System.out.println("Está com obesidade");
        }

        /**
         * Estrutura Switch/Case
         *
         * É similar ao if/else, com a diferença que ele considera valores predefinidos
         * que serão observados em cada case (Caso)
         *
         * na sua estrutura ele analisa uma variável, e considera dentre suas opções
         * qual
         * considera.
         * cada estrutura case deve conter um break, para encerrar a execução.
         *
         * o default (padrão) é executado, caso nenhum case tenha sido executado.
         *
         * um exemplo seria uma pergunta de múltipla escolha.
         */

        System.out.println(
                "1) Verde, Amarelo e Azul, são cores que fazem parte da bandeira de qual país?\\n" +
                        "(a) Argentina\\n" +
                        "(b) Paraguai\\n" +
                        "(c) Brasil\\n" +
                        "(d) Alemanha\\n\\nDigite uma opção: ");

        Scanner scan = new Scanner(System.in);
        String opcao = scan.nextLine();
        switch (opcao) {
            case "a":
                System.out.println("Resposta incorreta !!");
                break;
            case "b":
                System.out.println("Resposta incorreta !!");
                break;
            case "c":
                System.out.println("Resposta correta !!");
                break;
            case "d":
                System.out.println("Resposta incorreta !!");
                break;
            default:
                System.out.println("Opção inexistente !!");
                break;
        }

    }
}
