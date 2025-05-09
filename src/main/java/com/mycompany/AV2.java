package com.mycompany;

public class AV2 {
    public static void main(String[] args) {
        //01
        int pai1 = 46;
        int mae1 = 45;
        int filho1 = 20;
        int filha1 = 9;

        int soma = pai1 + mae1 + filho1 + filha1;
        int media = soma / 4;
        System.out.println("A média de idade da família, em anos é de: " + media); 

        //02
        double area_ao_quadrado1 = 625.0;
        double pi_1 = 3.14;

        double area_1 = area_ao_quadrado1 * pi_1;
        System.out.println("A área desse  círculo é: " + area_1 + "centímetros");

        //03
        double valor_1 = 1200.00;
        double porcentagem_desconto1 = 35.0;

        double valor_2 = valor_1 * porcentagem_desconto1;
        double desconto_1 = valor_2 / 100;
        double novo_valor1 = valor_1 + desconto_1;
        System.out.println("O novo valor do produto é : " + novo_valor1 + "reais");


        //04
        double valor_3 = 850.00;
        double porcentagem_desconto2 = 30.0;

        double valor_4 = valor_3 * porcentagem_desconto2;
        double desconto_2 = valor_4 / 100;
        double novo_valor2 = valor_3 - desconto_2;
        System.out.println("O novo valor do produto é : " + novo_valor2 + "reais");



    
    }
    

}

