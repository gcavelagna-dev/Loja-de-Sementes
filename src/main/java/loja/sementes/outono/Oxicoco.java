package main.java.loja.sementes.outono;

import main.java.loja.domain.Moeda;
import main.java.loja.sementes.Estacao;
import main.java.loja.sementes.Semente;

public class Oxicoco extends Semente {

    private static final int valorSemente = 240;

    public Oxicoco() {
        super(Estacao.OUTONO, new Moeda(valorSemente));
    }

    @Override
    public String toString() {
        return "Oxicoco: " + getValorSemente() + " ouros | Estação: " + Estacao.OUTONO;
    }

    public int getValorSemente() {
        return valorSemente;
    }
}
