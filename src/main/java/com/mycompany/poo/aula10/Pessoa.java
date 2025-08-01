package com.mycompany.poo.aula10;

public class Pessoa {
    /*
     * Modificadores de acesso
     * 
     * Quando trabalhamos com conceito de POO, utilizamos  modificadores de acesso, para dar segurança 
     * Para dar segurança a nossa classe.
     * 
     * Utilizamos elas como prefixo para:
     * -Classes
     * -Iterface
     * -Atributos
     * -Métodos
     *
     */
    public String nome; // Publico, é visivel em qualquer classe
    protected int idade; // Protegido, é visial somente em classes filhas (Herança)
    private double salario; // Privado, é visivel somente dentro da propria classe.
    
   public void exibirdados() {
        System.out.println("x:\"--- Dados da pessoa ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura (m): " + altura);


}

