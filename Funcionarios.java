package com.kazue.projeto.exercicios.exerc3;

public class Funcionarios {
    private Double salario;
    private Double imposto;

    public Funcionarios(double salario, double imposto) {
        setSalario(salario);
        setImposto(imposto);
    }

    public Double getSalario(){
        return salario;
    }
    public void setSalario(Double salario){
        this.salario = salario;
    }
    public Double getImposto(){
        return imposto;
    }
    public void setImposto(Double imposto){
        this.imposto= imposto;
    }

    public Double calcularImposto(){
        double vi = getSalario() * getImposto();
        return vi;
    }
}
