package main.java.loja.sementes.primavera;

import main.java.loja.domain.Moeda;
import main.java.loja.enums.Estacao;
import main.java.loja.sementes.Semente;

public class Chirivia extends Semente {

    private static final int valorSemente = 20;

    public Chirivia() {
        super(Estacao.PRIMAVERA, new Moeda(valorSemente));
    }

    static {
        Chirivia chirivia = new Chirivia();
        System.out.println(chirivia);
    }

    @Override
    public String toString() {
        return "Chirívia: " + getValorSemente() + " ouros | Estação: " + Estacao.PRIMAVERA;
    }

    public int getValorSemente() {
        return valorSemente;
    }
}
