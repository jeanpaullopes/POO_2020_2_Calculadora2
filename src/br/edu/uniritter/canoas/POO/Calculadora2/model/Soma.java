package br.edu.uniritter.canoas.POO.Calculadora2.model;

public class Soma extends OperacaoBinaria{
    private char simbolo = '+';

    public Soma() {
        this.simbolo = '+';
    }
    private float somar() {
        return operador1 + operador2;
    }
    @Override
    public float calcular() {
        return this.somar();
    }
}
