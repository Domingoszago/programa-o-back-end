package com.mycompany;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        int numero = 1;

        while (numero != 0) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Digite um número: (0 para parar): ");
            numero = scan.nextInt();

            System.out.println("\nTabuada do " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                int resultado = numero * i;
                System.out.println(numero + " x " + i + " = " + resultado);
            }

            
    
        }
    }
}
