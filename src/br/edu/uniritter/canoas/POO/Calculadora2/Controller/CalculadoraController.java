package br.edu.uniritter.canoas.POO.Calculadora2.Controller;

import br.edu.uniritter.canoas.POO.Calculadora2.model.*;
import br.edu.uniritter.canoas.POO.Calculadora2.view.CalculadoraView;

public class CalculadoraController {
    Operacao[] operacoes;
    public CalculadoraController() {
        operacoes = new Operacao[4];
        operacoes[0] = new Soma();
        operacoes[1] = new Subtracao();
        operacoes[3] = new Fatorial();

    }
    private Operacao getOperacao(char op) {
        Operacao operacao = null;
        switch (op) {
            case '+':
                operacao = operacoes[0];
                break;
            case '-':
                operacao = operacoes[1];
                break;
            case '!':
                operacao = operacoes[3];
                break;

            default:
                System.out.println("operacao não implementada!");
        }
        return operacao;
    }
    public  void tacalePauMarcoVeio() {
        // cria o view para fazer a inteface com o usuário
        CalculadoraView calcView = new CalculadoraView(false);
        //obter da inteface o primeiro operador
        float op1  = calcView.mostraInicioOperacao();
        //calcView.trocaModo();
        // obtem da interface a operação
        char simboloOperacao = calcView.selecionaOperacao();
        //busca o objeto Operacao correspondende a operação escolhida
        Operacao objOperacao = getOperacao(simboloOperacao);
        objOperacao.setOperador1(op1);
        //o teste para saber se o objOperacao é um objeto OperacaoBinaria
        if (objOperacao instanceof OperacaoBinaria ) {
            float op2 = calcView.informaSegundoOperador();
            ((OperacaoBinaria) objOperacao).setOperador2(op2);
        }
        // executa o cálculo na operação e o apresenta
        calcView.mostraResultado(objOperacao.calcular());

    }
}
