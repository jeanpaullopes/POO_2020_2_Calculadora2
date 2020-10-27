package br.edu.uniritter.canoas.POO.Calculadora2;

import br.edu.uniritter.canoas.POO.Calculadora2.Controller.CalculadoraController;
import br.edu.uniritter.canoas.POO.Calculadora2.view.CalculadoraView;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        disparaCalculadora();
    }
    public static void disparaPoesia() {
        System.out.println("aqui iria sair uma bela poesia");
    }
    public static void disparaCalculadora() {
        CalculadoraController calcControl = new CalculadoraController();
        calcControl.tacalePauMarcoVeio();
    }
}
