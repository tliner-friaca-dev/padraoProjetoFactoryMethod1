package br.com.projeto.factoryMethod.horista;

import br.com.projeto.factoryMethod.calculadoraImposto.CalculadoraImposto;

public class CalculadoraImpostoHorista implements CalculadoraImposto {

    private static final double PORCENTAGEM_DE_DESCONTO = 0.10;
    private double valorHora;
    private int quantidadeHoras;

    public CalculadoraImpostoHorista(double valorHora, int quantidadeHoras) {
        this.valorHora = valorHora;
        this.quantidadeHoras = quantidadeHoras;
    }

    @Override
    public double calcularImposto() {
        return ((valorHora * quantidadeHoras) * PORCENTAGEM_DE_DESCONTO);
    }

}
