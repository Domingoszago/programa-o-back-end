 package com.mycompany;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua altura em metros (ex: 1.75): ");
        double altura = scanner.nextDouble();

        System.out.print("Digite o seu peso em quilogramas (ex: 70.5): ");
        double peso = scanner.nextDouble();

        // Calcular o IMC
        double imc = peso / (altura * altura);

        System.out.println("Classificação do IMC:");
        if (imc < 16) {
            System.out.println("Magreza grau III");
        } else if (imc <= 16.9) {
            System.out.println("Magreza grau II");
        } else if (imc <= 18.4) {
            System.out.println("Magreza grau I");
        } else if (imc <= 24.9) {
            System.out.println("Eutrofia");
        } else if (imc <= 29.9) {
            System.out.println("Pré-obesidade");
        } else if (imc <= 34.9) {
            System.out.println("Obesidade moderada (grau I)");
        } else if (imc <= 39.9) {
            System.out.println("Obesidade severa (grau II)");
        } else {
            System.out.println("Obesidade muito severa (grau III)");
        }

    }
}
