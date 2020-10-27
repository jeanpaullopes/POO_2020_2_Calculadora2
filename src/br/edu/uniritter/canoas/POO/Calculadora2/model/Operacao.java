package br.edu.uniritter.canoas.POO.Calculadora2.model;

public abstract class Operacao {
    protected char simbolo;
    protected float operador1;

    public void setOperador1(float operador1) {
        this.operador1 = operador1;
    }

    public abstract float calcular();

    public char getSimbolo() {
        return this.simbolo;
    }

}
