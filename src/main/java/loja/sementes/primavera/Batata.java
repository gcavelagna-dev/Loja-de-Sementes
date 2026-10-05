package main.java.loja.sementes.primavera;

import main.java.loja.domain.Moeda;
import main.java.loja.sementes.Estacao;
import main.java.loja.sementes.Semente;

public class Batata extends Semente {

    private static final int valorSemente = 50;

    public Batata() {
        super(Estacao.PRIMAVERA, new Moeda(valorSemente));
    }


    @Override
    public String toString() {
        return "Batata: " + getValorSemente() + " ouros | Estação: " + Estacao.PRIMAVERA;
    }

    @Override
    public int getValor() {
        return valorSemente;
    }

    public int getValorSemente() {
        return valorSemente;
    }
}
