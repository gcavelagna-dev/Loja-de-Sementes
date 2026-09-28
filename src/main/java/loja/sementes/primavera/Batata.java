package main.java.loja.sementes.primavera;

import main.java.loja.domain.Moeda;
import main.java.loja.enums.Estacao;
import main.java.loja.sementes.Semente;

public class Batata extends Semente {

    private static final Moeda moeda = new Moeda(40);

    public Batata(){
        super(Estacao.PRIMAVERA);
        moeda.setOuro(40);
    }
//está só aparecendo a estação, a moeda ainda está = 0;
    static{
        Batata batata = new Batata();
        System.out.println(batata.toString());
    }

    @Override
    public String toString(){
        return "Batata: " + moeda.getOuro() + " ouros | Estação: " + Estacao.PRIMAVERA;
    }


}
