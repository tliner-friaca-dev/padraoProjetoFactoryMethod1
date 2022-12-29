package br.com.projeto.factoryMethod.horista;

import br.com.projeto.factoryMethod.calculadoraImposto.CalculadoraImposto;
import br.com.projeto.factoryMethod.funcionario.Funcionario;

public class Horista extends Funcionario {

    private double valorHora;
    private int quantidadeHoras;

    @Override
    protected CalculadoraImposto getCalculadoraImposto() {
        return new CalculadoraImpostoHorista(valorHora, quantidadeHoras);
    }

    @Override
    public double salarioBruto() {
        return getValorHora() * getQuantidadeHoras();
    }

    public double getValorHora() {
        return this.valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getQuantidadeHoras() {
        return this.quantidadeHoras;
    }

    public void setQuantidadeHoras(int quantidadeHoras) {
        this.quantidadeHoras = quantidadeHoras;
    }

}
