package main.java.loja.sementes.inverno;

import main.java.loja.domain.Moeda;
import main.java.loja.enums.Estacao;
import main.java.loja.sementes.Semente;

public class MelaoPoeira extends Semente {

    private static final int valorSemente = 10;

    public MelaoPoeira() {
        super(Estacao.INVERNO, new Moeda(valorSemente));
    }

    static {
        MelaoPoeira melaoPoeira = new MelaoPoeira();
        System.out.println(melaoPoeira);
    }

    @Override
    public String toString() {
        return "Melão-Poeira: " + getValorSemente() + " ouros | Estação: " + Estacao.INVERNO;
    }

    public int getValorSemente() {
        return valorSemente;
    }
}
