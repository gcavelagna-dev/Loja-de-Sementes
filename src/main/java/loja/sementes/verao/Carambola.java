package main.java.loja.sementes.verao;

import main.java.loja.domain.Moeda;
import main.java.loja.enums.Estacao;
import main.java.loja.sementes.Semente;


public class Carambola extends Semente {

    private static final int valorSemente = 400;

    public Carambola(){
        super(Estacao.VERAO, new Moeda(valorSemente));
    }

    static {
        Carambola carambola = new Carambola();
        System.out.println(carambola);
    }

    @Override
    public String toString(){
        return "Carambola: "+ getValorSemente() + " ouros | Estação: " + Estacao.VERAO;
    }

    public int getValorSemente() {
        return valorSemente;
    }
}

