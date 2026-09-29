package main.java.loja.sementes.primavera;

import main.java.loja.domain.Moeda;
import main.java.loja.enums.Estacao;
import main.java.loja.sementes.Semente;

public class Batata extends Semente {

    private static final int valorSemente = 50;

    public Batata(){
        super(Estacao.PRIMAVERA, new Moeda(valorSemente));
    }
    static {
        Batata batata = new Batata();
        System.out.println(batata);

    }

    @Override
    public String toString(){
        return "Batata: "+ getValorSemente() + " ouros | Estação: " + Estacao.PRIMAVERA;
    }

    public int getValorSemente(){
        return valorSemente;
    }
}
