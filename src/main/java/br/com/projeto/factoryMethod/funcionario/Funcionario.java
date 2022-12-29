package br.com.projeto.factoryMethod.funcionario;

import br.com.projeto.factoryMethod.calculadoraImposto.CalculadoraImposto;

public abstract class Funcionario {

    private String nome;

    protected abstract CalculadoraImposto getCalculadoraImposto();

    public abstract double salarioBruto();

    public double salarioLiquido() {
        double impostos = getCalculadoraImposto().calcularImposto();
        double salarioLiquido = salarioBruto() - impostos;

        return salarioLiquido;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
