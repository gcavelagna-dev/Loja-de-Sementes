package main.java.loja.sementes.outono;

import main.java.loja.domain.Moeda;
import main.java.loja.enums.Estacao;
import main.java.loja.sementes.Semente;

public class Abobora extends Semente {

    private static final int valorSemente = 100;

    public Abobora(){
        super(Estacao.OUTONO, new Moeda(valorSemente));
    }

    static {
        Abobora abobora = new Abobora();
        System.out.println(abobora);
    }

    @Override
    public String toString(){
        return "Abóbora: "+ getValorSemente() + " ouros | Estação: " + Estacao.OUTONO;
    }

    public int getValorSemente() {
        return valorSemente;
    }
}
