package br.com.projeto.factoryMethod.mensalista;

import br.com.projeto.factoryMethod.calculadoraImposto.CalculadoraImposto;

public class CalculadoraImpostoMensalista implements CalculadoraImposto{

    private static final int VALOR_HORA = 10;
    private static final double PORCENTAGEM_DE_DESCONTO = 0.10;
    private double valorSalario;
    private double quantidadeHorasExtras;

    public CalculadoraImpostoMensalista(double valorSalario, double quantidadeHorasExtras) {
        this.valorSalario = valorSalario;
        this.quantidadeHorasExtras = quantidadeHorasExtras;
    }

    @Override
    public double calcularImposto() {
        return (valorSalario + (quantidadeHorasExtras * VALOR_HORA)) * PORCENTAGEM_DE_DESCONTO ;
    }

}
