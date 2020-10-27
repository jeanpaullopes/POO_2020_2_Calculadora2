package br.edu.uniritter.canoas.POO.Calculadora2.view;

import javax.swing.*;
import java.util.Scanner;

public class CalculadoraView {
    private Scanner scan;
    private boolean grafica;

    public CalculadoraView(boolean modoGrafico) {
        this.scan = new Scanner(System.in);
        this.grafica = modoGrafico;
    }

    public float mostraInicioOperacao() {
        if (grafica) {
            return mostraInicioOperacaoGrafico();
        } else {
            return mostraInicioOperacaoTexto();
        }
    }
    private float mostraInicioOperacaoGrafico() {
        String entrada = JOptionPane.showInputDialog("Informe o primeiro Operador:");
        return Float.parseFloat(entrada);
    }
    private float mostraInicioOperacaoTexto() {
        System.out.println("informe o primeiro operador:");
        return scan.nextFloat();
    }
    public float informaSegundoOperador() {
        if (grafica) {
            return informaSegundoOperadorGrafico();
        } else {
            return informaSegundoOperadorTexto();
        }
    }
    private float informaSegundoOperadorGrafico() {

        String entrada = JOptionPane.showInputDialog("Informe o segundo Operador:");
        return Float.parseFloat(entrada);
    }
    private float informaSegundoOperadorTexto() {
        System.out.println("informe o segundo operador:");
        return scan.nextFloat();
    }

    public char selecionaOperacao() {
        if (grafica) {
            return selecionaOperacaoGrafico();
        } else {
            return selecionaOperacaotexto();
        }
    }
    private char selecionaOperacaoGrafico() {
        String entrada = JOptionPane.showInputDialog("escolha a operação: \noperações disponíveis: + - * /");
        return entrada.charAt(0);
    }
    private char selecionaOperacaotexto() {
        System.out.println("operações disponíveis: + - * /");
        System.out.println("escolha a operacao:");
        String entrada = scan.next();
        return entrada.charAt(0);
    }

    public void mostraResultado(float valor) {
        if (grafica) {
            mostraResultadografico(valor);
        } else {
            mostraResultadoTexto(valor);

        }

        }
    public void mostraResultadografico(float valor) {
        JOptionPane.showMessageDialog(null,"o Resultado é : "+valor);
    }
    public void mostraResultadoTexto(float valor) {
        System.out.println("o Resultado é : "+valor);
    }
    public void trocaModo() {
        this.grafica = ! this.grafica;
    }
}
