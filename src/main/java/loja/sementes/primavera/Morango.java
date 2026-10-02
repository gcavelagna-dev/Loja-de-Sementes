package main.java.loja.sementes.primavera;

import main.java.loja.domain.Moeda;
import main.java.loja.enums.Estacao;
import main.java.loja.sementes.Semente;

public class Morango extends Semente {

    private static final int valorSemente = 100;

    public Morango() {
        super(Estacao.PRIMAVERA, new Moeda(valorSemente));
    }


    @Override
    public String toString() {
        return "Morango: " + getValorSemente() + " ouros | Estação: " + Estacao.PRIMAVERA;
    }

    public int getValorSemente() {
        return valorSemente;
    }
}
