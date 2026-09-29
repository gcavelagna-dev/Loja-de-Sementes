package main.java.loja.sementes.verao;

import main.java.loja.domain.Moeda;
import main.java.loja.enums.Estacao;
import main.java.loja.sementes.Semente;

public class Melao extends Semente {

    private static final int valorSemente = 80;

    public Melao(){
        super(Estacao.VERAO, new Moeda(valorSemente));
    }

    static {
        Melao melao = new Melao();
        System.out.println(melao);
    }

    @Override
    public String toString(){
        return "Melão: "+ getValorSemente() + " ouros | Estação: " + Estacao.VERAO;
    }

    public int getValorSemente() {
        return valorSemente;
    }
}
