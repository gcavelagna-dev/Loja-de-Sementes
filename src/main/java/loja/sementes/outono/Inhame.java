package main.java.loja.sementes.outono;

import main.java.loja.domain.Moeda;
import main.java.loja.enums.Estacao;
import main.java.loja.sementes.Semente;

public class Inhame extends Semente {

    private static final int valorSemente = 60;

    public Inhame(){
        super(Estacao.OUTONO, new Moeda(valorSemente));
    }

    static {
        Inhame inhame = new Inhame();
        System.out.println(inhame);
    }

    @Override
    public String toString(){
        return "Inhame: "+ getValorSemente() + " ouros | Estação: " + Estacao.OUTONO;
    }

    public int getValorSemente() {
        return valorSemente;
    }
}
