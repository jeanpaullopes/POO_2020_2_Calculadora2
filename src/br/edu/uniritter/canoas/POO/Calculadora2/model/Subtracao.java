package br.edu.uniritter.canoas.POO.Calculadora2.model;

public class Subtracao extends OperacaoBinaria{

    public Subtracao() {
        this.simbolo = '-';
    }

    @Override
    public float calcular() {
        return operador1 - operador2;
    }
}
