package br.edu.uniritter.canoas.POO.Calculadora2.model;

public class Fatorial extends OperacaoUnitaria{

    public Fatorial() {
        this.simbolo  =  '!';
    }
    @Override
    public float calcular() {
        if (operador1 == 2) {
            System.out.println("fatorial de "+this.operador1+" = "+2);
            return 2;
        } else   {
        Fatorial fat = new Fatorial();
            System.out.println("operador1 - > "+this.operador1);
        fat.setOperador1(this.operador1 - 1);
            System.out.println("fatorial de "+fat.operador1+" ->");
        float ret = this.operador1 * fat.calcular();
            System.out.println("fatorial de "+this.operador1+" = "+ret);
        return ret;
    }
    }
}
