package main.java.loja.sementes.verao;

import main.java.loja.domain.Moeda;
import main.java.loja.sementes.Estacao;
import main.java.loja.sementes.Semente;

public class Mirtilo extends Semente {

    private static final int valorSemente = 80;

    public Mirtilo(){
        super(Estacao.VERAO, new Moeda(valorSemente));
    }

    @Override
    public int getValor(){
        return valorSemente;
    }


    @Override
    public String toString(){
        return "Mirtilo: "+ getValorSemente() + " ouros | Estação: " + Estacao.VERAO;
    }

    public int getValorSemente() {
        return valorSemente;
    }
}
