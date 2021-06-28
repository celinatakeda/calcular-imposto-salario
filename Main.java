package com.kazue.projeto.exercicios.exerc3;

public class Main {
    public static void main(String[] args) {

        Funcionarios gerente = new Funcionarios(4000.00, 0.1);
        Funcionarios supervisor = new Funcionarios(3000.00, 0.05);
        Funcionarios atendente = new Funcionarios(2000.00, 0.01);

        System.out.println("Gerente paga imposto: " +gerente.calcularImposto());
        System.out.println("Supervisor paga imposto: " + supervisor.calcularImposto());
        System.out.println("Atendente paga imposto: "+atendente.calcularImposto());
    }
}
