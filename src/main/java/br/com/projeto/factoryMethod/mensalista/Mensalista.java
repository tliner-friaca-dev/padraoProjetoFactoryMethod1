package br.com.projeto.factoryMethod.mensalista;

import br.com.projeto.factoryMethod.calculadoraImposto.CalculadoraImposto;
import br.com.projeto.factoryMethod.funcionario.Funcionario;

public class Mensalista extends Funcionario {

    private static final int VALOR_HORA_EXTRA = 10;
    private double valorSalario;
    private double quantidadeHorasExtras;

    @Override
    protected CalculadoraImposto getCalculadoraImposto() {
        return new CalculadoraImpostoMensalista(valorSalario, quantidadeHorasExtras);
    }

    @Override
    public double salarioBruto() {
        return valorSalario + (quantidadeHorasExtras * VALOR_HORA_EXTRA);
    }

    public double getValorSalario() {
        return this.valorSalario;
    }

    public void setValorSalario(double valorSalario) {
        this.valorSalario = valorSalario;
    }

    public double getQuantidadeHorasExtras() {
        return this.quantidadeHorasExtras;
    }

    public void setQuantidadeHorasExtras(double quantidadeHorasExtras) {
        this.quantidadeHorasExtras = quantidadeHorasExtras;
    }
    
}
